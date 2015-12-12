/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.MapControl;
import byui.cit260.santaChallenge.model.Actor;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Scene;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.PrintWriter;
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

        //create a new point object (combining the x and y inputs in a single point of reference)
        Point coordinates = new Point(xCoordinate, yCoordinate);
        Actor actor = SantaChallenge.getCurrentGame().getPlayer().getActor();

        try {
            MapControl.setActorToLocation(actor, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        
        
        return true;
    }
    
    public void displayMessage() {
        this.console.println("\n*********************************************"
                + "\n*                                           *"
                + "\n* Look at the map and decide where you      *"
                + "\n* want to go first.                         *"
                + "\n*                                           *"
                + "\n* I suggest that you feed Santa first, then *"
                + "\n* pick reindeer and load the sleigh with    *"
                + "\n* presents.                                 *"
                + "\n*                                           *"
                + "\n* Next, you can begin choosing locations    *"
                + "\n* all over the world to deliver presents to *"
                + "\n* with Santa.                               *"
                + "\n*                                           *"
                + "\n* First you will indicate an x coordinate   *"
                + "\n* on the map, followed by a y coordinate.   *"
                + "\n*                                           *"
                + "\n*********************************************");

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
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please enter a coordinate between 0 and 4.");
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
        this.console.println("\t" + 0 + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);

        int noOfColumns = map.getNoOfColumns();
        int noOfRows = map.getNoOfRows();

        for (int row = 0; row < noOfRows; row++) {
            this.console.println("\n******************************************************" + "\n" + row);

            for (int column = 0; column < noOfColumns; column++) {
                this.console.print("\t|");
                Location location = locations[row][column];
                Scene scene = location.getScene();
                this.console.print(scene.getMapSymbol());
                if (!location.isVisited()) {
                    this.console.print("--");
                } else {
                    this.console.print("XX");//print to indicate location has not been visited yet
                }
            }

            this.console.print("|");//print final column divider
        }
        this.console.println("\n******************************************************");
        this.console.println("\n\n");
    }

}
