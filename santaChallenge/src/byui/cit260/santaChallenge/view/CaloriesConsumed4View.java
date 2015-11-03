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
public class CaloriesConsumed4View {
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
            
            String input4 = this.getInput4(); //get the user's selection
            selection = input4.charAt(0); //get first character of string
            
            this.doAction4(selection); //do action based on selection
        
       } while (selection !='Q'); //a selection is not "exit" or "quit"
    }

    
        private String getInput4() {//getInput for calorieCount2
        boolean valid = false; //indicates if the menu selection has been retrieved
        char calorieCount4 = ' ';    
        String input4 = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream

            while(!valid){//while a valid menu selection has not been retrieved
                //prompt the player for a valid menu selection
                System.out.println("Please enter another valid menu selection to choose Santa's fourth breakfast food."
                        + "\nHe needs a lot of energy for his trip around the world.");

                //get the menu selection from the keyboard and trim off the blanks
                input4 = keyboard.nextLine();
                input4 = input4.trim();
                calorieCount4 = input4.charAt(0);

                //if the menu selection is invalid
               if (calorieCount4 != 'P' && calorieCount4 != 'B' && calorieCount4 != 'H' && calorieCount4 != 'T' && calorieCount4 != 'L' && calorieCount4 != 'O' && calorieCount4 != 'Y' && calorieCount4 != 'N' && calorieCount4 != 'C' && calorieCount4 != 'S' && calorieCount4 != 'Q'){
                    System.out.println("Invalid menu selection!");
                    continue; //and repeat again
                }
                break; // Exit out of the repitition
            }
                return input4; //return the menu selection 
                
    }
    private void doAction4(char calorieCount4) {
        switch (calorieCount4){
            case 'P'://selects a food
                System.out.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                this.calculate();
                break;
            case 'B':
                System.out.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                this.calculate();
                break;
            case 'H':
                System.out.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                this.calculate();
                break;
            case 'T':
                System.out.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                this.calculate();
                break;
            case 'L':
                System.out.println("Santa has consumed 220 calories, but that food choice had very little nutritional value.  "
                        + "\nSanta may not make it around the world in 24 hours.");
                this.calculate();
                break;
            case 'O':
                System.out.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                this.calculate();
                break;
            case 'Y':
                System.out.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                this.calculate();
                break;
            case 'N':
                System.out.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                this.calculate();
                break;
            case 'C':
                System.out.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                this.calculate();
                break;
            case 'S':
                System.out.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                this.calculate();
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

    private void calculate() {
        System.out.println("*** calcCaloriesConsumed function called");
    }
}

