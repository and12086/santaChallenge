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

    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();

    public MapView() {
    }

    public void inputCoordinates() {

        //Display the message asking for input
        this.displayMessage();

        this.console.println("Enter an x coordinate below:");
        //Get the coordinates for x and y
        int xCoordinate = this.getCoordinate();

        this.console.println("Enter a y coordinate below:");
        int yCoordinate = this.getCoordinate();

        //Create a new set of coordinates
        Point coordinates = new Point(yCoordinate, xCoordinate);
        //go to move actor to a new location

    }

    public void displayMessage() {
        this.console.println("\n*********************************************");

        this.console.println("*                                           *"
                + "\n* Look at the map and decide where you      *"
                + "\n* want to go first.                         *"
                + "\n*                                           *"
                + "\n* I suggest that you feed Santa first, then *"
                + "\n* pick reindeer and load the sleigh with    *"
                + "\n presents.");

        this.console.println("*                                           *"
                + "\n* Next, you can begin choosing locations    *"
                + "\n* all over the world to deliver presents to *"
                + "\n* with Santa.                               *");

        this.console.println("*                                           *"
                + "\n* First you will indicate an x coordinate   *"
                + "\n* on the map, followed by a y coordinate.   *");

        this.console.println("*********************************************");

    }

    private int getCoordinate() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String xCoordinate = null;

        int doubleXCoordinate = -1;
        try {
            while (!valid) {//while a valid coordinate has not been retrieved
                //prompt for an x coordinate

                //get the coordinate from the keyboard and trim off the blanks
                xCoordinate = this.keyboard.readLine();
                xCoordinate = xCoordinate.trim();

                //if the coordinate is invalid (less than 1 character in length)
                if (xCoordinate.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"Invalid entry.  Please enter a coordinate between 0 and 4.");
                    continue; //and repeat again
                }

                try {
                    doubleXCoordinate = Integer.parseInt(xCoordinate);
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(),"\nYou must enter a valid number between 0 and 4."
                            + "\n Please try again.");
                }

                if (doubleXCoordinate < 0 || doubleXCoordinate > 4) {
                    ErrorView.display(this.getClass().getName(),"Invalid entry.  Please enter a coordinate between 0 and 4.");
                    continue;//and repeat again
                }
                valid = true; // Exit out of the repitition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return doubleXCoordinate; //return the x coordinate
    }

}
