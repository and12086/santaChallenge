/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import java.util.Scanner;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameMenuView {
    
    
    private final String MENU = "\n"
            + "\n*********************************************"
            + "\n| Game Menu                                 |"
            + "\n*********************************************"
            + "\n Where to now chief? The night is up to you.*"
            + "\n Choose an option from below.              *"
            + "\n*********************************************"
            + "\nM - View Map/Choose a Location              *"
            + "\nF - Feed Santa                              *"
            + "\nL - Load the sleigh, and choose reindeer    *"
            + "\nI - View your inventory                     *"
            + "\nC - Continue your game                          *"
            + "\n*********************************************";   
    public void displayMenu() {
       char selection = ' ';
       do {
           
            System.out.println(MENU);//display the game menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        
       } while (selection !='C'); //a selection is not "exit" or "quit"
    
       
    }

    private String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved
        char selection = ' ';    
        String input = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream

            while(!valid){//while a valid menu selection has not been retrieved
                //prompt the player for a valid menu selection
                System.out.println("Please enter a valid menu selection, and watch your Caps.");

                //get the menu selection from the keyboard and trim off the blanks
                input = keyboard.nextLine();
                input = input.trim();
                selection = input.charAt(0);

                //if the menu selection is invalid
               if (selection != 'M' && selection != 'F' && selection != 'L' && selection != 'I'){
                    System.out.println("Invalid menu selection!");
                    continue; //and repeat again
                }
                break; // Exit out of the repitition
            }
                return input; //return the menu selection   
    }
    private void doAction(char selection) {
        switch (selection){
            case 'M'://View Map/Choose Location
                this.mapView();
                break;
            case 'F'://Feed Santa
                this.caloriesConsumed1View();
                break;
            case 'L'://Load Sleigh/Choose Reindeer
                this.loadSleigh();
                break;
            case 'I'://View Inventory
                this.inventory();
                break; 
            case 'C'://return to your game
                return;    
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
    }

   
    private void continueGame() {
        System.out.println("*** continueGame function called");
    }

    private void mapView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void caloriesConsumed1View() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadSleigh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

