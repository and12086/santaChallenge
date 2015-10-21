/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santsChallenge.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author and12_000
 */
public class BreakfastFoodControlTest {
    
    public BreakfastFoodControlTest() {
    }

    /**
     * Test of calcCalorieCount method, of class BreakfastFoodControl.
     */
    @Test
    public void testCalcCalorieCount() {
        System.out.println("calcCalorieCount");
        /******************************
         * Test Case #1
         ******************************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double calorieCount1 = 200.0;
        double calorieCount2 = 80.0;
        double calorieCount3 = 160.0;
        double calorieCount4 = 250.0;
        double healthBenefit1 = 50.0;
        double healthBenefit2 = 0.0;
        double healthBenefit3 = 0.0;
        double healthBenefit4 = 0.0;
        
        //create instance o f BreakfastFoodControl class
        BreakfastFoodControl instance = new BreakfastFoodControl();
        double expResult = 640.0; //expected output for returned value
        
        //call function to run test
        double result = instance.calcCaloriesConsumed(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
