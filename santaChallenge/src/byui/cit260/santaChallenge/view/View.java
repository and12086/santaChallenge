/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;
/**
 *
 * @author Wendy
 */
public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.promptMessage);//display the main menu
            
            value = this.getInput(); //get the user's selection            
            done = this.doAction(value); //do action based on selection
        } while (!done); //unless selection is not "Exit"
        
    }
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   
        String value = null;
        while(!valid){//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            this.console.println("Please enter a valid menu selection.");
            
            try {
               while (!valid) {
                //get the menu selection from the keyboard and trim off the blanks
                value = this.keyboard.readLine();
                value = value.trim();
            
                //if the menu selection is invalid
               if (value.length() < 1){
                    ErrorView.display(this.getClass().getName(),"You must enter a value.");
                    continue; //and repeat again
                }
            break; // Exit out of the repitition
        }
        } catch(Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
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
