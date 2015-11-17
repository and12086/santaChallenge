/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.util.Scanner;


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
                System.out.println("***RETURNING TO MAIN MENU***");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;     
                        
        }
    return false;
    }

    
    private void displayWin() {
        System.out.println("*** Santa needs to deliver his presents in a timely fashion.");
    }

    private void displayMove() {
        System.out.println("*** displayMove function called");
    }

    private void displayBreakfast() {
        HelpFeedSantaView feedSanta = new HelpFeedSantaView();
        feedSanta.display();
    }

    private void displayLoad() {
        System.out.println("*** displayLoad function called");
    }

    private void displayInventory() {
        System.out.println("*** displayInventory function called");
    }

    private void displayReindeer() {
        System.out.println("*** displayReindeer function called");
    }

    private void displaySave() {
        System.out.println("*** displaySave function called");
    }

    private void displayContinue() {
        System.out.println("*** displayContinue function called");
    }
}
