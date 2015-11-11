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
        char selection = ' ';
        do {
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get the first character of string
            
            this.doAction(Object obj); //do action based on selection
        } while (selection != 'E'); //unless selection is not "Exit"
        
    }
    @Override
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
            input = input.toUpperCase();
            selection = input.charAt(0);
           
            
            
            
            
            //if the menu selection is invalid
           if (selection != 'P' && selection != 'C' && selection != 'S' && selection != 'H' && selection != 'E'){
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
            return input; //return the menu selection   
    }
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
}
