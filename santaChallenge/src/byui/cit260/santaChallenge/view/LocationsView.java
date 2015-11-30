/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.MapControl;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class LocationsView implements Serializable {

    private final String MENU = "\n"
            + "Choose your x coordinate."
            + "The x coordinate must be between 0 and 4."
            + "The y coordinate must also be between 0 and 4.";

    public void displayMenu() {
        String xCoordinate;

        do {
            System.out.println(MENU);//display the main menu

            xCoordinate = this.getInput(); //get the user's selection

        
            this.doAction(xCoordinate); //do action based on selection
        } while (xCoordinate < 0 || xCoordinate > 0);    
    }
    
    public String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   
        String xCoordinate = null;

        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter your coordinates in this format: x,y");

            //get the menu selection from the keyboard and trim off the blanks
            xCoordinate = keyboard.nextLine();
            //xCoordinate = xCoordinate.trim();
             //if the menu selection is invalid
            if (xCoordinate.length() < 1) {
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            
            double doubleXCoordinate = Double.parseDouble(xCoordinate);
   
            break; // Exit out of the repitition
        }
        
        return doubleXCoordinate; //return the menu selection   
    }

    public void doAction(String xCoordinate) {
        Double number = null;

        while (number == null) {
            number = Double.parseDouble(xCoordinate);
            number = Double.parseDouble(yCoordinate);
        }

        try {
            MapControl.moveActorsToStartingLocation(map);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
    }
}
