/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import byui.cit260.santaChallenge.model.DeliveryScene;
import byui.cit260.santaChallenge.model.InventoryView;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Player;
import byui.cit260.santaChallenge.model.Santa;
import byui.cit260.santaChallenge.model.Sleigh;

/**
 *
 * @author Wendy
 */
public class SantaChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
            playerOne.setName("Lisa");
            playerOne.setBestTime(7.00);
        
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
        
        Sleigh sleighOne = new Sleigh();
        
            sleighOne.setTotalWeight(100);
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
            
    }
    
}
