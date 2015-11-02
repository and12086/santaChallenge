/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

/**
 *
 * @author Lisa Lou
 */
public class BreakfastFoodControl {
    
    public double calcCaloriesConsumed(double calorieCount1, double calorieCount2, double calorieCount3, double calorieCount4, 
                double healthBenefit1, double healthBenefit2, double healthBenefit3, double healthBenefit4) {

if (calorieCount1 != 200 && calorieCount1 != 105 && calorieCount1 != 250 && calorieCount1 != 267 && calorieCount1 != 220 && calorieCount1 != 160 && calorieCount1 != 100 && calorieCount1 != 0 && calorieCount1 !=80 && calorieCount1 != 210){
            return -1;
            }
if (calorieCount2 != 200 && calorieCount2 != 105 && calorieCount2 != 250 && calorieCount2 != 267 && calorieCount2 != 220 && calorieCount2 != 160 && calorieCount2 != 100 && calorieCount2 != 0 && calorieCount2 !=80 && calorieCount2 != 210){
            return -1;
            }
if (calorieCount3 != 200 && calorieCount3 != 105 && calorieCount3 != 250 && calorieCount3 != 267 && calorieCount3 != 220 && calorieCount3 != 160 && calorieCount3 != 100 && calorieCount3 != 0 && calorieCount3 !=80 && calorieCount3 != 210){
            return -1;
            }
if (calorieCount4 != 200 && calorieCount4 != 105 && calorieCount4 != 250 && calorieCount4 != 267 && calorieCount4 != 220 && calorieCount4 != 160 && calorieCount4 != 100 && calorieCount4 != 0 && calorieCount4 !=80 && calorieCount4 != 210){
            return -1;
            }


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
