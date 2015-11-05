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
    //private Object gameMenu;

    public GameIntroductionView() {
    }
    
    public void gameIntroduction() {
        
        //display game intoduction
        this.displayGameIntro();
        
        //display the Game Menu
       // GameMenuView gameMenu = GameMenuView();
        //gameMenu.displayMenu();
    }

    public void displayGameIntro() {
        System.out.println ("*********************************************"
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
                    + "\n*********************************************");  
        
        System.out.println("Please type 'C' to continue:");
    }
    
    private String getInput() {
        boolean valid = false; //indicates if the input has been retrieved
        char selection = ' ';
        String playersChoice = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid selection has not been retrieved
            //prompt for the user input
            System.out.println("Please type 'C' to continue:");
            
            //get the selection from the keyboard and trim off the blanks
            playersChoice = keyboard.nextLine();
            playersChoice = playersChoice.trim();
            selection = playersChoice.charAt(0);
            
            //if the name is invalid (less than 1 character in length)
            if (selection != 'C'){
                System.out.println("Try Again.  You must enter 'C' to continue.");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
        return playersChoice; //return the input
    }
    
     public void doAction(char selection) {
        if (selection != 'C'){
            System.out.println("\n*** Invalid selection *** Try again!");            
        } 
        
        else {        
            this.GameMenuView();
        }
     }
        
    public void GameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    /*private GameMenuView GameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
