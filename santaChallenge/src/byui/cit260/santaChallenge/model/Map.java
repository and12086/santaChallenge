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
public class Map implements Serializable{
    
    //class instance variables
    private String placeNameFind;
    private double milesFind;

    public Map() {
    }
    
    public String getPlaceNameFind() {
        return placeNameFind;
    }

    public void setPlaceNameFind(String placeNameFind) {
        this.placeNameFind = placeNameFind;
    }

    public double getMilesFind() {
        return milesFind;
    }

    public void setMilesFind(double milesFind) {
        this.milesFind = milesFind;
    }

    @Override
    public String toString() {
        return "Map{" + "placeNameFind=" + placeNameFind + ", milesFind=" + milesFind + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.placeNameFind);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.milesFind) ^ (Double.doubleToLongBits(this.milesFind) >>> 32));
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.placeNameFind, other.placeNameFind)) {
            return false;
        }
        if (Double.doubleToLongBits(this.milesFind) != Double.doubleToLongBits(other.milesFind)) {
            return false;
        }
        return true;
    }
    
    
    
}
