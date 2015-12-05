/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.view;

import byui.cit260.santaChallenge.control.BreakfastFoodControl;
import byui.cit260.santaChallenge.model.BreakfastFood;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Wendy
 */
public class FeedSantaView extends View {

    

    public FeedSantaView() {
        super("\n"
                + "\n**********************************************"
                + "\n* Santa will be busy all day long. You must  *"
                + "\n* make sure Santa eats a hearty breakfast or *"
                + "\n* Santa will not be his jolly self.          *"
                + "\n*                                            *"
                + "\n* Examine the food choices and choose wisely.*"
                + "\n* You will have the opportunity to make 4    *"
                + "\n* breakfast food selections.                 *"
                + "\n*                                            *"
                + "\n* Each selection has a calorie count and a   *"
                + "\n* health benefit associated with it. The     *"
                + "\n* health benefit is a calorie deduction made *"
                + "\n* for unhealthy food choices.                *"
                + "\n*                                            *"
                + "\n* After all your selections have been made,  *"
                + "\n* an elf will calulate whether Santa has     *"
                + "\n* enough calories to complete his deliveries *"
                + "\n* on time or whether he will run out of fuel.*"
                + "\n**********************************************"
                + "\n L - Preview Santa's breakfast food choices  *"
                + "\n C - Continue on in the game                 *"
                + "\n**********************************************");
    }
    
   
    
    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        //value = value.toUpperCase();

        switch (value) {
            case "L"://View Map/Choose Location
                this.displayBreakfastFoodCalories();
                break;
            case "C"://Feed Santa
                this.caloriesConsumed1View();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again!");
                break;
        }
        return false;

    }

    public void displayBreakfastFoodCalories(){
            
    BreakfastFood[] breakfastFood = SantaChallenge.getCurrentGame().getBreakfastFood();
           // GameControl.createBreakfastList();
    BreakfastFood[] sortedBreakfastFood = BreakfastFoodControl.getSortedBreakfastList();
    
        this.console.println("*************************************");
        this.console.println("* List of Breakfast Foods for Santa *");
        this.console.println("*************************************");
      
        for (BreakfastFood nextBreakfastFood : breakfastFood){            
            
            this.console.println("Description:" + "\t" + "\t" + nextBreakfastFood.getDescription());
            this.console.println("Calories:" + "\t" + "\t" + nextBreakfastFood.getCalorieCount());
            this.console.println("Calorie Deduction:" + "\t" + nextBreakfastFood.getHealthBenefit());
            this.console.println("***************************************************");
                               
        }
    }
   
    static void printBreakfastFood(BreakfastFood[] breakfastFood, String filePath) {
     
        
        try (BufferedWriter out = new BufferedWriter(new PrintWriter(filePath)) {
        
        //print title and column headings
            out.println("\n\n           Breakfast Food Report           ");
            out.printf("%n%-20s%-10s%-10s", "Description", "Calorie Count", "Health Benefit");
            out.printf("%n%-20s%-10s%-10s", "-----------", "-------------", "--------------");
            
            //print the description, map symbol, and miles from the North Pole for each scene
            for (BreakfastFood nextBreakfastFood : breakfastFood) {
            out.printf("%n%-20s%-7s%7d", nextBreakfastFood.getDescription()
                                       , nextBreakfastFood.getCalorieCount()
                                       , nextBreakfastFood.getHealthBenefit());
        }
       
    } catch(IOException ex) {
        ErrorView.display(this.getClass().getName(), "I/) Error: " + ex.getMessage());
    }
}
    }
    public void caloriesConsumed1View() {
        CaloriesConsumed1View caloriesConsumed1 = new CaloriesConsumed1View();
        caloriesConsumed1.displayMenu();
    }

}
