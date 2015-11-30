/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class XCoordinateView implements Serializable {
    public static int doubleXCoordinate;
    
    private final String MENU = "\n"
            + "Choose your x coordinate."
            + "The x coordinate must be between 0 and 4."
            + "";

    public void displayMenu() {
        double doubleXCoordinate;

        do {
            System.out.println(MENU);//display the main menu
            doubleXCoordinate = this.getInput(); //get the user's selection

            this.doAction(doubleXCoordinate); //do action based on selection
        } while (doubleXCoordinate < 0 || doubleXCoordinate > 4);
    }

    public double getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   

        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter an x coordinate between 0 and 4.");

            //get the menu selection from the keyboard and trim off the blanks
            String xCoordinate = keyboard.nextLine();
            //xCoordinate = xCoordinate.trim();
            
            //if the menu selection is invalid
            if (xCoordinate.length() < 1) {
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }

            try {
                double doubleXCoordinate = Double.parseDouble(xCoordinate);
            }catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number between 0 and 4."
                        + "Try again.");
            }

            break; // Exit out of the repitition
        }
        double doubleXCoordinate = 0;

        return doubleXCoordinate; //return the user input for x coordinate  
    }

    public void doAction(double doubleXCoordinate) {
        this.yCoordinatesView();
        
    }
       /* try {
            MapControl.moveActorsToStartingLocation(map);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
    }*/
    private void yCoordinatesView() {
        YCoordinatesView yCoordinatesView = new YCoordinatesView();
        yCoordinatesView.displayMenu();
    }
}
