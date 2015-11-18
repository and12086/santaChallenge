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
 */


public class InventoryView implements Serializable{
    
    //class instance variables
    private double energyLevel;
    private double timeRemaining;
    private double currentFlyingSpeed;
    private String description;
    private double requiredCalories;
    private double timeAvailable;
    
    
    public InventoryView() {
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public double getCurrentFlyingSpeed() {
        return currentFlyingSpeed;
    }

    public void setCurrentFlyingSpeed(double currentFlyingSpeed) {
        this.currentFlyingSpeed = currentFlyingSpeed;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getTimeAvailable() {
        return timeAvailable;
    }
    public void setTimeAvailable(double timeAvailable) {
        this.timeAvailable = timeAvailable;
    }
    
    public double getRequiredCalories() {
        return requiredCalories;
    }
    
    public void setRequiredCalories(double requiredCalories) {
        this.requiredCalories = requiredCalories;
    }
  
}


/*
    @Override
    public String toString() {
        return "InventoryView{" + "energyPoints=" + energyPoints + ", timeRemaining=" + timeRemaining + ", currentFlyingSpeed=" + currentFlyingSpeed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.energyPoints) ^ (Double.doubleToLongBits(this.energyPoints) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.currentFlyingSpeed) ^ (Double.doubleToLongBits(this.currentFlyingSpeed) >>> 32));
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
        final InventoryView other = (InventoryView) obj;
        if (Double.doubleToLongBits(this.energyPoints) != Double.doubleToLongBits(other.energyPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentFlyingSpeed) != Double.doubleToLongBits(other.currentFlyingSpeed)) {
            return false;
        }
        return true;
    }

  */  