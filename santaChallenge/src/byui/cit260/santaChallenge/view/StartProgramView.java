/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

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
        //Create a new player
        //Display a customized welcome message
        //Display the main menu
            
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
}
