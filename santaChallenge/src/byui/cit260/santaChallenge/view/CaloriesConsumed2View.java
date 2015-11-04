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
public class CaloriesConsumed2View {

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
            
            String input2 = this.getInput2(); //get the user's selection
            selection = input2.charAt(0); //get first character of string
            
            this.doAction2(selection); //do action based on selection
        
       } while (selection !='Q'); //a selection is not "exit" or "quit"
    }

    
        private String getInput2() {//getInput for calorieCount2
        boolean valid = false; //indicates if the menu selection has been retrieved
        char calorieCount2 = ' ';    
        String input2 = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream

            while(!valid){//while a valid menu selection has not been retrieved
                //prompt the player for a valid menu selection
                System.out.println("Please enter another valid menu selection to choose Santa's second breakfast food."
                        + "\nHe needs a lot of energy for his trip around the world.");

                //get the menu selection from the keyboard and trim off the blanks
                input2 = keyboard.nextLine();
                input2 = input2.trim();
                calorieCount2 = input2.charAt(0);

                //if the menu selection is invalid
               if (calorieCount2 != 'P' && calorieCount2 != 'B' && calorieCount2 != 'H' && calorieCount2 != 'T' && calorieCount2 != 'L' && calorieCount2 != 'O' && calorieCount2 != 'Y' && calorieCount2 != 'N' && calorieCount2 != 'C' && calorieCount2 != 'S' && calorieCount2 != 'Q'){
                    System.out.println("Invalid menu selection!");
                    continue; //and repeat again
                }
                break; // Exit out of the repitition
            }
                return input2; //return the menu selection 
                
    }
    private void doAction2(char calorieCount2) {
        switch (calorieCount2){
            case 'P'://selects a food
                System.out.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView3();
                break;
            case 'B':
                System.out.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                this.foodView3();
                break;
            case 'H':
                System.out.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView3();
                break;
            case 'T':
                System.out.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView3();
                break;
            case 'L':
                System.out.println("Santa has consumed 220 calories, but that food choice had very little nutritional value.  "
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView3();
                break;
            case 'O':
                System.out.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                this.foodView3();
                break;
            case 'Y':
                System.out.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                this.foodView3();
                break;
            case 'N':
                System.out.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                this.foodView3();
                break;
            case 'C':
                System.out.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView3();
                break;
            case 'S':
                System.out.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView3();
                break;
            case 'Q'://Quit the current game
                System.out.println("***Returning to the game menu.***");
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void foodView3() {
        CaloriesConsumed3View  breakfastFoodMenu = new CaloriesConsumed3View();
         breakfastFoodMenu.displayMenu();
    }
}