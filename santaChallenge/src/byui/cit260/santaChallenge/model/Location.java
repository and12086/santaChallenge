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
    private Scene scenes;
    private ArrayList<Actor> actor;
    
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
    public Scene getScenes() {
        return scenes;
    }

    public void setScene(Scene scenes) {
        this.scenes = scenes;
    }

    public ArrayList<Actor> getActor() {
        return actor;
    }

    public void setActor(ArrayList<Actor> actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        hash = 53 * hash + (this.visited ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.scenes);
        hash = 53 * hash + Objects.hashCode(this.actor);
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scenes, other.scenes)) {
            return false;
        }
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scenes + ", actor=" + actor + '}';
    }
}

