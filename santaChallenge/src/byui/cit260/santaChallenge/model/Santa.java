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
public enum Santa implements Serializable{
       
    Santa("The big man himself"),
    Mrs_Claus("She is Santa's wife and the true brains behind the operation"),
    Frosty("One of Santa's oldest friends"),
    Rudolph("Santa's lead reindeer"),
    Jingle("Santa's head elf"),
    Grinch("Santa's nemesis");
    
//class instance variables
    //private final double energyPoints;
    //private final double time;
    private final String description;
    private final Point coordinates;

    Santa(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    /*public double getEnergyPoints() {
        return energyPoints;
    }

    public double getTime() {
        return time;
    }*/

    public String getDescription() {
        return description;
    }

     public Point getCoordinates() {
        return coordinates;
    }
}
    /*@Override
    public String toString() {
        return "Santa{" + "name=" + name + ", energyPoints=" + energyPoints + ", time=" + time + '}';
    }*/
