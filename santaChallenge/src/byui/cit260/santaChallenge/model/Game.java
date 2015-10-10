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
public class Game implements Serializable {
    private double timeLimit;
    private String companion;

    public Game() {
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getCompanion() {
        return companion;
    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }

    @Override
    public String toString() {
        return "Game{" + "timeLimit=" + timeLimit + ", companion=" + companion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.timeLimit) ^ (Double.doubleToLongBits(this.timeLimit) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.companion);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timeLimit) != Double.doubleToLongBits(other.timeLimit)) {
            return false;
        }
        if (!Objects.equals(this.companion, other.companion)) {
            return false;
        }
        return true;
    }
    
    
}
