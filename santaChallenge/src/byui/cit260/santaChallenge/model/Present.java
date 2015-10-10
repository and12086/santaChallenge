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
public class Present implements Serializable{
    private double presentWeight;

    public Present() {
    }

    public double getPresentWeight() {
        return presentWeight;
    }

    public void setPresentWeight(double presentWeight) {
        this.presentWeight = presentWeight;
    }

    @Override
    public String toString() {
        return "Present{" + "presentWeight=" + presentWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.presentWeight) ^ (Double.doubleToLongBits(this.presentWeight) >>> 32));
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
        final Present other = (Present) obj;
        if (Double.doubleToLongBits(this.presentWeight) != Double.doubleToLongBits(other.presentWeight)) {
            return false;
        }
        return true;
    }

    
   
    }
    
    

