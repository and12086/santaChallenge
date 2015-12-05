/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;
import santachallenge.SantaChallenge;

/**
 *
 * @author and12_000
 */
public class BreakfastFoodControlTest {
    
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    
    public BreakfastFoodControlTest() {
    }

    /**
     * Test of calcCalorieCount method, of class BreakfastFoodControl.
     */
    @Test
    public void testCalcCalorieCount() {
        this.console.println("calcCalorieCount");
        /******************************
         * Test Case #1
         ******************************/
        this.console.println("\tTest case #1");
        
        //input values for test case 1
        int calorieCount1 = 200;
        int calorieCount2 = 80;
        int calorieCount3 = 160;
        int calorieCount4 = 250;
        int healthBenefit1 = 50;
        int healthBenefit2 = 0;
        int healthBenefit3 = 0;
        int healthBenefit4 = 0;
        
        //create instance o f BreakfastFoodControl class
        BreakfastFoodControl instance = new BreakfastFoodControl();
        int expResult = 640; //expected output for returned value
        
        //call function to run test
        int result = instance.calculateEnergyPoints(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0);
      
        /******************************
         * Test Case #2
         ******************************/
        this.console.println("\tTest case #2");
        
        //input values for test case 2
        calorieCount1 = 105;
        calorieCount2 = 250;
        calorieCount3 = 80;
        calorieCount4 = 267;
        healthBenefit1 = 0;
        healthBenefit2 = 0;
        healthBenefit3 = 0;
        healthBenefit4 = 0;
        
        expResult = 702; //expected output for returned value
        
        //call function to run test
        result = instance.calculateEnergyPoints(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0);
        
        /******************************
         * Test Case #3
         ******************************/
        this.console.println("\tTest case #3");
        
        //input values for test case 3
        calorieCount1 = 220;
        calorieCount2 = 200;
        calorieCount3 = 80;
        calorieCount4 = 210;
        healthBenefit1 = 50;
        healthBenefit2 = 50;
        healthBenefit3 = 0;
        healthBenefit4 = 0;
        
        expResult = 610; //expected output for returned value
        
        //call function to run test
        result = instance.calculateEnergyPoints(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0);
        
        /******************************
         * Test Case #4
         ******************************/
        this.console.println("\tTest case #4");
        
        //input values for test case 4
        calorieCount1 = 160;
        calorieCount2 = 200;
        calorieCount3 = 72;
        calorieCount4 = 410;
        healthBenefit1 = 0;
        healthBenefit2 = 50;
        healthBenefit3 = 0;
        healthBenefit4 = 0;
        
        expResult = -1; //expected output for returned value
        
        //call function to run test
        result = instance.calculateEnergyPoints(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0);
        
        /******************************
         * Test Case #5
         ******************************/
        this.console.println("\tTest case #5");
        
        //input values for test case 5
        calorieCount1 = 160;
        calorieCount2 = 267;
        calorieCount3 = 0;
        calorieCount4 = 222;
        healthBenefit1 = 0;
        healthBenefit2 = 0;
        healthBenefit3 = 50;
        healthBenefit4 = 0;
        
        expResult = -1; //expected output for returned value
        
        //call function to run test
        result = instance.calculateEnergyPoints(calorieCount1, calorieCount2, calorieCount3, calorieCount4, healthBenefit1, healthBenefit2, healthBenefit3, healthBenefit4);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0);
    }
    }

