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
public class HelpMenuView {
    
    private final String MENU = "\n"
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
            + "\n*********************************************";           

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of the string
            
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
           if (selection != 'W' && selection != 'M' && selection != 'B' && 
                   selection != 'L' && selection != 'R' && selection != 'I' && 
                   selection != 'S' && selection != 'C' && selection != 'E'){
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
            return input; //return the menu selection   
    }
    private void doAction(char selection) {
        switch (selection){
            case 'W'://displays How to win
                this.displayWin();
                break;
            case 'M':// displays how to move
                this.displayMove();
                break;
            case 'B':// displays how to feed Santa
                this.displayBreakfast();
                break;
            case 'L':// displays how to load sleigh
                this.displayLoad();
                break;
            case 'R':// displays how to pick reindeer
                this.displayReindeer();
                break;
            case 'I':// displays how to view inventory
                this.displayInventory();
                break;
            case 'S':// displays how to save game
                this.displaySave();
                break;
            case 'C'://displays how to continue a saved game
                this.displayContinue();
                break;
            case 'E':// exits back to main menu
                System.out.println("***RETURNING TO MAIN MENU***");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
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
