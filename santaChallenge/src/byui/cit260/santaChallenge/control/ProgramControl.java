/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.Player;
import citbyui.cit260.santaChallenge.exceptions.ProgramControlException;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class ProgramControl {

    public static Player createPlayer(String name) throws ProgramControlException {
        
        if (name == null)  {
            //return null;
        throw new ProgramControlException("Please enter a name.");
        }
        
        Player player = new Player();
        player.setName(name);
        
        SantaChallenge.setPlayer(player); //save the player
        
        return player;
    }
    
}
