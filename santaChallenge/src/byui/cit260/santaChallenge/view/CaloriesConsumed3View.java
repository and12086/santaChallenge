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
    public class CaloriesConsumed3View {

    public CaloriesConsumed3View() {
    }

    private final String MENU = ("\n"
            + "\n*********************************************"
            + "\n| Breakfast food selections                 |"
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
            + "\n*********************************************"
            + "\n Please choose Santa's first breakfast food! "
            + "\n");

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);//displays teh main menu

            String input = this.getInput();//get the user's selection
            selection = input.charAt(0);//get the first character of the string

            this.doAction(selection);//do action based on selection

        } while (selection != 'E');
    }

    public String getInput() {
        boolean valid = false; //indicates if the menu selection has been retrieved   
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid menu selection has not been retrieved
            //prompt the player for a valid menu selection
            System.out.println("Please enter a valid menu selection.");

            //get the menu selection from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();

            //if the menu selection is invalid
            if (selection.length() < 1) {
                System.out.println("Invalid menu selection!");
                continue; //and repeat again
            }
            break; // Exit out of the repitition
        }
        return selection; //return the menu selection   
    }

    public int doAction(char selection) {

      
        int calorieCount3 = -1;
        
        switch (selection) {
            case 'P'://selects a food
                System.out.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                calorieCount3 = 200;
                this.foodView4();
                break;
            case 'B':
                System.out.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                calorieCount3 = 105;
                this.foodView4();
                break;
            case 'H':
                System.out.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount3 = 250;
                this.foodView4();
                break;
            case 'T':
                System.out.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount3 = 267;
                this.foodView4();
                break;
            case 'L':
                System.out.println("Santa has consumed 220 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                calorieCount3 = 220;
                this.foodView4();
                break;
            case 'O':
                System.out.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                calorieCount3 = 160;
                this.foodView4();
                break;
            case 'Y':
                System.out.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                calorieCount3 = 100;
                this.foodView4();
                break;
            case 'N':
                System.out.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                calorieCount3 = 0;
                this.foodView4();
                break;
            case 'C':
                System.out.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount3 = 80;
                this.foodView4();
                break;
            case 'S':
                System.out.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount3 = 210;
                this.foodView4();
                break;
            case 'Q'://Quit the current game
                System.out.println("***Returning to the main menu.***");
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;
        }
        return calorieCount3;
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void foodView4() {
        CaloriesConsumed4View  breakfastFoodMenu = new CaloriesConsumed4View();
         breakfastFoodMenu.displayMenu();
    }
}
