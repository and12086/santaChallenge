/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.control.MapControl;
import byui.cit260.santaChallenge.model.BreakfastFood;
import byui.cit260.santaChallenge.model.InventoryItem;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Scene;


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
                this.displayMap();
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
                this.continueGame();    
            default:
                System.out.println("\n*** Invalid selection *** Try again!");
                break;        
        }
        return false;
                
    }

   
    private void continueGame() {
        System.out.println("*** continueGame function called");
    }

    private void feedSanta() {
        
        FeedSantaView feedSanta = new FeedSantaView();
        feedSanta.display();
    }
    
    private void loadSleigh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inventory() {
        //get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                            "Required" + "\t" +
                            "Acquired");
        
        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //DISPLAY the description, the required amount, and the amount the user has)
            System.out.println(inventoryItem.getDescription() + "\t  " +
                               inventoryItem.getRequiredAmount() + "\t  " +
                               inventoryItem.getActualAmount());
 
        }
    }

  

    private void displayMap() {
        
        Location[][] locations = map.getLocations();
        
        System.out.println("Map Locations");
        System.out.println(0 + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);
        
        int noOfRows = 5;
        for (int row=0; row < noOfRows; row++){
            System.out.println("*****" + "\n" + row); 
                    
        }
        int noOfColumns = 5;
        
        for (int column=0; column < noOfColumns; column++){
            System.out.println("|");          
            System.out.println(locations = locations[row][column]);
        }
          
            
            if (location.isVisited() = true){
                System.out.println(scenes.getMapSymbol());
            }
                else{
                System.out.println("??");//print to indicate location has not been visited yet
            }
            System.out.println("*****");//print final row divider
}
        //call the MaxValue function
        Scene[] scenes = MapControl.getMaxValue();
        //display a header
        System.out.println("\nThe furthest location Santa must deliver to:");
        //return the maxValue
        return MaxValue;
        
        //call the minValue function
         Scene[] scenes = MapControl.getMinValue();
        //display a header
        System.out.println("\nThe clostest location Santa must deliver to:");
        //return the minValue
        return MinValue;
        
  

}
        
        
    

