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
 */
public class BreakfastFood implements Serializable{
    private String foodName;
    private double calorieCount;
    private double healthBenefit;

    public BreakfastFood() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
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

    @Override
    public String toString() {
        return "BreakfastFood{" + "foodName=" + foodName + ", calorieCount=" + calorieCount + ", healthBenefit=" + healthBenefit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.foodName);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.calorieCount) ^ (Double.doubleToLongBits(this.calorieCount) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.healthBenefit) ^ (Double.doubleToLongBits(this.healthBenefit) >>> 32));
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
        if (Double.doubleToLongBits(this.calorieCount) != Double.doubleToLongBits(other.calorieCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthBenefit) != Double.doubleToLongBits(other.healthBenefit)) {
            return false;
        }
        return true;
    }
    
    
    
}
