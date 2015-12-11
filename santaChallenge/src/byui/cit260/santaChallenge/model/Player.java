/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.santaChallenge.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Wendy
 */
public class Player implements Serializable {
    
    //class instance variables
    private String name;
    private double bestTime;
    private Actor actor;
    
    public Player() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + 
        (int) (Double.doubleToLongBits(this.bestTime) ^ 
        (Double.doubleToLongBits(this.bestTime) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != 
            Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }

    
    
}
