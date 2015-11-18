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
 * @author Lisa
 */
public class Game implements Serializable {
    private double timeLimit;
    
    private Map map;
    private Player player;
    private Sleigh sleigh;
    
    private InventoryView[] inventory;
    private String[] santa;
    private BreakfastFood[] breakfastFood;
    
    public Game() {
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Sleigh getSleigh() {
        return sleigh;
    }

    public void setSleigh(Sleigh sleigh) {
        this.sleigh = sleigh;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public InventoryView[] getInventory() {
        return inventory;
    }

    public void setInventoryVIew(InventoryView[] inventory) {
        this.inventory = inventory;
    }

    public String[] getSanta() {
        return santa;
    }

    public void setSanta(String[] santa) {
        this.santa = santa;
    }

     public BreakfastFood[] getBreakfastFood() {
        return breakfastFood;
    }

    public void setBreakfastFood(BreakfastFood[] breakfastFood) {
        this.breakfastFood = breakfastFood;
    }
    
    /*@Override
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
    }*/

    public void setInventory(InventoryView[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
