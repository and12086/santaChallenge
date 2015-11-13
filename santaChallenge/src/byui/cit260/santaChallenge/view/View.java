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
public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage);//display the main menu
            
            value = this.getInput(); //get the user's selection            
            done = this.doAction(value); //do action based on selection
        } while (!done); //unless selection is not "Exit"
        
    }
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   
        String value = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter a valid menu selection.");
            
            //get the menu selection from the keyboard and trim off the blanks
            value = keyboard.nextLine();
            value = value.trim();
            
            //if the menu selection is invalid
           if (value.length() < 1){
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
            return value; //return the menu selection   
    }
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

   
}
