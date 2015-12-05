/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;


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
                this.displayMainMenu();              
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again!");
                break;     
                        
        }
    return false;
    }

    
    private void displayWin() {
        HowToWinView howToWin = new HowToWinView();
        howToWin.display();
    }

    private void displayMove() {
        this.console.println("*** displayMove function called");
    }

    private void displayBreakfast() {
        HelpFeedSantaView feedSanta = new HelpFeedSantaView();
        feedSanta.display();
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

    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
