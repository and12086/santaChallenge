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
    private double pullCapacity;
    private double numberOfPresents;
    private double flyingSpeed;

    public Sleigh() {
        this.description = "/n Santa's sleigh is a valuable tool.  Without it "
                + "Santa would not be able to deliever all the presents to children"
                + " throughout the world. Be careful how you load it.  Too many presents "
                + "and/or not enough reindeer will slow down your flying speed and "
                + "you won't make it to all the continents.";
        this.pullCapacity = 0;
        this.numberOfPresents = 0;
        this.flyingSpeed = 0;
    }
    
    public double getPullCapacity() {
        return pullCapacity;
    }

    public void setPullCapacity(double pullCapacity) {
        this.pullCapacity = pullCapacity;
    }

    public double getNumberOfPresents() {
        return numberOfPresents;
    }

    public void setNumberOfPresents(double numberOfPresents) {
        this.numberOfPresents = numberOfPresents;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public String toString() {
        return "Sleigh{" + "pullCapacity=" + pullCapacity + ", numberOfPresents=" + numberOfPresents + ", flyingSpeed=" + flyingSpeed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.pullCapacity) ^ (Double.doubleToLongBits(this.pullCapacity) >>> 32));
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
        if (Double.doubleToLongBits(this.pullCapacity) != Double.doubleToLongBits(other.pullCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfPresents) != Double.doubleToLongBits(other.numberOfPresents)) {
            return false;
        }
        if (Double.doubleToLongBits(this.flyingSpeed) != Double.doubleToLongBits(other.flyingSpeed)) {
            return false;
        }
        return true;
    }
    
    
}
