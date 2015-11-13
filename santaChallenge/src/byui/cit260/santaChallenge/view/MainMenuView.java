/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import santachallenge.SantaChallenge;
/**
 *
 * @author Wendy
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
        + "\n*********************************************"
        + "\n| Main Menu                                 |"
        + "\n*********************************************"
        + "\nPlay - Start game"
        + "\nContinue - Get and start a saved game"
        + "\nSave - Save your game"
        + "\nHelp - Get help on how to play the game"
        + "\nExit - Exit menu"
        + "\n*********************************************");           
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
       // value = value.toUpperCase();
        
        switch (value){
            case "P"://start a new game
                this.startNewGame();
                break;
            case "C"://restart and existing game
                this.continueGame();
                break;
            case "S"://save the current game
                this.saveGame();
                break;
            case "H"://display the help menu
                this.displayHelpMenu();
                break;
            case "E"://exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        } 
        return false;
    }


    private void startNewGame() {
        //Create a new game
        GameControl.createNewGame(SantaChallenge.getPlayer());
        
        //Display the game introduction view
        GameIntroductionView gameIntroduction = new GameIntroductionView();
        gameIntroduction.display();
        /*
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
        
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
   
