/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import santachallenge.SantaChallenge;


/**
 *
 * @author Lisa Lou
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super ("\n"
                + "\n*********************************************"
                + "\n| Help Menu                                 |"
                + "\n*********************************************"
                + "\nW - How to Win"
                + "\nM - How to use Map and Locations"
                + "\nB - How to Feed Santa"
                + "\nL - How to Load the Sleigh"
                + "\nR - How to Choose Reindeer"
                + "\nI - How to View Inventory"
                + "\nS - How to Save a Game"
                + "\nC - How to Continue a Saved Game"
                + "\nE - Exit Help Menu"
                + "\n*********************************************"); 
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        //value = value.toUpperCase();
        
        switch (value){
            case "W"://displays How to win
                this.displayWin();
                break;
            case "M":// displays how to move
                this.displayMove();
                break;
            case "B":// displays how to feed Santa
                this.displayBreakfast();
                break;
            case "L":// displays how to load sleigh
                this.displayLoad();
                break;
            case "R":// displays how to pick reindeer
                this.displayReindeer();
                break;
            case "I":// displays how to view inventory
                this.displayInventory();
                break;
            case "S":// displays how to save game
                this.displaySave();
                break;
            case "C"://displays how to continue a saved game
                this.displayContinue();
                break;
            case "E":// exits back to main menu
                return true;           
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again!");
                break;     
                        
        }
    return false;
    }

    
    private void displayWin() {
       this.console.println("\n"
                + "\n************************************************"
                + "\n               How to WIN the game              "
                + "\n************************************************"
                + "\n                                                "
                + "\n The purpose of the game is to deliver as many  "
                + "\n presents as you can, to as many different      "
                + "\n countries as you can. At the end of the game   "
                + "\n you will recieve a score that encompasses both "
                + "\n the number of presents that you were able to   "
                + "\n deliver and the number of countries that were  "
                + "\n visited.                                       "
                + "\n                                                "
                + "\n************************************************"
                + "\n                                                "
                + "\n                     TIPS!!                     "
                + "\n                                                "
                + "\n Be sure to balance your load of presents with  "
                + "\n the right amount of reindeer to pull the       "
                + "\n sleigh in order to increase your flying speed. "
                + "\n                                                "
                + "\n Plan your stops strategicaly so that you can   "
                + "\n make it to the most amount of countries.       "
                + "\n                                                "
                + "\n                                                "
                + "\n************************************************"
                + "\n Type R to Return to the Help Menu              "
                + "\n Type M to return to the Main Menu              "
                + "\n************************************************");
    }

    private void displayMove() {
        this.console.println("To move your player to a new location use the  "
                + "\n coordinates on the map to identify the city you"
                + "\n would like to travel to next and type enter    "
                + "\n All trips orginate from the North Pole.        ");
    }

    private void displayBreakfast() {
        this.console.println("To move your player to a new location use the  ");
        
    }

    private void displayLoad() {
        this.console.println("*** displayLoad function called");
    }

    private void displayInventory() {
        this.console.println("*** displayInventory function called");
    }

    private void displayReindeer() {
        this.console.println("*** displayReindeer function called");
    }

    private void displaySave() {
        this.console.println("*** displaySave function called");
    }

    private void displayContinue() {
        this.console.println("*** displayContinue function called");
    }
}
