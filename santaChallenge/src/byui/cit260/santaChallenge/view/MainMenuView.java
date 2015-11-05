/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.view.GameMenuView;
import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.view.HelpMenuView;
import java.util.Scanner;
import santachallenge.SantaChallenge;
import byui.cit260.santaChallenge.view.GameIntroductionView;
/**
 *
 * @author Wendy
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n*********************************************"
            + "\n| Main Menu                                 |"
            + "\n*********************************************"
            + "\nPlay - Start game"
            + "\nContinue - Get and start a saved game"
            + "\nSave - Save your game"
            + "\nHelp - Get help on how to play the game"
            + "\nExit - Exit menu"
            + "\n*********************************************";           

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //unless selection is not "Exit"
        
    }

    private String getInput() {
    boolean valid = false; //indicates if the menu selection has been retrieved
    char selection = ' ';    
    String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter a valid menu selection.");
            
            //get the menu selection from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            selection = input.charAt(0);
            
            //if the menu selection is invalid
           if (selection != 'P' && selection != 'C' && selection != 'S' && selection != 'H' && selection != 'E'){
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
            return input; //return the menu selection   
    }
    public void doAction(char selection) {
        switch (selection){
            case 'P'://start a new game
                this.startNewGame();
                break;
            case 'C'://restart and existing game
                this.continueGame();
                break;
            case 'S'://Save the current game
                this.saveGame();
                break;
            case 'H'://display the help menu
                this.displayHelpMenu();
                break;
            case 'E'://exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
    }

    private void startNewGame() {
        //Create a new game
        GameControl.createNewGame(SantaChallenge.getPlayer());
        
        //Display the game introduction view
        GameIntroductionView gameIntroduction = new GameIntroductionView();
        gameIntroduction.displayGameIntro();
        /*
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        */
        
    }

    private void continueGame() {
        System.out.println("*** continueGame function called");
    }

    private void saveGame() {
        System.out.println("*** startSaveGame function called");

    }

    private void displayHelpMenu() {
        
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}
   
