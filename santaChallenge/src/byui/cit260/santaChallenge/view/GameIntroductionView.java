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
public class GameIntroductionView { 

   private final String INTRO = "\n"
                    + "\n*********************************************"
                    + "\n* There are a few things you must do before *"
                    + "\n* you can take off to deliver presents.     *"
                    + "\n*                                           *"
                    + "\n* You will need to load the sleigh and      *"
                    + "\n* choose how many reindeer you will bring   *"
                    + "\n* with you on your trips.                   *"
                    + "\n*                                           *"
                    + "\n* It will be a very long day so make sure   *"
                    + "\n* that Santa gets breakfast before you run  *"
                    + "\n* off to spread Christmas joy!              *"
                    + "\n*                                           *"
                    + "\n* You only have 24 hours to deliver the     *"
                    + "\n* most presents that you can...don't leave  *"
                    + "\n* any contininents out.                     *"
                    + "\n*                                           *"
                    + "\n*********************************************";
                    
                    
        public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(INTRO);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); //unless selection is not "Exit"
        
    }

    
    private String getInput() {
        boolean valid = false; //indicates if the input has been retrieved
        char selection = ' ';
        String input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid selection has not been retrieved
            //prompt for the user input
            System.out.println("Please type 'C' to continue.");
            
            //get the selection from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            selection = input.charAt(0);
            
            //if the name is invalid (less than 1 character in length)
            if (selection != 'C'){
                System.out.println("Try Again.  You must enter 'C' to continue.");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
        return input; //return the input
    }
    
     public void doAction(char selection) {
        if (selection != 'C'){
            System.out.println("\n*** Invalid selection *** Try again!");            
        } 
        
        /*
        else if (selection =='E') {
            System.out.println("\n*** Are you sure you want to exit the game?");
        }
        */
        
        else {        
            this.gameMenuView();
        }
     }
        
    public void gameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    /*private GameMenuView GameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
