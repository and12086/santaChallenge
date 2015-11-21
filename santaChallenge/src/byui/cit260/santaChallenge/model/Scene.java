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
 * @author Lisa Lou
 */
public class Scene implements Serializable {   
    
    private String description;
    private String mapSymbol;
    private boolean blocked;
    private double milesFromNorthPole;

    public Scene() {
    } 
    
    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public double getMilesFromNorthPole() {
        return milesFromNorthPole;
    }

    public void setMilesFromNorthPole(double milesFromNorthPole) {
        this.milesFromNorthPole = milesFromNorthPole;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.mapSymbol);
        hash = 59 * hash + (this.blocked ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.milesFromNorthPole) ^ (Double.doubleToLongBits(this.milesFromNorthPole) >>> 32));
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (Double.doubleToLongBits(this.milesFromNorthPole) != Double.doubleToLongBits(other.milesFromNorthPole)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", mapSymbol=" + mapSymbol + ", blocked=" + blocked + ", milesFromNorthPole=" + milesFromNorthPole + '}';
    }


    

    

}
