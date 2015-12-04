/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.Player;
import byui.cit260.santaChallenge.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Wendy
 * @author Lisa   
 */
public class SantaChallenge {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null; 
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        try{
            
            //opencharacter stream files for end user input and output
            SantaChallenge.inFile = new BufferedReader(new InputStreamReader(System.in));
                
            SantaChallenge.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            SantaChallenge.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program    
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayBanner();
            
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
            //startProgramView.startProgram();
        }
        finally {
            try {                           
                if (SantaChallenge.inFile != null)
                    SantaChallenge.inFile.close();
                
                if (SantaChallenge.outFile != null)
                    SantaChallenge.outFile.close();
                
                if (SantaChallenge.logFile != null)
                    SantaChallenge.logFile.close();

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SantaChallenge.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SantaChallenge.player = player;
    }    

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SantaChallenge.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SantaChallenge.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SantaChallenge.logFile = logFile;
    }

  








}
