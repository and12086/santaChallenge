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
public class FeedSantaView extends View {
    
    public FeedSantaView(){
               super ("\n"
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
                    + "\n               Type C to continue             "
                    + "\n**********************************************");
    }
    
    @Override
     public boolean doAction(Object obj) {
         
         String value = (String) obj;
        if ("C".equals(value)){
            this.caloriesConsumed1View();
        } 
        
        else {        
            System.out.println("\n*** Invalid selection *** Try again!");
        }
        return false;
     }
        
    public void caloriesConsumed1View() {
        CaloriesConsumed1View caloriesConsumed1 = new CaloriesConsumed1View();
        caloriesConsumed1.display();
    }

    /*private GameMenuView GameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

   
}


