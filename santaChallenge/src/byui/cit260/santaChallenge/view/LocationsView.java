/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import java.io.Serializable;

/**
 *
 * @author Wendy
 */
public class LocationsView extends View {

    public LocationsView() {
        super("\n"
                + "\n************************************"
                + "\nX - pick an x coordinate"
                + "\nY - pick a y coordinate"
                + "\nE - Exit the game");
    }
    
    @Override
    public boolean doAction(Object obj) {
         String value = (String) obj;
       // value = value.toUpperCase();
        
        switch (value){
            case "X"://start a new game
                this.move();
                break;
            case "Y"://restart and existing game
                this.move();
                break;
            case "E"://exit the program
                System.out.println("\n*** Thank you for playing the Santa Challenge!");
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        } 
        return false;
    }

    private void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 }
    
