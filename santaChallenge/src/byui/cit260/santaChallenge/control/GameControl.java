/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.BreakfastFood;
import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.InventoryView;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Player;
import byui.cit260.santaChallenge.model.Sleigh;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        SantaChallenge.setCurrentGame(game); //save in Santa Challenge
        
        game.setPlayer(player); //save player in game
        
        // create the inventory list and save in the game
        InventoryView[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Sleigh sleigh = new Sleigh(); //create new sleigh
        game.setSleigh(sleigh); //save sleigh in game
        
        BreakfastFood[] calories = GameControl.createCalories();
        game.setBreakfastFood(calories);
        
        Map map = MapControl.createMap();//create and initialize new map
        game.setMap(map);//save map in game
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    public enum Item {
        energyPoints,
        time;
}
    
    
    public static InventoryView[] createInventoryList() {
        
        //created array(list) of inventory items
        InventoryView[] inventory = new InventoryView[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryView energyPoints = new InventoryView();
        energyPoints.setDescription("Energy Points");
        energyPoints.setEnergyLevel(0);
        energyPoints.setRequiredCalories(500);
        inventory[Item.energyPoints.ordinal()] = energyPoints;
        
        
        InventoryView time = new InventoryView();
        time.setDescription ("The time that you have left to deliver all the presents.");
        time.setTimeRemaining(0);
        time.setTimeAvailable(24);
        inventory[Item.time.ordinal()] = time;
        
        return inventory;
    }

    private static BreakfastFood[] createCalories() {
        System.out.println("*** called createCalories() in GameControl ***");
        return null;
    }   
}
