/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.SleighControl;
import citbyui.cit260.santaChallenge.exceptions.SleighControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class SleighView {

    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();

    public SleighView() {
    }

    public void getFlyingSpeed() {

        //Display the message asking for input
        this.displayMessage();

        System.out.println("\n\nEnter how many presents you think Santa can deliver:"
                + "\n60, 80, or 100 presents.");

        //Get the number of presents
        double numberOfPresents = this.getPresents();
        //save the number of presents to the game
        SantaChallenge.getCurrentGame().getSleigh().setNumberOfPresents(numberOfPresents);

        System.out.println("\n\nEnter how many reindeer you think"
                + "\nSanta needs to pull the sleigh,"
                + "\nbased on how many presents you selected:"
                + "\n3, 6, or 9 reindeer.");

        //get the number of reindeer
        double numberOfReindeer = this.getReindeer();
        //save the number of reindeer to the game
        SantaChallenge.getCurrentGame().getSleigh().setNumberOfReindeer(numberOfReindeer);
        
        //calculate the flying speed
        double flyingSpeed = 0;
        try {
            flyingSpeed = SleighControl.calcFlyingSpeed(numberOfPresents, numberOfReindeer);
        } catch (SleighControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        //save flying speed to flyingSpeed to the game
        SantaChallenge.getCurrentGame().getSleigh().setFlyingSpeed(flyingSpeed);
        
        //print flying speed
        this.console.println("\n\nYour flying speed is " + flyingSpeed + " miles per hour.");
        
        //return to game
        return;
        
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

    private double getPresents() {
        boolean valid = false; //indicates if a number has been retrieved
        String presents = null;
        
        double numberOfPresents = -1;
        
        try {
            while (!valid) {//while a valid number has not been retrieved
                //prompt for a number of presents

                //get the number from the keyboard and trim off the blanks
                presents = this.keyboard.readLine();
                presents = presents.trim();

                //if the number is invalid (less than 1 character in length)
                if (presents.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please choose from the 3 options: 60, 80, or 100.");
                    continue; //and repeat again
                }
                //make the String into a double
                try {
                    numberOfPresents = Double.parseDouble(presents);
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(), "\nYou must enter a number."
                            + "Please try again.");
                }
                //test to see if the number is one of the preset choices.
                if (numberOfPresents != 60 && numberOfPresents != 80 && numberOfPresents != 100) {
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please enter one of the options listed.");
                    continue;//and repeat again
                }
                valid = true; // Exit out of the repitition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return numberOfPresents; //return the number of presents
    }

    private double getReindeer() {
        boolean valid = false; //indicates if the x coordinate has been retrieved
        String reindeer = null;

        double numberOfReindeer = -1;

        try {
            while (!valid) {//while a valid coordinate has not been retrieved
                //prompt for an x coordinate

                //get the coordinate from the keyboard and trim off the blanks
                reindeer = this.keyboard.readLine();
                reindeer = reindeer.trim();

                //if the coordinate is invalid (less than 1 character in length)
                if (reindeer.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please choose from the 3 options: 3, 6, or 9.");
                    continue; //and repeat again
                }

                try {
                    numberOfReindeer = Double.parseDouble(reindeer);
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number."
                            + "Please try again.");
                }

                if (numberOfReindeer != 3 && numberOfReindeer != 6 && numberOfReindeer != 9) {
                    ErrorView.display(this.getClass().getName(), "Invalid entry.  Please enter one of the options listed.");
                    continue;//and repeat again
                }
                valid = true; // Exit out of the repitition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return numberOfReindeer; //return the x coordinate
    }
}
