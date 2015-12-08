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

      public static double calculateEnergyPoints(double[] calorieCount[0], double[] calorieCount[1], double[] calorieCount[2], double[] calorieCount[3], double[] healthBenefit[0], double[] healthBenefit[1], double[] healthBenefit[2], double[] healthBenefit[3]) {
    
        double energyPoints = (caloriesConsumed[0] + caloriesConsumed[1] + caloriesConsumed[2] + caloriesConsumed[3]) - 
               (healthBenefit[0] + healthBenefit[1] + healthBenefit[2] + healthBenefit[3]);
        
          return energyPoints;
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
    
    
 

