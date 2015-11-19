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
}