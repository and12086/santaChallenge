/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.SleighControl;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class SleighView {
    
    public SleighView(){
}
    
    public void getPullCapacity() {

        //Display the message asking for input
        this.displayMessage();
        
        System.out.println("Enter how many presents you think Santa can deliver: 60, 80, or 100.");
        
        //Get the number of presents
        int presents = this.getPresents();
        
        System.out.println("Enter how many reindeer you think"
                + "\nSanta needs to pull the sleigh,"
                + "\nbased on how many presents you selected: 3, 6, or 9.");
        
        //get the number of reindeer
        int reindeer = this.getReindeer();
        
        //SleighControl.calcPullCapacity(double numberOfPresents, double numberOfReindeer);
            
    }
public void displayMessage() {
        System.out.println("\n********************************************************");

        System.out.println("\n* It is time for Santa to load the sleigh              *"
                         + "\n* and choose his reindeer.                             *"
                         + "\n*                                                      *"
                         + "\n* First, help Santa decide how many presents he        *"
                         + "\n* wants to deliver.  Then help Santa estimate how many *"
                         + "\n* reindeer he will need to pull the heavy sleigh.      *"
                         + "\n*                                                      *"
                         + "\n* Good luck!                                           *");

        System.out.println("\n********************************************************");

    }

 private int getPresents() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String presents = null;

        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        int doublePresents = -1;
        
        while (!valid) {//while a valid coordinate has not been retrieved
            //prompt for an x coordinate
            

            //get the coordinate from the keyboard and trim off the blanks
            presents = keyboard.nextLine();
            presents = presents.trim();

            //if the coordinate is invalid (less than 1 character in length)
            if (presents.length() < 1) {
                System.out.println("Invalid entry.  Please choose from the 3 options: 60, 80, or 100.");
                continue; //and repeat again
            }
            
            try{
                doublePresents = Integer.parseInt(presents);         
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a number."
                        + "Please try again.");
            }
            
            if (doublePresents != 60 || doublePresents != 80 || doublePresents != 100) {
                System.out.println("Invalid entry.  Please enter one of the options listed.");
                continue;//and repeat again
            }
            valid = true; // Exit out of the repitition
        }
        return doublePresents; //return the x coordinate
    }
  private int getReindeer() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String reindeer = null;

        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        int doubleReindeer = -1;
        
        while (!valid) {//while a valid coordinate has not been retrieved
            //prompt for an x coordinate
            

            //get the coordinate from the keyboard and trim off the blanks
            reindeer = keyboard.nextLine();
            reindeer = reindeer.trim();

            //if the coordinate is invalid (less than 1 character in length)
            if (reindeer.length() < 1) {
                System.out.println("Invalid entry.  Please choose from the 3 options: 3, 6, or 9.");
                continue; //and repeat again
            }
            
            try{
                doubleReindeer = Integer.parseInt(reindeer);         
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number."
                        + "Please try again.");
            }
            
            if (doubleReindeer != 3 || doubleReindeer != 6 || doubleReindeer != 9) {
                System.out.println("Invalid entry.  Please enter one of the options listed.");
                continue;//and repeat again
            }
            valid = true; // Exit out of the repitition
        }
        return doubleReindeer; //return the x coordinate
    }
}