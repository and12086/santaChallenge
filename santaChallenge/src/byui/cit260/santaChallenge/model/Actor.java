/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Wendy
 */
public enum Actor implements Serializable{
    
    Santa ("The big guy himself....who hasn't wanted to be the 'REAL' Santa"),
    Mrs_Claus("She is Santa's wife and the true brains behind the operation"),
    Frosty("One of Santa's oldest friends"),
    Rudolph("Santa's lead reindeer"),
    Jingle("Santa's head elf"),
    Grinch("Santa's nemesis");
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(0,0);
    }

    public String getDescription() {
        return description;
    }

     public Point getCoordinates() {
        return coordinates;
    }
}
    /*@Override
    public String toString() {
        return "Actor{" + "name=" + name + ", energyPoints=" + energyPoints + ", time=" + time + '}';
    }*/
