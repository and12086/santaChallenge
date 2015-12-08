/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.GameControl;
import byui.cit260.santaChallenge.control.MapControl;
import byui.cit260.santaChallenge.model.Actor;
import byui.cit260.santaChallenge.model.InventoryItem;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import byui.cit260.santaChallenge.model.Scene;
import java.awt.Point;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n************************************************"
                + "\n| Game Menu                                    |"
                + "\n************************************************"
                + "\n Where to now chief? The night is up to you.   *"
                + "\n Choose an option from below.                  *"
                + "\n************************************************"
                + "\nM - View Map/Choose a Location                 *"
                + "\nF - Feed Santa                                 *"
                + "\nL - Load the sleigh, and choose reindeer       *"
                + "\nI - View your inventory                        *"
                + "\nA - View list of Actors                        *"
                + "\nN - Move to new location                       *"
                + "\nS - Display list of scenes                     *"
                + "\nP - Print the list of breakfast foods          *"
                + "\nD - Display the maximum miles Santa will travel*"
                + "\nV - Display the minimum miles Santa will travel*"
                + "\n************************************************");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        Actor actor;
        Point coordinates;
        
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
            case "A"://view actors
                this.displayActors();
                break;
            case "N"://move to a new location
                this.moveLocations();
                break;
            case "S"://display the list of scenes
                this.displaySceneList();
                break;
            case "P"://print the list of scenes to a file
                this.saveBreakfastFood();
                break;
            case "D":
                this.displayMaxValue();
                break;
            case "V":
                this.displayMinValue();
                break;
            default:
               ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again!");
               break;
        }
        return false;

    }

   
    private void feedSanta() {

        FeedSantaView feedSanta = new FeedSantaView();
        feedSanta.display();
    }

    private void loadSleigh() {
        SleighView sleighView = new SleighView();
            sleighView.getFlyingSpeed();
        }

    public void displayInventoryList() {
        
        //get the list of inventroy items in the game
        InventoryItem[] inventory = SantaChallenge.getCurrentGame().getInventory();
        //sort the list of inventory items
        InventoryItem[] sortedInventoryList = GameControl.getSortedInventoryList(inventory);
        
        this.console.println("***************************");
        this.console.println("* List of Inventory Items *"); 
        this.console.println("***************************");

        //for each inventory item
        for (InventoryItem nextInventory : inventory) {
            //DISPLAY the description, the required amount, and the amount the user has)
            this.console.println("Description:" + "\t" + nextInventory.getDescription());
            this.console.println("Required:" + "\t" + "\t" + nextInventory.getRequiredAmount());
            this.console.println("Acquired:" + "\t" + "\t" + nextInventory.getActualAmount());
            this.console.println("*****************************************");
        }
    }

    private void displayMap() {

        Map map = SantaChallenge.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        this.console.println("*****************");
        this.console.println("* Map Locations *");
        this.console.println("*****************");
        this.console.println("\t" + 0 + "\t" + 1 + "\t" + 2 + "\t" + 3 + "\t" + 4);

        int noOfColumns = map.getNoOfColumns();
        int noOfRows = map.getNoOfRows();

        for (int row = 0; row < noOfRows; row++) {
            this.console.println("\n******************************************************" + "\n" + row);

            for (int column = 0; column < noOfColumns; column++) {
                this.console.print("\t|");
                Location location = locations[row][column];
                Scene scene = location.getScene();
                this.console.print(scene.getMapSymbol());
                if (!location.isVisited()) {
                    this.console.print("--");
                } else {
                    this.console.print("XX");//print to indicate location has not been visited yet
                }
            }

            this.console.print("|");//print final column divider
        }
    }

    private void displaySceneList() {
        //get the list of scenes in the game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
        //sort the list of scenes
        Scene[] sortedScenes = MapControl.getSortedScenes(scenes);

        //print a title
        this.console.println("*********************************************************");
        this.console.println("* List of Scenes and their distance from the North Pole *");
        this.console.println("*********************************************************");

        //for each scene in the list
        for (Scene nextScene : sortedScenes) {
            //display the description and the miles from the north pole
            this.console.println("Scene:" + "\t" + nextScene.getDescription());
            this.console.println("Miles from the North Pole:" + "\t" + nextScene.getMilesFromNorthPole());
            this.console.println("************************************");
        }

    }

    private void displayMaxValue() {
        //get the maxValue from the current game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
        //find the maximum mileage in the list of scenes
        Scene maxScene = MapControl.getMaxValue(scenes);

        this.console.println("The location furthest from the North Pole that Santa has to deliver to is" + " " + maxScene);

    }

    private void displayMinValue() {
        //get the maxValue from the current game
        Scene[] scenes = SantaChallenge.getCurrentGame().getMap().getScenes();
        //find the maximum mileage in the list of scenes
        Scene minScene = MapControl.getMinValue(scenes);

        this.console.println("The location closest to the North Pole that Santa has to deliver to is" + " " + minScene);

    }

    private void displayActors() {
        
    }

    private void moveLocations() {
        MapView mapView =  new MapView();
        mapView.inputCoordinates();
    }
    
    
    private void saveBreakfastFood() {
        //prompt for a get the name of the file to save the list of scenes in
        this.console.println("\n\nEnter the file path for the file where the "
                + "list of scenes is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //save the list of scenes to the specified file
            FeedSantaView.printBreakfastFood(SantaChallenge.getCurrentGame().getBreakfastFood(), filePath);
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
}
