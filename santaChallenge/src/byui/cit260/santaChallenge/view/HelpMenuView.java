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
            + "\nF - How to Fetch a Saved Game"
            + "\nX - Return to the Main Menu"
            + "\nP - Return to Game Play"
            + "\n*********************************************";           

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of the string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'X' || selection != 'P'); //unless selection is not "Exit"
        
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
                   selection != 'S' && selection != 'X' && selection != 'P'){
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
            case 'F'://displays how to fetch a saved game
                this.displayFetch();
                break;
            case 'X':// exits back to main menu
                return;
            case 'P':// exits back to game play
                return;
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
        System.out.println("*** displayBreakfast function called");
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

    private void displayFetch() {
        System.out.println("*** displayFetch function called");
    }
}
