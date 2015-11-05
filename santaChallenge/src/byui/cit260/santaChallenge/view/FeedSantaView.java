/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class FeedSantaView {
    private final String INTRO = "\n"
                    + "\n**********************************************"
                    + "\n* Santa will be busy all day long. You must  *"
                    + "\n* make sure Santa eats a hearty breakfast or *"
                    + "\n* Santa will not be his jolly self.          *"
                    + "\n*                                            *"
                    + "\n* Examine the food choices and choose wisely.*"
                    + "\n* You will have the opportunity to make 4    *"
                    + "\n* breakfast food selections.                 *"
                    + "\n*                                            *"
                    + "\n* Each selection has a calorie count and a   *"
                    + "\n* health benefit associated with it. The     *"
                    + "\n* health benefit is a calorie deduction made *"
                    + "\n* for unhealthy food choices.                *"
                    + "\n*                                            *"
                    + "\n* After all your selections have been made,  *"
                    + "\n* an elf will calulate whether Santa has     *"
                    + "\n* enough calories to complete his deliveries *"
                    + "\n* on time or whether he will run out of fuel.*"
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
        
        else {        
            this.caloriesConsumed1View();
        }
     }
        
    public void caloriesConsumed1View() {
        CaloriesConsumed1View caloriesConsumed1 = new CaloriesConsumed1View();
        caloriesConsumed1.displayMenu();
    }

    /*private GameMenuView GameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}


