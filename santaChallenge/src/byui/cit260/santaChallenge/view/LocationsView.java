/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.MapControl;
import byui.cit260.santaChallenge.model.Actor;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class LocationsView implements Serializable {

   private final String MENU = "\n"
           + "Choose two coordinates."
           + "The x coordinate must be between 0 and 4."
           + "The y coordinate must also be between 0 and 4."
           + "Please enter your coordinates in this format: x,y"
           + "and then press enter to continue.";
           
    public void displayMenu() {
       char xCoordinate;
       char yCoordinate;      
        
        do {
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            xCoordinate = input.charAt(0);
            yCoordinate = input.charAt(2);
            this.doAction(xCoordinate, yCoordinate); //do action based on selection
        } while (xCoordinate < 0 || xCoordinate > 4 || yCoordinate < 0 || yCoordinate > 4); //unless selection is not "Exit"       
    }
    
    public String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   
        String xyValues = null;
       
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter your coordinates in this format: x,y");
            
            //get the menu selection from the keyboard and trim off the blanks
            xyValues = keyboard.nextLine();
            xyValues = xyValues.trim();
            
            //if the menu selection is invalid
           if (xyValues.length() < 3){
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
            return xyValues; //return the menu selection   
    }
    
  
   public void doAction(char xCoordinate, char yCoordinate) {
       Actor actor = null;
       try {
           MapControl.moveActorToStartingLocation(actor, coordinates);
       } 
       catch (MapControlException me) {
           System.out.println(me.getMessage());
       }
   }
}
    
