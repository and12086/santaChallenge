/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

/**
 *
 * @author Wendy
 */
public class CaloriesConsumed3View extends View {

    public CaloriesConsumed3View() {
        super ("\n"
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
            + "\n*********************************************"
            + "\n Please choose Santa's third breakfast food! ");
    }
    
   @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;

        switch (value){
            case "P"://selects a food
                System.out.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView4();
                break;
            case "B":
                System.out.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                this.foodView4();
                break;
            case "H":
                System.out.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView4();
                break;
            case "T":
                System.out.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView4();
                break;
            case "L":
                System.out.println("Santa has consumed 220 calories, but that food choice had very little nutritional value.  "
                        + "\nSanta may not make it around the world in 24 hours.");
                this.foodView4();
                break;
            case "O":
                System.out.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                this.foodView4();
                break;
            case "Y":
                System.out.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                this.foodView4();
                break;
            case "N":
                System.out.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                this.foodView4();
                break;
            case "C":
                System.out.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView4();
                break;
            case "S":
                System.out.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                this.foodView4();
                break;
            case "Q"://Quit the current game
                System.out.println("***Returning to the game menu.***");
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
        return false;
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void foodView4() {
        CaloriesConsumed4View  breakfastFoodMenu = new CaloriesConsumed4View();
         breakfastFoodMenu.display();
    }
}
