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
    private String description;
    private double numberOfPresents;
    private double numberOfReindeer;
    private double flyingSpeed;

    public Sleigh() {
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumberOfPresents() {
        return numberOfPresents;
    }

    public void setNumberOfPresents(double numberOfPresents) {
        this.numberOfPresents = numberOfPresents;
    }

    public double getNumberOfReindeer() {
        return numberOfReindeer;
    }

    public void setNumberOfReindeer(double numberOfReindeer) {
        this.numberOfReindeer = numberOfReindeer;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public String toString() {
        return "Sleigh{" + ", numberOfPresents=" + numberOfPresents + ", flyingSpeed=" + flyingSpeed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numberOfPresents) ^ (Double.doubleToLongBits(this.numberOfPresents) >>> 32));
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
        if (Double.doubleToLongBits(this.numberOfPresents) != Double.doubleToLongBits(other.numberOfPresents)) {
            return false;
        }
        if (Double.doubleToLongBits(this.flyingSpeed) != Double.doubleToLongBits(other.flyingSpeed)) {
            return false;
        }
        return true;
    }
    
    
}
