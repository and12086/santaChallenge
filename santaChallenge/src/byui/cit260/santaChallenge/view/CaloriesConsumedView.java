/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.BreakfastFoodControl;
import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.model.BreakfastFood;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class CaloriesConsumedView extends View {

    private int calorieIndex = 0;
    private int healthIndex = 0;
    private double[] calorieCount = new double[4];
    private double[] healthBenefit = new double[4];
   

    public CaloriesConsumedView() {

        super("\n"
                + "\n*********************************************"
                + "\n| Breakfast food selections                 |"
                + "\n*********************************************"
                + "\nP - 2 frosted Poptarts with sprinkles"
                + "\nB - 1 slimming Banana"
                + "\nH - A hearty ham & cheese omelet"
                + "\nT - Crunchy toast with chuncky peanut butter"
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
        energyPoints = BreakfastFoodControl.calculateEnergyPoints(calorieCount, healthBenefit);

       //add energy points to set.actual amount in inventory
        SantaChallenge.getCurrentGame().getInventory()[GameControl.Item.energyPoints.ordinal()].setActualAmount(energyPoints);
        
        double requiredAmount = SantaChallenge.getCurrentGame().getInventory()[GameControl.Item.energyPoints.ordinal()].getRequiredAmount();
        
        double caloriesShort = energyPoints - requiredAmount; 
        if(caloriesShort < 0) {
            this.console.println("\n\nSadly, Santa will probably not have enough energy to make all of his deliveries,"
                    + "\nbut you must press forward and try.");
        }
        else {
            this.console.println("\n\nGood job!  You fed Santa enough healthy foods to finish his rounds.");
        }
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
                this.console.println(""
                        + "You chose Poptarts which have 200 calories.  Unfortuantely, that food choice has very little nutritional value."
                        + "\nSanta may not have enough energy to make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.poptarts.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.poptarts.ordinal()].getHealthBenefit();
                break;
            case 'B':
                this.console.println("You chose a banana which has 105 calories.  That was a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.banana.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.banana.ordinal()].getHealthBenefit();
                break;
            case 'H':
                this.console.println("You chose a Ham & Cheese Omelet which has 250 calories."
                        + "\nThat was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.ham_Cheese_Omelet.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.ham_Cheese_Omelet.ordinal()].getHealthBenefit();
                break;
            case 'T':
                this.console.println("You chose Crunchy Toast with Peanut Butter which has 267 calories."
                        + "\nThat was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.toast_with_PeanutButter.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.toast_with_PeanutButter.ordinal()].getHealthBenefit();
                break;
            case 'L':
                this.console.println("You chose a bowl of Lucky Charms with Milk which has 220 calories."
                        + "\nUnfortuantely that food choice has very little nutritional value."
                        + "\nSanta may not have enough energy to make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.lucky_Charms.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.lucky_Charms.ordinal()].getHealthBenefit();
                break;
            case 'O':
                this.console.println("You chose oatmeal which has 160 calories.  Whole grains are always a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.oatmeal.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.oatmeal.ordinal()].getHealthBenefit();
                break;
            case 'Y':
                this.console.println("You chose yogurt which has 100 calories.  That was a good healthy choice!");
                calorieCount = breakfastFoods[GameControl.Food.yogurt.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.yogurt.ordinal()].getHealthBenefit();
                break;
            case 'N':
                this.console.println("You should always fuel your body in the mornings."
                        + "\nSkipping part of breakfast was a bad choice!"
                        + "\nSanta may not have enough energy to make it around the world in 24 hours.");
                calorieCount = breakfastFoods[GameControl.Food.nothing.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.nothing.ordinal()].getHealthBenefit();
                break;
            case 'C':
                this.console.println("You chose 2 slices of bacon which have 80 calories."
                        + "\nThat was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.bacon.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.bacon.ordinal()].getHealthBenefit();
                break;
            case 'S':
                this.console.println("You chose 3 links of sausage which have 210 calories."
                        + "\nThat was a good healthy choice with lots of protein for energy!");
                calorieCount = breakfastFoods[GameControl.Food.sausage.ordinal()].getCalorieCount();
                healthBenefit = breakfastFoods[GameControl.Food.sausage.ordinal()].getHealthBenefit();
                break;
            case 'Q'://Quit the current game
                //calorieIndex = -1;
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
