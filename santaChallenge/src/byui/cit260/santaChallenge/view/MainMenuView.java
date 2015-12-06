/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
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
                + "\nP - Start game"
                + "\nC - Get and start a saved game"
                + "\nS - Save your game"
                + "\nH - Get help on how to play the game"
                + "\nE - Exit menu"
                + "\n*********************************************");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        // value = value.toUpperCase();

        switch (value) {
            case "P": 
                //start a new game
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
                this.console.println("\n*** Thank you for playing the Santa Challenge!");
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again!");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            //Create a new game

            GameControl.createNewGame(SantaChallenge.getPlayer());
        } catch (MapControlException mce) {
            ErrorView.display(this.getClass().getName(),mce.getMessage());
            return;
        } catch (Throwable te) {
            ErrorView.display(this.getClass().getName(),te.getMessage());
            te.printStackTrace();
            return;
        }

        //Display the game introduction view
        //GameIntroductionView gameIntroduction = new GameIntroductionView();
        //gameIntroduction.display();
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void continueGame() {
        
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where "
                            + "the game has been saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where"
                            + "the game is to be saved");
        
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(SantaChallenge.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuview", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
