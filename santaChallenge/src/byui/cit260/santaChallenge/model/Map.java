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
    
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    //class instance variables
    //private String placeNameFind;
    //private double milesFind;

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be greater than zero.");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                //create and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations [row][column] = location;
            }
        }
    } 

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
