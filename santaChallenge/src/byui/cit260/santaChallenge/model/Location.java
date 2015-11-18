/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Wendy
 */
public class Location implements Serializable{
    
    
    private int row;
    private int column;
    private boolean visited;
    private DeliveryScene deliveryScene;
    private DeliveryScene northPoleScene;
    private ArrayList<Santa> santa;
    
    //class instance variables
    /*
    private String placeName;
    private String visited;
    private double timeRemaining;
    private double energyPoints;
    private double milesTraveled;
   */
    public Location() {
    }

    
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }
    
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public DeliveryScene getDeliveryScene() {
        return deliveryScene;
    }

    public void setDeliveryScene(DeliveryScene deliveryScene) {
        this.deliveryScene = deliveryScene;
    }

    public DeliveryScene getNorthPoleScene() {
        return northPoleScene;
    }

    public void setNorthPoleScene(DeliveryScene northPoleScene) {
        this.northPoleScene = northPoleScene;
    }

    public ArrayList<Santa> getSanta() {
        return santa;
    }

    public void setSanta(ArrayList<Santa> santa) {
        this.santa = santa;
    }


   

}

    
    
    
    /*
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public double getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(double energyPoints) {
        this.energyPoints = energyPoints;
    }

    public double getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(double milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    @Override
    public String toString() {
        return "Location{" + "placeName=" + placeName + ", visited=" + visited + ", timeRemaining=" + timeRemaining + ", energyPoints=" + energyPoints + ", milesTraveled=" + milesTraveled + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.placeName);
        hash = 47 * hash + Objects.hashCode(this.visited);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.energyPoints) ^ (Double.doubleToLongBits(this.energyPoints) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.milesTraveled) ^ (Double.doubleToLongBits(this.milesTraveled) >>> 32));
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.placeName, other.placeName)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyPoints) != Double.doubleToLongBits(other.energyPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.milesTraveled) != Double.doubleToLongBits(other.milesTraveled)) {
            return false;
        }
        return true;
    }
    
    
    
}
 */