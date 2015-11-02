   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wendy
 * @author Lisa
 */
public class BreakfastFood implements Serializable{
    private String foodName;
    private double calorieCount1;
    private double healthBenefit1;

    public BreakfastFood() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getCalorieCount1() {
        return calorieCount1;
    }

    public void setCalorieCount(double calorieCount1) {
        this.calorieCount1 = calorieCount1;
    }

    public double getHealthBenefit1() {
        return healthBenefit1;
    }

    public void setHealthBenefit(double healthBenefit1) {
        this.healthBenefit1 = healthBenefit1;
    }

    @Override
    public String toString() {
        return "BreakfastFood{" + "foodName=" + foodName + ", calorieCount1=" + calorieCount1 + ", healthBenefit1=" + healthBenefit1 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.foodName);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.calorieCount1) ^ (Double.doubleToLongBits(this.calorieCount1) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.healthBenefit1) ^ (Double.doubleToLongBits(this.healthBenefit1) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BreakfastFood other = (BreakfastFood) obj;
        if (!Objects.equals(this.foodName, other.foodName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calorieCount1) != Double.doubleToLongBits(other.calorieCount1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthBenefit1) != Double.doubleToLongBits(other.healthBenefit1)) {
            return false;
        }
        return true;
    }
    
    
    
}
