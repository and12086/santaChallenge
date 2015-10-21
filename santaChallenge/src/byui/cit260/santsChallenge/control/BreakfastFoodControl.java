/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santsChallenge.control;

/**
 *
 * @author Lisa Lou
 */
public class BreakfastFoodControl {
    
    public double calcCaloriesConsumed(double calorieCount1, double calorieCount2, double calorieCount3, double calorieCount4, double healthBenefit) {
        
 
        //consequence for poor food choices (pop-tart, Lucky Charms, and nothing)   
        if (calorieCount1 == 1 || calorieCount1 == 5 ||calorieCount1 == 8) {
            return healthBenefit = 50;
        }
        if (calorieCount2 == 1 || calorieCount2== 5 ||calorieCount2 == 8) {
            return healthBenefit = 50;
        }
        if (calorieCount3 == 1 || calorieCount3 == 5 ||calorieCount3 == 8) {
            return healthBenefit = 50;
        }
        if (calorieCount4 == 1 || calorieCount4 == 5 ||calorieCount4 == 8) {
            return healthBenefit = 50;
        }
        
        //no consequence because they made good choices
        else {
           return healthBenefit = 0;
        }
        
        
    double caloriesConsumed = (calorieCount1 + calorieCount2 + calorieCount3 + calorieCount4)- healthBenefit;
    
    
    return caloriesConsumed;
    }
    
}
