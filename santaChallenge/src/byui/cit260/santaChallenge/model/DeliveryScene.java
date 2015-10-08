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
public class DeliveryScene implements Serializable{
    
    //class instance variables
    private String description;
    private double presentsDelivered;

    public DeliveryScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPresentsDelivered() {
        return presentsDelivered;
    }

    public void setPresentsDelivered(double presentsDelivered) {
        this.presentsDelivered = presentsDelivered;
    }

    @Override
    public String toString() {
        return "DeliveryScene{" + "description=" + description + ", presentsDelivered=" + presentsDelivered + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.presentsDelivered) ^ (Double.doubleToLongBits(this.presentsDelivered) >>> 32));
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
        final DeliveryScene other = (DeliveryScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.presentsDelivered) != Double.doubleToLongBits(other.presentsDelivered)) {
            return false;
        }
        return true;
    }
    
    
}
