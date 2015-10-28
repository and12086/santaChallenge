/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lisa Lou
 */
public class SleighControlTest {
    
    public SleighControlTest() {
    }

    /**
     * Test of calcPullCapacity method, of class SleighControl.
     */
    @Test
    public void testCalcPullCapacity() {
        System.out.println("calcPullCapacity");
        
        /******************************
         * Test Case #1
         ******************************/
        System.out.println("\tTest Case #1");
        
        //input values for Test Case #1
        double numberOfPresents = 60.0;
        double numberOfReindeer = 6.0;
        
        //Create instance of SleighControl class
        SleighControl instance = new SleighControl();
        
        //expected output returned value
        double expResult = 0.67;
        
        //call function to run test
        double result = instance.calcPullCapacity(numberOfPresents, numberOfReindeer);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
        /******************************
         * * Test Case #2
         ******************************/
        System.out.println("\tTest Case #2");
        
        //input values for Test Case #2
        numberOfPresents = 80.0;
        numberOfReindeer = 9.0;
        
        //expected output returned value
        expResult = 0.59;
        
        //call function to run test
        result = instance.calcPullCapacity(numberOfPresents, numberOfReindeer);
        
        //compare expected return value with actual returned
        assertEquals(expResult, result, 0.01);
 
    }
    
}
