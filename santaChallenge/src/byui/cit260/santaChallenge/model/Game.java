/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Wendy
 * @author Lisa
 */
public class Game implements Serializable {
    
    public double time;
    private Map map;
    private Player player;
    private Sleigh sleigh;
    
    private InventoryItem[] inventory;
    private String[] actor;
    private BreakfastFood[] breakfastFood;
    
    public Game() {
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
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

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventoryItem(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

     public BreakfastFood[] getBreakfastFood() {
        return breakfastFood;
    }

    public void setBreakfastFood(BreakfastFood[] breakfastFood) {
        this.breakfastFood = breakfastFood;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.map);
        hash = 29 * hash + Objects.hashCode(this.player);
        hash = 29 * hash + Objects.hashCode(this.sleigh);
        hash = 29 * hash + Arrays.deepHashCode(this.inventory);
        hash = 29 * hash + Arrays.deepHashCode(this.actor);
        hash = 29 * hash + Arrays.deepHashCode(this.breakfastFood);
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
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.sleigh, other.sleigh)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        if (!Arrays.deepEquals(this.breakfastFood, other.breakfastFood)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "timeLimit=" + time + ", map=" + map + ", player=" + player + ", sleigh=" + sleigh + ", inventory=" + inventory + ", actor=" + actor + ", breakfastFood=" + breakfastFood + '}';
    }
    
    //public void setInventory(InventoryItem[] inventoryList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public Scene[] getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
