/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Point;
import java.util.Scanner;
import santachallenge.SantaChallenge;



/**
 *
 * @author Wendy
 */
public class MapView {
    private Object keyboard;

    public MapView() {
    }

    public void inputCoordinates() {

        //Display the message asking for input
        this.displayMessage();
        
        System.out.println("Enter an x coordinate below:");
        //Get the coordinates for x and y
        int xCoordinate = this.getCoordinate();
        
        System.out.println("Enter an y coordinate below:");
        int yCoordinate = this.getCoordinate();


        //Create a new set of coordinates
        Point coordinates = new Point(yCoordinate, xCoordinate);
         //go to move actor to a new location
            
    }

    public void displayMessage() {
        System.out.println("\n*********************************************");

        System.out.println("*                                           *"
                       + "\n* Look at the map and decide where you      *"
                       + "\n* want to go first.                         *"
                       + "\n*                                           *"
                       + "\n* I suggest that you feed Santa first, then *"
                       + "\n* pick reindeer and load the sleigh with    *"
                       + "\n presents.");

        System.out.println("*                                           *"
                       + "\n* Next, you can begin choosing locations    *"
                       + "\n* all over the world to deliver presents to *"
                       + "\n* with Santa.                               *");

        System.out.println("*                                           *"
                       + "\n* First you will indicate an x coordinate   *"
                       + "\n* on the map, followed by a y coordinate.   *");

        System.out.println("*********************************************");

    }


    private int getCoordinate() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String xCoordinate = null;


        int doubleXCoordinate = -1;
        
        while (!valid) {//while a valid coordinate has not been retrieved
            //prompt for an x coordinate
            

            //get the coordinate from the keyboard and trim off the blanks
            xCoordinate = this.keyboard.readLine();
            xCoordinate = xCoordinate.trim();

            //if the coordinate is invalid (less than 1 character in length)
            if (xCoordinate.length() < 1) {
                System.out.println("Invalid entry.  Please enter a coordinate between 0 and 4.");
                continue; //and repeat again
            }
            
            try{
                doubleXCoordinate = Integer.parseInt(xCoordinate);         
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number between 0 and 4."
                        +"\n Please try again." + e.getMessage());
            }
            
            if (doubleXCoordinate < 0 || doubleXCoordinate > 4) {
                System.out.println("Invalid entry.  Please enter a coordinate between 0 and 4.");
                continue;//and repeat again
            }
            valid = true; // Exit out of the repitition
        }
        return doubleXCoordinate; //return the x coordinate
    }

}
