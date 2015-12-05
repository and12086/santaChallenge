/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;


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
                    + "\n*********************************************"
                    + "\n"
                    + "\nC - Continue with the game"
                    + "\nE - Exit the game"
                    + "\n");
    }            
   @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        //// value = value.toUpperCase();
        
        if ("C".equals(value)){
            this.gameMenuView();            
        } 
        
        
        else if ("E".equals(value)){
          this.console.println("\n*** Are you sure you want to exit the game?");
          this.returnToMainMenu();
        }
        
        else {
            ErrorView.display(this.getClass().getName(),"\n*** Invalid menu selection!");
        }
        
        return false;
    }
        
    public void gameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
