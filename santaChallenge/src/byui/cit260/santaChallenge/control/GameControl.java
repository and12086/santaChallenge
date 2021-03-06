/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.Actor;
import byui.cit260.santaChallenge.model.BreakfastFood;
import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.InventoryItem;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Player;
import byui.cit260.santaChallenge.model.Sleigh;
import citbyui.cit260.santaChallenge.exceptions.GameControlException;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import citbyui.cit260.santaChallenge.exceptions.SleighControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException, SleighControlException {
        Game game = new Game(); // create new game
        SantaChallenge.setCurrentGame(game); //save in Santa Challenge
        
        player.setActor(Actor.Santa);//assigns an actor to the player 
        game.setPlayer(player); //save player in game
        
      
        
        // create the inventory list and save in the game
        InventoryItem[] inventory = GameControl.createInventoryList();
        game.setInventoryItem(inventory);
        
        Sleigh sleigh = new Sleigh(); //create new sleigh
        game.setSleigh(sleigh); //save sleigh in game
        
        BreakfastFood[] breakfastFood = GameControl.createBreakfastList();
        game.setBreakfastFood(breakfastFood);
        
        Map map = MapControl.createMap();//create and initialize new map
        game.setMap(map);//save map in game
        
        
        //initialize total time
        game.setTime(24);
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
                       
    }

    public static InventoryItem[] getSortedInventoryList(InventoryItem[] originalInventoryList) {
       
        //get inventory list for the current game
        //InventoryItem[] originalInventoryList = 
          //      SantaChallenge.getCurrentGame().getInventory();
        
        //clone originalList
        InventoryItem[] inventory = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryList;
        for (int i = 0; i < inventory.length-1; i++) {
            int index = i;
            
            for (int j = i +1; j < inventory.length; j++) {
                if (inventory[j].getDescription().compareTo(inventory[index].getDescription()) < 0)
                index = j;
                
                    tempInventoryList = inventory[index];
                    inventory[index] = inventory[i];
                    inventory[i] = tempInventoryList;
                }
        }
        return  inventory;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        Game game = null;
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            
            output.writeObject(game);//write the game object out to the file
        }  catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();//read the game object from file
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        SantaChallenge.setCurrentGame(game);//save in SantaChallenge
    }

    
    
    public enum Item {
        energyPoints,
        flyingSpeed,
        timeRemaining;
    }
    
    public static InventoryItem[] createInventoryList() {
        
        //created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[Item.values().length];
        
        InventoryItem energyPoints = new InventoryItem();
        energyPoints.setDescription("Energy Points - Did you feed Santa enough healthy foods at breakfast to get him through his deliveries?");
        energyPoints.setRequiredAmount(500);
        energyPoints.setActualAmount(0);
        inventory[Item.energyPoints.ordinal()] = energyPoints;
        
        InventoryItem flyingSpeed = new InventoryItem();
        flyingSpeed.setDescription("Flying Speed - Did you load the sleigh with a good ratio of presents to reindeer?");
        flyingSpeed.setRequiredAmount(0);
        flyingSpeed.setActualAmount(0);
        inventory[Item.flyingSpeed.ordinal()] = flyingSpeed;
       
        InventoryItem time = new InventoryItem();
        time.setDescription("Time - How much time do you have left to help Santa finish his deliveries?");
        time.setRequiredAmount(24);
        time.setActualAmount(24);
        inventory[Item.timeRemaining.ordinal()] = time;
        
        return inventory;
    }
    

    public enum Food {
    poptarts,
    banana,
    ham_Cheese_Omelet,
    toast_with_PeanutButter,
    lucky_Charms,
    oatmeal,
    yogurt,
    nothing,
    bacon,
    sausage;
    }
    
    public static BreakfastFood[] createBreakfastList() {
         //created array(list) of inventory items
        BreakfastFood[] breakfastFood = new BreakfastFood[Constants.NUMBER_OF_BREAKFAST_FOODS];
        
        BreakfastFood poptarts = new BreakfastFood();
        poptarts.setDescription("Poptarts");
        poptarts.setCalorieCount(200);
        poptarts.setHealthBenefit(50);
        breakfastFood[Food.poptarts.ordinal()] = poptarts;
        
        BreakfastFood banana = new BreakfastFood();
        banana.setDescription("Banana");
        banana.setCalorieCount(105);
        banana.setHealthBenefit(0);
        breakfastFood[Food.banana.ordinal()] = banana;
        
        BreakfastFood ham_Cheese_Omelet = new BreakfastFood();
        ham_Cheese_Omelet.setDescription("Ham & Cheese Omelet");
        ham_Cheese_Omelet.setCalorieCount(250);
        ham_Cheese_Omelet.setHealthBenefit(0);
        breakfastFood[Food.ham_Cheese_Omelet.ordinal()] = ham_Cheese_Omelet;
        
        BreakfastFood toast_with_PeanutButter = new BreakfastFood();
        toast_with_PeanutButter.setDescription("Toast with Peanut Butter");
        toast_with_PeanutButter.setCalorieCount(267);
        toast_with_PeanutButter.setHealthBenefit(0);
        breakfastFood[Food.toast_with_PeanutButter.ordinal()] = toast_with_PeanutButter;
        
        BreakfastFood lucky_Charms = new BreakfastFood();
        lucky_Charms.setDescription("Lucky Charms with Milk");
        lucky_Charms.setCalorieCount(220);
        lucky_Charms.setHealthBenefit(50);
        breakfastFood[Food.lucky_Charms.ordinal()] = lucky_Charms;
        
        BreakfastFood oatmeal = new BreakfastFood();
        oatmeal.setDescription("Oatmeal");
        oatmeal.setCalorieCount(160);
        oatmeal.setHealthBenefit(0);
        breakfastFood[Food.oatmeal.ordinal()] = oatmeal;
        
        BreakfastFood yogurt = new BreakfastFood();
        yogurt.setDescription("Yogurt");
        yogurt.setCalorieCount(100);
        yogurt.setHealthBenefit(0);
        breakfastFood[Food.yogurt.ordinal()] = yogurt;
        
        BreakfastFood nothing = new BreakfastFood();
        nothing.setDescription("Nothing - Too Busy!");
        nothing.setCalorieCount(0);
        nothing.setHealthBenefit(50);
        breakfastFood[Food.nothing.ordinal()] = nothing;
        
        BreakfastFood bacon = new BreakfastFood();
        bacon.setDescription("Bacon - 2 slices");
        bacon.setCalorieCount(80);
        bacon.setHealthBenefit(0);
        breakfastFood[Food.bacon.ordinal()] = bacon;
        
        BreakfastFood sausage = new BreakfastFood();
        sausage.setDescription("Sausage - 2 links");
        sausage.setCalorieCount(210);
        sausage.setHealthBenefit(0);
        breakfastFood[Food.sausage.ordinal()] = sausage;
        
        return breakfastFood;
    }
}

