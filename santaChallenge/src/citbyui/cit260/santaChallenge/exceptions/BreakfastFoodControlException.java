/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.santaChallenge.exceptions;

/**
 *
 * @author Wendy
 */
public class BreakfastFoodControlException extends Exception {

    public BreakfastFoodControlException() {
    }

    public BreakfastFoodControlException(String message) {
        super(message);
    }

    public BreakfastFoodControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BreakfastFoodControlException(Throwable cause) {
        super(cause);
    }

    public BreakfastFoodControlException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }

    
}
