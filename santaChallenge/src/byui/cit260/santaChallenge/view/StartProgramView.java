/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.ProgramControl;
import byui.cit260.santaChallenge.model.Player;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class StartProgramView {
    
    public StartProgramView(){
    }   
    
    public void startProgram(){
           
        //Display the banner screen
        this.displayBanner();
        
        //Get the players name
        String playersName = this.getPlayersName();
        
        //Create a new player
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display a customized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
            
        }   

    private void displayBanner() {
        System.out.println ("\n\n*********************************************");
        
        System.out.println     ("*                                           *"
                            + "\n* Welcome to the Santa Challenge game!      *"
                            + "\n*                                           *"
                            + "\n* In this game you will help Santa prepare  *"
                            + "\n* to deliver presents to children all over  *"
                            + "\n* the world.                                *");
        
        System.out.println     ("*                                           *"
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
        
        System.out.println     ("*                                           *"
                            + "\n* You decide!  Have fun on your             *"
                            + "\n* adventure with Santa!!!                   *"
                            + "\n*                                           *");
        
        System.out.println     ("*********************************************");   
                
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than 1 character in length)
            if (playersName.length() <1){
                System.out.println("Invalid entry.  You must enter a name.");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
        return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n*********************************************");
        System.out.println("\tWelcome to the Santa Challenge " + player.getName()+ ".");
        System.out.println("\tWe hope you have a jolly time!");
        System.out.println("*********************************************");
    }
}
