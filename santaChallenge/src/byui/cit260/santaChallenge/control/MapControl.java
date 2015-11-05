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
public class MapControl {
    
    public double calcTimeTraveled(double flyingSpeed, double presetTimeLimit, double miles) {
        
        if (miles <= 0 || miles > 19200){
            return -1;
        }
        if (presetTimeLimit != 24){
            return -1;
        }
        if (flyingSpeed != 600 && flyingSpeed != 700 && flyingSpeed != 800)
            return -1;
        
        double timeTraveled = presetTimeLimit - (miles / flyingSpeed);
        return timeTraveled;
    }
}
