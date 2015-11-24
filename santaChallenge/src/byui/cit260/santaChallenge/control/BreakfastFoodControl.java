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
            
            
    public double calcCaloriesConsumed(double input1, double input2, double input3, double input5, 
                double healthBenefit1, double healthBenefit2, double healthBenefit3, double healthBenefit4) {

    if (input1 != 200 && input1 != 105 && input1 != 250 && input1 != 267 && input1 != 220 && input1 != 160 && input1 != 100 && input1 != 0 && input1 !=80 && input1 != 210){
                return -1;
                }
    if (input2 != 200 && input2 != 105 && input2 != 250 && input2 != 267 && input2 != 220 && input2 != 160 && input2 != 100 && input2 != 0 && input2 !=80 && input2 != 210){
                return -1;
                }
    if (input3 != 200 && input3 != 105 && input3 != 250 && input3 != 267 && input3 != 220 && input3 != 160 && input3 != 100 && input3 != 0 && input3 !=80 && input3 != 210){
                return -1;
                }
    if (input5 != 200 && input5 != 105 && input5 != 250 && input5 != 267 && input5 != 220 && input5 != 160 && input5 != 100 && input5 != 0 && input5 !=80 && input5 != 210){
                return -1;
                }


//consequence for poor food choices (pop-tart, Lucky Charms, and nothing)   
        if (input1 == 200 || input1 == 220 || input1 == 0) {
            healthBenefit1 = 50;
        }
        //no consequence because they made good choices
        else {
            healthBenefit1 = 0;
        }
        if (input2 == 200 || input2== 220 ||input2 == 0) {
            healthBenefit2 = 50;
        }
        else {
            healthBenefit2 = 0;
        }
        if (input3 == 200 || input3 == 220 ||input3 == 0) {
            healthBenefit3 = 50;
        }
        else {
            healthBenefit3 = 0;
        }
        if (input5 == 200 || input5 == 220 ||input5 == 0) {
            healthBenefit4 = 50;
        }
        else {
            healthBenefit4 = 0;
        }
            
    double caloriesConsumed = (input1 + input2 + input3 + input5) - (healthBenefit1 + healthBenefit2 + healthBenefit3 + healthBenefit4);
    
    
    return caloriesConsumed;
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
        for (int i = 0;i < breakfastList.length -1; i++) // advance the position through the entire array
        {
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
