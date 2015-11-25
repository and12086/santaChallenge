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
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
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
                + "\nS - Display list of scenes                  *"
                + "\n*********************************************");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        //value = value.toUpperCase();

        switch (value) {
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
                this.displayInventoryList();
                break;
            case "C"://return to your game
                this.continueGame();
            case "S"://display the list of scenes
                this.displaySceneList();
            case "D":
                this.displayMaxValue();
            case "V":
                this.displayMinValue();    
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

    private void displayInventoryList() {
        //get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t"
                + "Required" + "\t"
                + "Acquired");

        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            //DISPLAY the description, the required amount, and the amount the user has)
            System.out.println(inventoryItem.getDescription() + "\t  "
                    + inventoryItem.getRequiredAmount() + "\t  "
                    + inventoryItem.getActualAmount());

        }
    }

    private void displayMap() {

        Map map = SantaChallenge.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        System.out.println("Map Locations");
        System.out.println(0 + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);

        int noOfColumns = map.getNoOfColumns();
        int noOfRows = map.getNoOfRows();

        for (int row = 0; row < noOfRows; row++) {
            System.out.println("*****" + "\n" + row);

            for (int column = 0; column < noOfColumns; column++) {
                System.out.print("|");
                Location location = locations[row][column];
                Scene scene = location.getScene();
                System.out.println(scene.getMapSymbol());
                if (!location.isVisited()) {
                    System.out.println(scene.getMapSymbol());
                } else {
                    System.out.println("XX");//print to indicate location has not been visited yet
                }
            }

            System.out.println("|");//print final column divider
        }
        
        
        
        
        
        
    }

    private void displaySceneList() {
        //get the list of scenes in the game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
        //sort the list of scenes
        Scene[] sortedScenes = MapControl.getSortedScenes(scenes);

        //print a title
        System.out.println("List of Scenes and their distance from the North Pole");

        //for each scene in the list
        for (Scene nextScene : sortedScenes) {
            //display the description and the miles from the north pole
            System.out.println(nextScene.getDescription()
                    + " " + nextScene.getMilesFromNorthPole());
        }

    }

    private void displayMaxValue() {
        //get maxValue from the current game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
                Scene maxScene = MapControl.getMaxValue(scenes);
                System.out.println("The location furthest from the North Pole that Santa has to deliver to is" + " " + maxScene);
        //get the maxValue for the current game 
    }
    
    private void displayMinValue() {
        //get maxValue from the current game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
                Scene minScene = MapControl.getMinValue(scenes);
                System.out.println("The location furthest from the North Pole that Santa has to deliver to is" + " " + minScene);
    }
}
   