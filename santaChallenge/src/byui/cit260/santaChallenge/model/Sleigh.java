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
public class Sleigh implements Serializable{
    //class instance variables
    private double totalWeight;
    private double presentNumber;
    private double flyingSpeed;

    public Sleigh() {
    }
    
    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getPresentNumber() {
        return presentNumber;
    }

    public void setPresentNumber(double presentNumber) {
        this.presentNumber = presentNumber;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public String toString() {
        return "Sleigh{" + "totalWeight=" + totalWeight + ", presentNumber=" + presentNumber + ", flyingSpeed=" + flyingSpeed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.totalWeight) ^ (Double.doubleToLongBits(this.totalWeight) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.presentNumber) ^ (Double.doubleToLongBits(this.presentNumber) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.flyingSpeed) ^ (Double.doubleToLongBits(this.flyingSpeed) >>> 32));
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
        final Sleigh other = (Sleigh) obj;
        if (Double.doubleToLongBits(this.totalWeight) != Double.doubleToLongBits(other.totalWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.presentNumber) != Double.doubleToLongBits(other.presentNumber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.flyingSpeed) != Double.doubleToLongBits(other.flyingSpeed)) {
            return false;
        }
        return true;
    }
    
    
}
