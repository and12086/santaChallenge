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
    private double calorieCount2;
    private double healthBenefit2;
    private double calorieCount3;
    private double healthBenefit3;
    private double calorieCount4;
    private double healthBenefit4;
    
    public BreakfastFood() {
        this.foodName = "/n Santa has many options for breakfast. Choose wisely!";
        this.calorieCount1 = 0;
        this.calorieCount2 = 0;
        this.calorieCount3 = 0;
        this.calorieCount4 = 0;
        this.healthBenefit1 = 0;
        this.healthBenefit2 = 0;
        this.healthBenefit3 = 0;
        this.healthBenefit4 = 0;
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

    public void setCalorieCount1(double calorieCount1) {
        this.calorieCount1 = calorieCount1;
    }

    public double getHealthBenefit1() {
        return healthBenefit1;
    }

    public void setHealthBenefit1(double healthBenefit1) {
        this.healthBenefit1 = healthBenefit1;
    }

    public double getCalorieCount2() {
        return calorieCount2;
    }

    public void setCalorieCount2(double calorieCount2) {
        this.calorieCount2 = calorieCount2;
    }

    public double getHealthBenefit2() {
        return healthBenefit2;
    }

    public void setHealthBenefit2(double healthBenefit2) {
        this.healthBenefit2 = healthBenefit2;
    }
    public double getCalorieCount3() {
        return calorieCount3;
    }

    public void setCalorieCount3(double calorieCount3) {
        this.calorieCount3 = calorieCount3;
    }

    public double getHealthBenefit3() {
        return healthBenefit3;
    }

    public void setHealthBenefit3(double healthBenefit3) {
        this.healthBenefit3 = healthBenefit3;
    }
    public double getCalorieCount4() {
        return calorieCount4;
    }

    public void setCalorieCount4(double calorieCount4) {
        this.calorieCount4 = calorieCount4;
    }

    public double getHealthBenefit4() {
        return healthBenefit4;
    }

    public void setHealthBenefit4(double healthBenefit4) {
        this.healthBenefit4 = healthBenefit4;
    }

    @Override
    public String toString() {
        return "BreakfastFood{" + "foodName=" + foodName + ", calorieCount1=" + calorieCount1 + ", healthBenefit1=" + healthBenefit1 + ", calorieCount2=" + calorieCount2 + ", healthBenefit2=" + healthBenefit2 + ", calorieCount3=" + calorieCount3 + ", healthBenefit3=" + healthBenefit3 + ", calorieCount4=" + calorieCount4 + ", healthBenefit4=" + healthBenefit4 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.foodName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calorieCount1) ^ (Double.doubleToLongBits(this.calorieCount1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.healthBenefit1) ^ (Double.doubleToLongBits(this.healthBenefit1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calorieCount2) ^ (Double.doubleToLongBits(this.calorieCount2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.healthBenefit2) ^ (Double.doubleToLongBits(this.healthBenefit2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calorieCount3) ^ (Double.doubleToLongBits(this.calorieCount3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.healthBenefit3) ^ (Double.doubleToLongBits(this.healthBenefit3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calorieCount4) ^ (Double.doubleToLongBits(this.calorieCount4) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.healthBenefit4) ^ (Double.doubleToLongBits(this.healthBenefit4) >>> 32));
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
        if (Double.doubleToLongBits(this.calorieCount2) != Double.doubleToLongBits(other.calorieCount2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthBenefit2) != Double.doubleToLongBits(other.healthBenefit2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calorieCount3) != Double.doubleToLongBits(other.calorieCount3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthBenefit3) != Double.doubleToLongBits(other.healthBenefit3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calorieCount4) != Double.doubleToLongBits(other.calorieCount4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthBenefit4) != Double.doubleToLongBits(other.healthBenefit4)) {
            return false;
        }
        return true;
    }

    
    
    
}
