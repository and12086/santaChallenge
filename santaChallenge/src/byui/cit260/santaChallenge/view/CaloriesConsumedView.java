/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.BreakfastFoodControl;
import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.model.BreakfastFood;
import byui.cit260.santaChallenge.model.InventoryItem;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class CaloriesConsumedView extends View {

    private int calorieIndex = 0;
    private int healthIndex = 0;
    private double[] caloriesConsumed = new double[4];
    private double[] healthBenefit = new double[4];
    private double[] calorieCount;

    public CaloriesConsumedView() {

        super("\n"
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
                + "\n Please choose Santa's breakfast food! "
                + "\n");
    }

    public void displayViews() {
        for (int i = 0; i < 4; i++) {
            this.display();

            if (calorieIndex < 0) {
                return;
            }
        }
        double energyPoints;
        energyPoints = BreakfastFoodControl.calculateEnergyPoints(calorieCount[0], calorieCount[1], calorieCount[2], calorieCount[3], 
                healthBenefit[0], healthBenefit[1], healthBenefit[2], healthBenefit[3]);

       //add energy points to set.actual amount in inventory
        InventoryItem[] inventories = SantaChallenge.getCurrentGame().getInventory();
        energyPoints = inventories[GameControl.Item.energyPoints.ordinal()].getActualAmount();

        //return to the GameMenuView
        return;
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char selection = value.charAt(0);
        double calorieCount = -1;
        double healthBenefit = -1;

        BreakfastFood[] breakfastFoods = SantaChallenge.getCurrentGame().getBreakfastFood();

        switch (selection) {
            case 'P'://selects a food
                this.console.println("Santa has consumed 200 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.poptarts.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.poptarts.ordinal()].getHealthBenefit();
                break;
            case 'B':
                this.console.println("Santa has consumed 105 calories.  That was a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.banana.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.banana.ordinal()].getHealthBenefit();
                break;
            case 'H':
                this.console.println("Santa has consumed 250 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.ham_Cheese_Omelet.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.ham_Cheese_Omelet.ordinal()].getHealthBenefit();
                break;
            case 'T':
                this.console.println("Santa has consumed 267 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.toast_with_PeanutButter.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.toast_with_PeanutButter.ordinal()].getHealthBenefit();
                break;
            case 'L':
                this.console.println("Santa has consumed 220 calories, but that food choice had very little nutritional value."
                        + "\nSanta may not make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.lucky_Charms.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.lucky_Charms.ordinal()].getHealthBenefit();
                break;
            case 'O':
                this.console.println("Santa has consumed 160 calories.  That was a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.oatmeal.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.oatmeal.ordinal()].getHealthBenefit();
                break;
            case 'Y':
                this.console.println("Santa has consumed 100 calories.  That was a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.yogurt.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.yogurt.ordinal()].getHealthBenefit();
                break;
            case 'N':
                this.console.println("You should always fuel your body in the mornings.  That was a bad choice!"
                        + "Santa may not make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.nothing.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.nothing.ordinal()].getHealthBenefit();
                break;
            case 'C':
                this.console.println("Santa has consumed 80 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.bacon.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.bacon.ordinal()].getHealthBenefit();
                break;
            case 'S':
                this.console.println("Santa has consumed 210 calories.  That was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.sausage.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.sausage.ordinal()].getHealthBenefit();
                break;
            case 'Q'://Quit the current game
                calorieIndex = -1;
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again!");
                return false;
        }
        this.calorieCount[this.calorieIndex] = calorieCount;      
        this.healthBenefit[this.healthIndex] = healthBenefit;
        this.calorieIndex++;
        this.healthIndex++;
        
        return true;
    }
}
