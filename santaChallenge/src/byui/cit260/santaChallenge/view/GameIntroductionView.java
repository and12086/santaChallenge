/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;
import java.util.Scanner;


/**
 *
 * @author Lisa Lou
 */
public class GameIntroductionView extends View{ 

    public GameIntroductionView() {
        super("\n"
                    + "\n*********************************************"
                    + "\n* There are a few things you must do before *"
                    + "\n* you can take off to deliver presents.     *"
                    + "\n*                                           *"
                    + "\n* You will need to load the sleigh and      *"
                    + "\n* choose how many reindeer you will bring   *"
                    + "\n* with you on your trips.                   *"
                    + "\n*                                           *"
                    + "\n* It will be a very long day so make sure   *"
                    + "\n* that Santa gets breakfast before you run  *"
                    + "\n* off to spread Christmas joy!              *"
                    + "\n*                                           *"
                    + "\n* You only have 24 hours to deliver the     *"
                    + "\n* most presents that you can...don't leave  *"
                    + "\n* any contininents out.                     *"
                    + "\n*                                           *"
                    + "\n*********************************************");
    }            
   @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        //// value = value.toUpperCase();
        
        if (value != "C"){
            System.out.println("\n*** Invalid selection *** Try again!");            
        } 
        
        
        else if (value =="E") {
          System.out.println("\n*** Are you sure you want to exit the game?");
        }
        
        
        else {        
            this.gameMenuView();
        }
        
        return false;
    }
        
    public void gameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    /*private GameMenuView GameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
