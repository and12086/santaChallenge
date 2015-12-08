/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

/**
 *
 * @author and12_000
 */
public class HowToWinView extends View {
    
    public HowToWinView() {
        super ("\n"
            + "\n"
            + "\n The purpose of the game is to deliver as many      "
                + "\n presents as you can, to as many different      "
                + "\n countries as you can. At the end of the game   "
                + "\n you will recieve a score that encompasses both "
                + "\n the number of presents that you were able to   "
                + "deliver and the number of countries that were visited."
                + "\n                                                "
                + "\n************************************************"
                + "\n                                                "
                + "\n                     TIPS!!                     "
                + "\n                                                "
                + "\n Be sure to load as many presents as you can in "
                + "\n order to deliver them quickly.                 "
                + "\n                                                "
                + "\n Plan your stops strategicaly so that you can   "
                + "\n make it to the most amount of countries.       "
                + "\n                                                "
                + "\n************************************************"
                + "\n Type R to Return to the Help Menu              "
                + "\n Type M to return to the Main Menu              "
                + "\n************************************************");
        }

    
@Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        //// value = value.toUpperCase();
        
        if ("R".equals(value)){
            this.displayHelpMenu();            
        } 
        else if ("M".equals(value)){
            return true;
        }
        else {
            ErrorView.display(this.getClass().getName(),"\n*** Invalid menu selection!");
        }
        
    return false;
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}

    
    

