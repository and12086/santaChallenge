   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.model;

import java.io.Serializable;

/**
 *
 * @author Wendy
 * @author Lisa
 */
public class BreakfastFood implements Serializable{
    
    private String description;
    private double calorieCount;
    private double healthBenefit;
    
    public BreakfastFood(){
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(double calorieCount) {
        this.calorieCount = calorieCount;
    }

    public double getHealthBenefit() {
        return healthBenefit;
    }

    public void setHealthBenefit(double healthBenefit) {
        this.healthBenefit = healthBenefit;
    }
}
