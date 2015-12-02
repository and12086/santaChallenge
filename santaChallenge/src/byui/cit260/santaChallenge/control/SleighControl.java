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
    
    public double calcPullCapacity(double numberOfPresents, double numberOfReindeer) throws SleighControlException {
        if (numberOfPresents != 60 || numberOfPresents != 80 || numberOfPresents != 100 ) {
           throw new SleighControlException("Please enter the specified number of presents: 60, 80, or 100.");
        }
        if (numberOfReindeer !=3 || numberOfReindeer !=6 || numberOfReindeer !=9) {
            throw new SleighControlException("Please enter the specified number of reindeer: 3, 6, or 9.");
        }
        
        double pullCapacity = (numberOfPresents*2)/(numberOfReindeer*30);

        return pullCapacity;
    }
}


	
	