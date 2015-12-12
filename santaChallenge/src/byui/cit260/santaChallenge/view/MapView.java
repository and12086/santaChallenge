/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.control.MapControl;
import byui.cit260.santaChallenge.control.SleighControl;
import byui.cit260.santaChallenge.model.Actor;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Scene;
import byui.cit260.santaChallenge.model.Sleigh;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import citbyui.cit260.santaChallenge.exceptions.SleighControlException;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class MapView  {

     protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    
    public MapView() {
    }
    
     public boolean doAction() {
        //String value = (String) obj;
        this.displayMessage();
        this.displayMap();
        
        this.console.println("Enter an x coordinate below:");
        //Get the coordinates for x and y
        int xCoordinate = this.getCoordinate();
        //int intXCoordinate = Integer.parseInt(xCoordinate);

        this.console.println("Enter a y coordinate below:");
        int yCoordinate = this.getCoordinate();
        //int intYCoordinate = Integer.parseInt(yCoordinate);

        //create a new point object (combining the y and x inputs in a single point of reference)
        Point coordinates = new Point(yCoordinate, xCoordinate);
        Actor actor = SantaChallenge.getCurrentGame().getPlayer().getActor();

        try {
            MapControl.setActorToLocation(actor, coordinates);
            
        } catch (MapControlException | SleighControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }

        Scene newScene;
        Map map = SantaChallenge.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        newScene = locations[coordinates.y][coordinates.x].getScene();

        double tempMiles = newScene.getMilesFromNorthPole();

        this.console.println("\n\nSanta has successfully arrived in " + newScene.getDescription() + " and delivered 5 presents. " + 
                newScene.getDescription() + " is " + newScene.getMilesFromNorthPole() + " miles from the North Pole.");
        
        Sleigh sleigh = SantaChallenge.getCurrentGame().getSleigh();
        
        double tempFlyingSpeed = 0;
         try {
             tempFlyingSpeed = SleighControl.calcFlyingSpeed(sleigh.getNumberOfPresents(), sleigh.getNumberOfReindeer());
         } catch (SleighControlException ex) {
             Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
         }
        double time = MapControl.calcTime(tempMiles, tempFlyingSpeed);
        
        //calculate how much time in a 24 hour period Santa has left to deliver presents
        double timeRemaining = MapControl.calcTimeRemaining(tempMiles, tempFlyingSpeed);
        //set the timeRemaining into inventory
        SantaChallenge.getCurrentGame().getInventory()[GameControl.Item.timeRemaining.ordinal()].setActualAmount(timeRemaining);
        
        if(timeRemaining < 0) {
            this.console.println("Santa ran out of time!! Game over.  See you next year.");
            this.endGame();
        }
        else {
        this.console.println("\n This took Santa " + time + " hours.");  
        this.console.println("Santa only has " + timeRemaining + " hours left to deliver as many presents as he can to children all over the world.");
        return true;
        }
         return true;
    }
    
    public void displayMessage() {
        this.console.println("\n***********************************************"
                + "\n*                                             *"
                + "\n* Look at the map and decide where you        *"
                + "\n* want to deliver presents.                   *"
                + "\n*                                             *"
                + "\n* But first, you need to help Santa choose a  *"
                + "\n* healthy breakfast.                          *"
                + "\n                                              *"
                + "\n Then be sure to load the sleigh with presents *"
                + "\n* and choose the best number of reindeer.     *"
                + "\n*                                             *"
                + "\n* After all that, you can begin choosing      *"
                + "\n* locations all over the world to deliver     *"
                + "\n* presents to with Santa.                     *"
                + "\n*                                             *"
                + "\n* First you will indicate an x coordinate     *"
                + "\n* on the map, followed by a y coordinate.     *"
                + "\n*                                             *"
                + "\n***********************************************");

    }


    private int getCoordinate() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String coordinate = null;

        int doubleCoordinate = -1;
        try {
            while (!valid) {//while a valid coordinate has not been retrieved
                //prompt for an x coordinate

                //get the coordinate from the keyboard and trim off the blanks
                coordinate = this.keyboard.readLine();
                coordinate = coordinate.trim();

                //if the coordinate is invalid (less than 1 character in length)
                if (coordinate.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"Invalid entry.  Please enter a coordinate between 0 and 4.");
                    continue; //and repeat again
                }

                try {
                    doubleCoordinate = Integer.parseInt(coordinate);
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number between 0 and 4."
                            + "\n Please try again.");
                }

                if (doubleCoordinate < 0 || doubleCoordinate > 4) {
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please enter a coordinate between 0 and 4.");
                    continue;//and repeat again
                }
                valid = true; // Exit out of the repitition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        return doubleCoordinate; //return the x coordinate
    }

     private void displayMap() {

        Map map = SantaChallenge.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        this.console.println("*****************");
        this.console.println("* Map Locations *");
        this.console.println("*****************");
        this.console.println("\t" + 0 + "\t\t\t" + 1 + "\t\t\t" + 2 + "\t\t\t" + 3 + "\t\t\t" + 4);

        int noOfColumns = map.getNoOfColumns();
        int noOfRows = map.getNoOfRows();

        for (int row = 0; row < noOfRows; row++) {
            this.console.println("\n***********************************************************************************************************************" + "\n" + row);

            for (int column = 0; column < noOfColumns; column++) {
                this.console.print("|");
                Location location = locations[row][column];
                Scene scene = location.getScene();
                this.console.print(scene.getMapSymbol() + "\t\t");
//                if (!location.isVisited()) {
//                    this.console.print("--");
//                } else {
//                    this.console.print("XX");//print to indicate location has not been visited yet
//                }
            }

            this.console.print("|");//print final column divider
        }
        this.console.println("\n***********************************************************************************************************************");
        this.console.println("\n\n");
    }

    private void endGame() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }

}
