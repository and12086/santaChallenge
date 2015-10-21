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
    
    public double calcCaloriesConsumed(double calorieCount1, double calorieCount2, double calorieCount3, double calorieCount4, 
                double healthBenefit1, double healthBenefit2, double healthBenefit3, double healthBenefit4) {
        
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
            
    double caloriesConsumed = (calorieCount1 + calorieCount2 + calorieCount3 + calorieCount4) - (healthBenefit1 + healthBenefit2 + healthBenefit3 + healthBenefit4);
    
    
    return caloriesConsumed;
    }
    
}
