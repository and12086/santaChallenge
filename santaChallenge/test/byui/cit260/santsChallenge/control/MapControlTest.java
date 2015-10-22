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
 * @author Wendy
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcTimeTraveled method, of class MapControl.
     */
    @Test
     
    public void testCalcTimeTraveled() {
        
        System.out.println("calcTimeTraveled");
        /******************************
         * Test Case #1
         ******************************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double flyingSpeed = 600.0;
        double presetTimeLimit = 24.0;
        double miles = 3460.0;
        
        //create instance o f BreakfastFoodControl class
        MapControl instance = new MapControl();
        
        //expected output for returned value
        double expResult = 18.23;
        
        //call function to run test
        double result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #2
         ******************************/
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        flyingSpeed = 700.0;
        presetTimeLimit = 24.0;
        miles = 892.0;
        
        //expected output for returned value
        expResult = 22.73;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #3
         ******************************/
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        flyingSpeed = 800.0;
        presetTimeLimit = 24.0;
        miles = 2098.0;
        
        //expected output for returned value
        expResult = 21.38;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #4
         ******************************/
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        flyingSpeed = 700.0;
        presetTimeLimit = 24.0;
        miles = 0.0;
        
        //expected output for returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #5
         ******************************/
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        flyingSpeed = 600.0;
        presetTimeLimit = 24.0;
        miles = 19201.0;
        
        //expected output for returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #6
         ******************************/
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        flyingSpeed = 600.0;
        presetTimeLimit = 24.0;
        miles = 1.0;
        
        //expected output for returned value
        expResult = 24;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /******************************
         * Test Case #7
         ******************************/
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        flyingSpeed = 800.0;
        presetTimeLimit = 24.0;
        miles = 19200.0;
        
        //expected output for returned value
        expResult = 0;
        
        //call function to run test
        result = instance.calcTimeTraveled(flyingSpeed, presetTimeLimit, miles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
    }
    
}
