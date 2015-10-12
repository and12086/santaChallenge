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
public class Reindeer implements Serializable{
   private String name;
   private double pullCapacity;

    public Reindeer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPullCapacity() {
        return pullCapacity;
    }

    public void setPullCapacity(double pullCapacity) {
        this.pullCapacity = pullCapacity;
    }

    @Override
    public String toString() {
        return "Reindeer{" + "name=" + name + ", pullCapacity=" + pullCapacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.pullCapacity) ^ (Double.doubleToLongBits(this.pullCapacity) >>> 32));
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
        final Reindeer other = (Reindeer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pullCapacity) != Double.doubleToLongBits(other.pullCapacity)) {
            return false;
        }
        return true;
    }
   
   
}
