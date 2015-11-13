/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;
import byui.cit260.santaChallenge.control.BreakfastFoodControl;

import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class CaloriesConsumed1View {

    private final String MENU = "\n"
            + "\n*********************************************"
            + "\n| Breakfast food selections                                |"
            + "\n*********************************************"
            + "\nP - 2 frosted Poptarts with sprinkles"
            + "\nB - 1 slimming Banana"
            + "\nH - A hearty ham & cheese omelet"
            + "\nT - Crunch toast with chuncky peanut butter"
            + "\nL - A bowl of Lucky Charms with creamy whole milk"
            + "\nO - Oatmeal with a fruit medley on top"
            + "\nY - Yogurt with fruit on the bottom"
            + "\nN - Nothing!  Santa is too busy to eat!!"
            + "\nC - 2 slices of crispy bacon"
            + "\nS - 3 links of sausage"
            + "\nQ - Quit your game"
            + "\n*********************************************";   
    public void displayMenu() {//display menu for calorieCount1 input
       char selection = ' ';
       do {
           
            System.out.println(MENU);//display the game menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        
       } while (selection !='Q'); //a selection is not "exit" or "quit"
    
       
    }

    private String getInput() {//get input for calorieCount1
        boolean valid = false; //indicates if the menu selection has been retrieved
        char calorieCount1 = ' ';    
        String input = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream

            while(!valid){//while a valid menu selection has not been retrieved
                //prompt the player for a valid menu selection
                System.out.println("Please enter a valid menu selection to choose Santa's first breakfast food.");

                //get the menu selection from the keyboard and trim off the blanks
                input = keyboard.nextLine();
                input = input.trim();
                calorieCount1 = input.charAt(0);

                //if the menu selection is invalid
               if (calorieCount1 != 'P' && calorieCount1 != 'B' && calorieCount1 != 'H' && calorieCount1 != 'T' && calorieCount1 != 'L' && calorieCount1 != 'O' && calorieCount1 != 'Y' && calorieCount1 != 'N' && calorieCount1 != 'C' && calorieCount1 != 'S' && calorieCount1 != 'Q'){
                    System.out.println("Invalid menu selection!");
                    continue; //and repeat again
                }
                break; // Exit out of the repitition
            }
                return input; //return the menu selection 
                
    }
    private void doAction(char calorieCount1) {
        switch (calorieCount1){
            case 'P'://selects a food
                System.out.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView2();
                break;
            case 'B':
                System.out.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                this.foodView2();
                break;
            case 'H':
                System.out.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView2();
                break;
            case 'T':
                System.out.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView2();
                break;
            case 'L':
                System.out.println("Santa has consumed 220 calories, but that food choice had very little nutritional value.  "
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView2();
                break;
            case 'O':
                System.out.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                this.foodView2();
                break;
            case 'Y':
                System.out.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                this.foodView2();
                break;
            case 'N':
                System.out.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                this.foodView2();
                break;
            case 'C':
                System.out.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView2();
                break;
            case 'S':
                System.out.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView2();
                break;
            case 'Q'://Quit the current game
                System.out.println("***Returning to the main menu.***");
                this.returnToMainMenu();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
    }

    private void foodView2() {
         CaloriesConsumed2View  breakfastFoodMenu = new CaloriesConsumed2View();
         breakfastFoodMenu.displayMenu();
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
