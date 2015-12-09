/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.ProgramControl;
import byui.cit260.santaChallenge.model.Player;
import citbyui.cit260.santaChallenge.exceptions.ProgramControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    
    public StartProgramView() {
    }
    
   

    public void startProgram() {
         
    
        //Display the banner screen
        this.displayBanner();
    
        //Get the players name
        String playersName;

        //try {
            playersName = this.getPlayersName();
        //} catch (ProgramControlException ex) {
            //System.out.println(ex.getMessage());
            //return;
       // }

        //Create a new player
        Player player;

        try {
            player = ProgramControl.createPlayer(playersName);
        } catch (ProgramControlException ex) {
           System.out.println(ex.getMessage());
           return;
        }

        //Display a customized welcome message
        this.displayWelcomeMessage(player);

        //Display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    public void displayBanner() {
        this.console.println("\n\n*********************************************");

        this.console.println("*                                           *"
                + "\n* Welcome to the Santa Challenge game!      *"
                + "\n*                                           *"
                + "\n* In this game you will help Santa prepare  *"
                + "\n* to deliver presents to children all over  *"
                + "\n* the world.                                *");

        this.console.println("*                                           *"
                + "\n* First, you will help Santa pick foods to  *"
                + "\n* eat for breakfast.  Choose foods that will*"
                + "\n* give Santa the most energy!               *"
                + "\n*                                           *"
                + "\n* Next, you will help Santa load his sleigh *"
                + "\n* and pick his reindeer.  Don't make the    *"
                + "\n* sleigh too heavy for the reindeer.  Make  *"
                + "\n* sure you can travel the distance!         *"
                + "\n*                                           *"
                + "\n* Last of all, you will decide who Santa    *"
                + "\n* will deliver presents to and where they   *"
                + "\n* live.  It could be your own country, or   *"
                + "\n* somewhere much more exotic!               *");

        this.console.println("*                                           *"
                + "\n* You decide!  Have fun on your             *"
                + "\n* adventure with Santa!!!                   *"
                + "\n*                                           *");

        this.console.println("*********************************************");

    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        //Scanner keyboard = new Scanner(System.in); //keyboard input stream
        try {
            while (!valid) {//while a valid name has not been retrieved
                //prompt for the player's name
                this.console.println("Enter the player's name below:");

                //get the name from the keyboard and trim off the blanks
                playersName = this.keyboard.readLine();
                playersName = playersName.trim();

                //if the name is invalid (less than 1 character in length)
                if (playersName.length() < 1) {
                    this.console.println("You must enter a name.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display("StartProgramView", "error reading input: " + e.getMessage());
        }

        return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n*********************************************");
        this.console.println("\tWelcome to the Santa Challenge " + player.getName() + ".");
        this.console.println("\tWe hope you have a jolly time!");
        this.console.println("*********************************************");
    }
}
