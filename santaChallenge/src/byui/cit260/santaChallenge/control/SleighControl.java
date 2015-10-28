/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

/**
 *
 * @author Lisa Lou
 */
public class SleighControl {
    
    public double calcPullCapacity(double numberOfPresents, double numberOfReindeer) {
        if (numberOfPresents != 60 || numberOfPresents != 80 || numberOfPresents != 100 ) {
            return -1;
        }
        if (numberOfReindeer !=3 || numberOfReindeer !=6 || numberOfReindeer !=9) {
            return -1;
        }
        
        double pullCapacity = (numberOfPresents*2)/(numberOfReindeer*30);

        return pullCapacity;
    }
}


	
	