/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        switch (value){
            case "P":{
            try {
                //start a new game
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                System.out.println("\n*** Thank you for playing the Santa Challenge!");
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        } 
        return false;
    }


    private void startNewGame() throws MapControlException {
        //Create a new game
        GameControl.createNewGame(SantaChallenge.getPlayer());
        
        //Display the game introduction view
        //GameIntroductionView gameIntroduction = new GameIntroductionView();
        //gameIntroduction.display();
        
        //Display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();   
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
        helpMenu.display();
    }   
}
   
