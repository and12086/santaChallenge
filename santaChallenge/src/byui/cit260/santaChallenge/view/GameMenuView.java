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
            + "\nN - Start New Game"
            + "\nC - Continue a saved game"
            + "\nQ - Quit your game"
            + "\n*********************************************";   
    public void displayMenu() {
       char selection = ' ';
       do {
           
            System.out.println(MENU);//display the game menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        
       } while (selection !='Q'); //a selection is not "exit" or "quit"
    
       
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
               if (selection != 'N' && selection != 'C' && selection != 'Q'){
                    System.out.println("Invalid menu selection!");
                    continue; //and repeat again
                }
                break; // Exit out of the repitition
            }
                return input; //return the menu selection   
    }
    private void doAction(char selection) {
        switch (selection){
            case 'N'://start a new game
                this.startNewGame();
                break;
            case 'C'://Continue an existing game
                this.continueGame();
                break;
            case 'Q'://Quit the current game
                System.out.println("***QUITTING GAME***");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
    }

    private void startNewGame() {
        //create new game
        CaloriesConsumed1View breakfastFoodMenu = new CaloriesConsumed1View();
        breakfastFoodMenu.displayMenu();
    }

    private void continueGame() {
        System.out.println("*** continueGame function called");
    }

}

