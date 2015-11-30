/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class YCoordinatesView {
     private final String MENU = "\n"
            + "Choose your y coordinate."
            + "The y coordinate must be between 0 and 4.";

    public void displayMenu() {
        double doubleYCoordinate;

        do {
            System.out.println(MENU);//display the main menu
            doubleYCoordinate = this.getInput(); //get the user's selection

            this.doAction(doubleYCoordinate); //do action based on selection
        } while (doubleYCoordinate < 0 || doubleYCoordinate > 4);
    }

    public double getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   

        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter a y coordinate between 0 and 4.");

            //get the menu selection from the keyboard and trim off the blanks
            String yCoordinate = keyboard.nextLine();
            //xCoordinate = xCoordinate.trim();
            //if the menu selection is invalid
            if (yCoordinate.length() < 1) {
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }

            double doubleYCoordinate = Double.parseDouble(yCoordinate);

            break; // Exit out of the repitition
        }
        double doubleYCoordinate = 0;

        return doubleYCoordinate; //return the user input for x coordinate  
    }

    public void doAction(double doubleYCoordinate) {
        

}
}
