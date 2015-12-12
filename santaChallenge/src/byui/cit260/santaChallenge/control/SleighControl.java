/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import citbyui.cit260.santaChallenge.exceptions.SleighControlException;
     
/**
 *
 * @author Lisa Lou
 */
public class SleighControl {
    
    public static double calcFlyingSpeed(double numberOfPresents, double numberOfReindeer) throws SleighControlException {
        
        double flyingSpeed;
        double pullCapacity;
        
        pullCapacity = numberOfPresents/numberOfReindeer;
        
         if(pullCapacity < 20) {
            flyingSpeed = 1600;
         }
         
         else if(pullCapacity >= 20 && pullCapacity <= 25) {
             flyingSpeed = 1400;
         }
         
         else {
             flyingSpeed = 1200;
         }
         
        return flyingSpeed;
    }
}


	
	