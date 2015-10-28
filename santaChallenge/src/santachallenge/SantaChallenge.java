/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import byui.cit260.santaChallenge.model.BreakfastFood;
import byui.cit260.santaChallenge.model.DeliveryScene;
import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.InventoryView;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.NorthPoleScene;
import byui.cit260.santaChallenge.model.Player;
import byui.cit260.santaChallenge.model.Present;
import byui.cit260.santaChallenge.model.Reindeer;
import byui.cit260.santaChallenge.model.Santa;
import byui.cit260.santaChallenge.model.Sleigh;
import byui.cit260.santaChallenge.view.StartProgramView;

/**
 *
 * @author Wendy
 * @author Lisa   
 */
public class SantaChallenge {

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creat StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();       
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SantaChallenge.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SantaChallenge.player = player;
    }    
        
        //Player playersName = new Player();
        
            //playersName.setName("Lisa");
            //playerOne.setBestTime(7.00);
        
            //String playerInfo = playersName.toString();
            //System.out.println(playerInfo);
        
        /*Sleigh sleighOne = new Sleigh();
        
            sleighOne.setTotalWeight(400);
            sleighOne.setPresentNumber(2);
            sleighOne.setFlyingSpeed(3000);
        
            String sleighInfo = sleighOne.toString();
            System.out.println(sleighInfo);
        
        Santa santaOne = new Santa();
        
            santaOne.setName("Santa");
            santaOne.setEnergyPoints(100);
            santaOne.setTime(24);
            
            String santaInfo = santaOne.toString();
            System.out.println(santaInfo);
            
        Map mapOne = new Map();
        
            mapOne.setPlaceNameFind("Tokyo");
            mapOne.setMilesFind(5000);
            
            String mapInfo = mapOne.toString();
            System.out.println(mapInfo);
            
        DeliveryScene deliverySceneOne = new DeliveryScene();
        
            deliverySceneOne.setDescription("The sleigh touches down lightly on the roof of an apartment complex. Santa decides to use the "
                    + "fire ladder running down the side of the building. It goes right past the sleeping child's window.");
            deliverySceneOne.setPresentsDelivered(1);
            
            String deliverySceneInfo = deliverySceneOne.toString();
            System.out.println(deliverySceneInfo);
            
        InventoryView inventoryViewOne = new InventoryView();
        
            inventoryViewOne.setEnergyPoints(46);
            inventoryViewOne.setTimeRemaining(14);
            inventoryViewOne.setCurrentFlyingSpeed(2075);
            
            String inventoryViewInfo = inventoryViewOne.toString();
            System.out.println(inventoryViewInfo);
            
        Location locationOne = new Location();
            
            locationOne.setPlaceName("Tokyo");
            locationOne.setVisited("Yes");
            locationOne.setTimeRemaining(14);
            locationOne.setEnergyPoints(46);
            locationOne.setMilesTraveled(5000);
            
            String locationInfo = locationOne.toString();
            System.out.println(locationInfo);
            
            
        Reindeer reindeerOne = new Reindeer();
            
            reindeerOne.setName("Dasher");
            reindeerOne.setPullCapacity(50);
            
            String reindeerInfo = reindeerOne.toString();
            System.out.println(reindeerInfo);
            
        Present presentOne = new Present();
        
            presentOne.setPresentWeight(50);
            
            String presentInfo = presentOne.toString();
            System.out.println(presentInfo);
            
        Game gameOne = new Game();
        
            gameOne.setTimeLimit(24);
            gameOne.setCompanion("Frosty");
            
            String gameInfo = gameOne.toString();
            System.out.println(gameInfo);
            
        BreakfastFood breakfastFoodOne = new BreakfastFood();
            
            breakfastFoodOne.setFoodName("Poptart");
            breakfastFoodOne.setCalorieCount(140);
            breakfastFoodOne.setHealthBenefit(-300);
            
            String breakfastFoodInfo = breakfastFoodOne.toString();
            System.out.println(breakfastFoodInfo);
            
        NorthPoleScene northPoleSceneOne = new NorthPoleScene();
     
            northPoleSceneOne.setDescription("Santa's kitchen is warm and toasty, full of good things to eat!");
            northPoleSceneOne.setActivityName("Fuel Santa for his journey ahead!");
            
            String northPoleSceneInfo = northPoleSceneOne.toString();
            System.out.println(northPoleSceneInfo);**/
    

    
}
