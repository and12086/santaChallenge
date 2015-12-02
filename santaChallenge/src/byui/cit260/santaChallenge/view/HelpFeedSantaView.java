/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

/**
 *
 * @author Wendy
 */
public class HelpFeedSantaView extends View {
    
    public HelpFeedSantaView(){
               super ("\n"
                    + "\n When you help Santa choose his breakfast,    "
                    + "\n you will see the following menu of food items"
                    + "\n to choose from:                              "
                    + "\n"
                    + "\n**********************************************"
                    + "\n| Breakfast food selections                  |" 
                    + "\n**********************************************"
                    + "\nP - 2 frosted Poptarts with sprinkles"
                    + "\nB - 1 slimming Banana"
                    + "\nH - A hearty ham & cheese omelet"
                    + "\nT - Crunch toast with chuncky peanut butter"
                    + "\nL - A bowl of Lucky Charms with creamy whole milk"
                    + "\nO - Oatmeal with a fruit medley on top"
                    + "\nY - Yogurt with fruit on the bottom"
                    + "\nN - Nothing!  Santa is too busy to eat!!"
                    + "\nC - 2 slices of crispy bacon"
                    + "\nS - 3 links of sausage"
                    + "\nQ - Quit your game"
                    + "\n***********************************************"
                    + "\n"
                    + "\n                     TIPS!!                    "
                    + "\n"
                    + "\n   When you make a menu selection be sure to   "
                    + "\n type the menu letter associated with the item "
                    + "\n or you will get an error message asking you to"
                    + "\n try again."
                    + "\n"
                    + "\n For example: Type P if you want to select 2   "
                    + "\n frosted Poptarts with sprinkles.              "
                    + "\n"
                    + "\n   Be sure to use a capital letter to enter your"
                    + "\n menu selection. For example: Use P, not p.    "
                    + "\n"
                    + "\n   You will be asked to select 4 foods from the "
                    + "\n same menu.  After you have made your selections"
                    + "\n a calculation will be done to determine if     "
                    + "\n Santa consumed enough calories to supply him   "
                    + "\n with the energy he needs to make all of his    "
                    + "\n deliveries."
                    + "\n"
                    + "\n   Be aware that unhealthy food choices will    "
                    + "\n result in a reduced energy level, even if the  "
                    + "\n foods you chose were high in calories!         "
                    + "\n************************************************"
                    + "\n"
                    + "\n                    NEW MENU                    "
                    + "\n"
                    + "\nC - continue in game to help Santa pick his breakfast foods."
                    + "\nH - return to the Help Menu."
                    + "\nM - return to the Main Menu"
                    + "\n"                                                );
    }
    
    @Override
     public boolean doAction(Object obj) {
         
         String value = (String) obj;
        if ("C".equals(value)){
            this.feedSanta();
        } 
        
        else if ("H".equals(value)){
            this.displayHelpMenu();
        }
        
        else if ("M".equals(value)){
            this.returnToMainMenu();
        }
        else {        
            System.out.println("\n*** Invalid selection *** Try again!");
        }
        return false;
     }
    
    private void feedSanta() {
        FeedSantaView feedSanta = new FeedSantaView();
        feedSanta.display();
    } 
     
    public void caloriesConsumed1View() {
        CaloriesConsumed1View caloriesConsumed1 = new CaloriesConsumed1View();
        caloriesConsumed1.displayMenu();
    }
    
    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }  
    
     private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
}

