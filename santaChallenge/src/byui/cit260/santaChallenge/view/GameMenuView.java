/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import java.util.Scanner;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
        super ("\n"
            + "\n*********************************************"
            + "\n| Game Menu                                 |"
            + "\n*********************************************"
            + "\n Where to now chief? The night is up to you.*"
            + "\n Choose an option from below.              *"
            + "\n*********************************************"
            + "\nM - View Map/Choose a Location              *"
            + "\nF - Feed Santa                              *"
            + "\nL - Load the sleigh, and choose reindeer    *"
            + "\nI - View your inventory                     *"
            + "\nC - Continue your game                      *"
            + "\n*********************************************");   
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        //value = value.toUpperCase();
        
        switch (value){
            case "M"://View Map/Choose Location
                this.mapView();
                break;
            case "F"://Feed Santa
                this.feedSanta();
                break;
            case "L"://Load Sleigh/Choose Reindeer
                this.loadSleigh();
                break;
            case "I"://View Inventory
                this.inventory();
                break; 
            case "C"://return to your game
                return true;    
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
        return false;
                
    }

   
    private void continueGame() {
        System.out.println("*** continueGame function called");
    }

    private void mapView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void feedSanta() {
        FeedSantaView feedSanta = new FeedSantaView();
        feedSanta.display();
    }
    
    private void loadSleigh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

