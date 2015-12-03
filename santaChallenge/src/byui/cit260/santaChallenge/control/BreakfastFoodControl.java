/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.BreakfastFood;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class BreakfastFoodControl {

            
    public int calculateEnergyPoints(int calorieCount1, int calorieCount2, int calorieCount3, int calorieCount4){ 
                //int healthBenefit1, int healthBenefit2, int healthBenefit3, int healthBenefit4) {
        int healthBenefit1 = -1;
        int healthBenefit2 = -1;
        int healthBenefit3 = -1;
        int healthBenefit4 = -1;


//consequence for poor food choices (pop-tart, Lucky Charms, and nothing)   
        if (calorieCount1 == 200 || calorieCount1 == 220 || calorieCount1 == 0) {
            healthBenefit1 = 50;
        }
        //no consequence because they made good choices
        else {
            healthBenefit1 = 0;
        }
        if (calorieCount2 == 200 || calorieCount2== 220 ||calorieCount2 == 0) {
            healthBenefit2 = 50;
        }
        else {
            healthBenefit2 = 0;
        }
        if (calorieCount3 == 200 || calorieCount3 == 220 ||calorieCount3 == 0) {
            healthBenefit3 = 50;
        }
        else {
            healthBenefit3 = 0;
        }
        if (calorieCount4 == 200 || calorieCount4 == 220 ||calorieCount4 == 0) {
            healthBenefit4 = 50;
        }
        else {
            healthBenefit4 = 0;
        }
            
    int actualEnergyPoints = (calorieCount1 + calorieCount2 + calorieCount3 + calorieCount4) - (healthBenefit1 + healthBenefit2 + healthBenefit3 + healthBenefit4);
    return actualEnergyPoints;    
    }

    

    
    public static BreakfastFood[] getSortedBreakfastList() {

        //get breakfast food list from the current game
        BreakfastFood[] originalBreakfastList = 
                SantaChallenge.getCurrentGame().getBreakfastFood();

        //clone the originalList
        BreakfastFood[] breakfastList = originalBreakfastList.clone();

        //using a selection sort to sort the list of breakfast items by name
        BreakfastFood tempBreakfastList;
        //int[] BreakfastFood = null;
        for (int i = 0;i < breakfastList.length -1; i++) {// advance the position through the entire array
        
            int index = i; // assume the min is the first element 
            for (int j = i +1; j < breakfastList.length; j++) //if this element is less, then it is the new minimum 
                if ( breakfastList[j].getDescription().compareTo(breakfastList[index].getDescription()) < 0) 
                    index = j; //found new minimum; remember its index 
            
            tempBreakfastList = breakfastList[index];
            breakfastList[index] = breakfastList[i];
            breakfastList[i] = tempBreakfastList;
        }
        return breakfastList;
    }

    
}

