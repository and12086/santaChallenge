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

    private static InventoryView[] createInventoryList() {
        System.out.println("*** called createInventoryList() in GameControl ***");
        return null;      
    }

    private static BreakfastFood[] createCalories() {
        System.out.println("*** called createCalories() in GameControl ***");
        return null;
    }   
}
