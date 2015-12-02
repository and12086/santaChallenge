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
public class SleighControlException extends Exception {

    public SleighControlException() {
    }

    public SleighControlException(String message) {
        super(message);
    }

    public SleighControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SleighControlException(Throwable cause) {
        super(cause);
    }

    public SleighControlException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }
    
}
