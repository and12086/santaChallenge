/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.Scene;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lisa Lou
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
       System.out.println("call the moveActorsToStartingLocation function");
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScenes(scenes[SceneType.mexicoCity.ordinal()]);
        locations[0][1].setScenes(scenes[SceneType.santasKitchen.ordinal()]);
        locations[0][2].setScenes(scenes[SceneType.northPole.ordinal()]);
        locations[0][3].setScenes(scenes[SceneType.santasWorkshop.ordinal()]);
        locations[0][4].setScenes(scenes[SceneType.stables.ordinal()]);
        locations[1][0].setScenes(scenes[SceneType.ottawa.ordinal()]);
        locations[1][1].setScenes(scenes[SceneType.anchorage.ordinal()]);
        locations[1][2].setScenes(scenes[SceneType.madrid.ordinal()]);
        locations[1][3].setScenes(scenes[SceneType.prague.ordinal()]);
        locations[1][4].setScenes(scenes[SceneType.bangkok.ordinal()]);
        locations[2][0].setScenes(scenes[SceneType.seattle.ordinal()]);
        locations[2][1].setScenes(scenes[SceneType.capeTown.ordinal()]);
        locations[2][2].setScenes(scenes[SceneType.london.ordinal()]);
        locations[2][3].setScenes(scenes[SceneType.mumbai.ordinal()]);
        locations[2][4].setScenes(scenes[SceneType.perth.ordinal()]);
        locations[3][0].setScenes(scenes[SceneType.saoPaulo.ordinal()]);
        locations[3][1].setScenes(scenes[SceneType.bogota.ordinal()]);
        locations[3][2].setScenes(scenes[SceneType.moscow.ordinal()]);
        locations[3][3].setScenes(scenes[SceneType.hongKong.ordinal()]);
        locations[3][4].setScenes(scenes[SceneType.auckland.ordinal()]);
        locations[4][0].setScenes(scenes[SceneType.buenasAires.ordinal()]);
        locations[4][1].setScenes(scenes[SceneType.nairobi.ordinal()]);
        locations[4][2].setScenes(scenes[SceneType.casaBlanca.ordinal()]);
        locations[4][3].setScenes(scenes[SceneType.ulaanbaatar.ordinal()]);
        locations[4][4].setScenes(scenes[SceneType.finish.ordinal()]);
    }

    public static Scene[] getSortedScenes() {
       
        //get inventory list for the current game
        Scene[] originalScenes = 
                SantaChallenge.getCurrentGame().getScenes();
        
        //clone originalList
        Scene[] scenes = originalScenes.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        Scene tempScenes;
        for (int i = 0; i<scenes.length-1; i++) {
            for (int j = 0; j < scenes.length-1-i; j++) {
                if (scenes[j].getDescription().
                        compareToIgnoreCase(scenes[j + 1].getDescription()) > 0) {
                    tempScenes = scenes[j];
                    scenes[j] = scenes[j+1];
                    scenes[j+1] = tempScenes;
                }
            }
        }
        return  scenes;
    }
 /*
    public static Scene[] doInsertionSort() {
        
        Scene[] originalScenes = 
                SantaChallenge.getCurrentGame().getScenes();
        
        Scene[] scenes = originalScenes.clone();
        
        Scene temp;
        for (int i = 0; i < scenes.length; i++) {
        for(int j = i ; j > 0 ; j--){
        if(scenes[j].getDescription(). < scenes[j-1].getDescription()){
            temp = scenes[j];
            scenes[j] = scenes[j-1];
            scenes[j-1] = temp;
        }
        }
        }
            return scenes;
    }
}
   */  
    
    public enum SceneType {
        northPole,
        santasKitchen,
        santasWorkshop,
        stables,
        seattle,
        ottawa,
        anchorage,
        mexicoCity,
        saoPaulo,
        buenasAires,
        bogota,
        capeTown,
        nairobi,
        casaBlanca,
        moscow, 
        london,
        madrid,
        prague,
        mumbai,
        hongKong, 
        ulaanbaatar,
        bangkok,
        perth,
        auckland,
        finish;
    }
    
    private static Scene[] createScenes() {
        Game currentGame = SantaChallenge.getCurrentGame();  //this may need to read Game game = SantaChallenge.getCurrentGame();  I'm not sure.
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene northPole = new Scene();
        northPole.setDescription(
                    "\n Twas the night before Christmas and at the North Pole nothing"
                        + "was quiet, not even the mouse. Santa and the elves "
                        + "are busy getting ready to deliver Christmas magic to "
                        + "the world.");
        northPole.setMapSymbol(" NP ");
        northPole.setBlocked(false);
        northPole.setMilesFromNorthPole(0);
        scenes[SceneType.northPole.ordinal()] = northPole;
        
        Scene santasKitchen = new Scene();
        santasKitchen.setDescription("Sant's Kitchen");
        santasKitchen.setMapSymbol(" SK ");
        santasKitchen.setBlocked(false);
        santasKitchen.setMilesFromNorthPole(0);
        scenes[SceneType.santasKitchen.ordinal()] = santasKitchen;
        
        Scene santasWorkshop = new Scene();
        santasWorkshop.setDescription("Santa's Workshop");
        santasWorkshop.setMapSymbol(" SW ");
        santasWorkshop.setBlocked(false);
        santasWorkshop.setMilesFromNorthPole(0);
        scenes[SceneType.santasWorkshop.ordinal()] = santasWorkshop;
        
        Scene stables = new Scene();
        stables.setDescription("Santa's stables");
        stables.setMapSymbol(" RD ");
        stables.setBlocked(false);
        stables.setMilesFromNorthPole(0);
        scenes[SceneType.stables.ordinal()] = stables;
        
        Scene seattle = new Scene();
        seattle.setDescription("Seattle, Washington, USA");
        seattle.setMapSymbol(" SU ");
        seattle.setBlocked(false);
        seattle.setMilesFromNorthPole(0);
        scenes[SceneType.seattle.ordinal()] = seattle;
        
        Scene ottawa = new Scene();
        ottawa.setDescription("Ottawa, Canada");
        ottawa.setMapSymbol(" OC ");
        ottawa.setBlocked(false);
        ottawa.setMilesFromNorthPole(0);
        scenes[SceneType.ottawa.ordinal()] = ottawa;
        
        Scene anchorage = new Scene();
        anchorage.setDescription("Anchorage, Alaska, USA");
        anchorage.setMapSymbol(" AU ");
        anchorage.setBlocked(false);
        anchorage.setMilesFromNorthPole(0);
        scenes[SceneType.anchorage.ordinal()] = anchorage;
        
        Scene mexicoCity = new Scene();
        mexicoCity.setDescription("Mexico City, Mexico");
        mexicoCity.setMapSymbol(" MC ");
        mexicoCity.setBlocked(false);
        mexicoCity.setMilesFromNorthPole(0);
        scenes[SceneType.mexicoCity.ordinal()] = mexicoCity;
        
        Scene saoPaulo = new Scene();
        saoPaulo.setDescription("Sao Paulo, Brazil");
        saoPaulo.setMapSymbol(" SP ");
        saoPaulo.setBlocked(false);
        saoPaulo.setMilesFromNorthPole(0);
        scenes[SceneType.saoPaulo.ordinal()] = saoPaulo;
        
        Scene buenasAires = new Scene();
        buenasAires.setDescription("Buenos Aires, Argentina");
        buenasAires.setMapSymbol(" BA ");
        buenasAires.setBlocked(false);
        buenasAires.setMilesFromNorthPole(0);
        scenes[SceneType.buenasAires.ordinal()] = buenasAires;
        
        Scene bogota = new Scene();
        bogota.setDescription("Bogota, Columbia");
        bogota.setMapSymbol(" BC ");
        bogota.setBlocked(false);
        bogota.setMilesFromNorthPole(0);
        scenes[SceneType.bogota.ordinal()] = bogota;
        
         Scene capeTown = new Scene();
        capeTown.setDescription("Capetown, South Africa");
        capeTown.setMapSymbol(" CT ");
        capeTown.setBlocked(false);
        capeTown.setMilesFromNorthPole(0);
        scenes[SceneType.capeTown.ordinal()] = capeTown;
        
        Scene nairobi = new Scene();
        nairobi.setDescription("Nairobi, Kenya");
        nairobi.setMapSymbol(" NK ");
        nairobi.setBlocked(false);
        nairobi.setMilesFromNorthPole(0);
        scenes[SceneType.nairobi.ordinal()] = nairobi;
        
        Scene casaBlanca = new Scene();
        casaBlanca.setDescription("Casablanca, Morocco");
        casaBlanca.setMapSymbol(" CM ");
        casaBlanca.setBlocked(false);
        casaBlanca.setMilesFromNorthPole(0);
        scenes[SceneType.casaBlanca.ordinal()] = casaBlanca;
        
        Scene moscow = new Scene();
        moscow.setDescription("Moscow, Russia");
        moscow.setMapSymbol(" MR ");
        moscow.setBlocked(false);
        moscow.setMilesFromNorthPole(0);
        scenes[SceneType.moscow.ordinal()] = moscow;
        
        Scene london = new Scene();
        london.setDescription("London, England");
        london.setMapSymbol(" LE ");
        london.setBlocked(false);
        london.setMilesFromNorthPole(0);
        scenes[SceneType.london.ordinal()] = london;
        
        Scene madrid = new Scene();
        madrid.setDescription("Madrid, Spain");
        madrid.setMapSymbol(" MS ");
        madrid.setBlocked(false);
        madrid.setMilesFromNorthPole(0);
        scenes[SceneType.madrid.ordinal()] = madrid;
        
        Scene prague = new Scene();
        prague.setDescription("Prague, Czech Republic");
        prague.setMapSymbol(" PC ");
        prague.setBlocked(false);
        prague.setMilesFromNorthPole(0);
        scenes[SceneType.prague.ordinal()] = prague;
        
        Scene mumbai = new Scene();
        mumbai.setDescription("Mumbai, India");
        mumbai.setMapSymbol(" MI ");
        mumbai.setBlocked(false);
        mumbai.setMilesFromNorthPole(0);
        scenes[SceneType.mumbai.ordinal()] = mumbai;
        
        Scene hongKong = new Scene();
        hongKong.setDescription("Hong Kong, China");
        hongKong.setMapSymbol(" HK ");
        hongKong.setBlocked(false);
        hongKong.setMilesFromNorthPole(0);
        scenes[SceneType.hongKong.ordinal()] = hongKong;
        
        Scene ulaanbaatar = new Scene();
        ulaanbaatar.setDescription("Ulaanbaatar, Mongolia");
        ulaanbaatar.setMapSymbol(" UM ");
        ulaanbaatar.setBlocked(false);
        ulaanbaatar.setMilesFromNorthPole(0);
        scenes[SceneType.ulaanbaatar.ordinal()] = ulaanbaatar;
        
        Scene bangkok = new Scene();
        bangkok.setDescription("Bangkok, Thailand");
        bangkok.setMapSymbol(" BT ");
        bangkok.setBlocked(false);
        bangkok.setMilesFromNorthPole(0);
        scenes[SceneType.bangkok.ordinal()] = bangkok;
        
        Scene perth = new Scene();
        perth.setDescription("Perth, Austrailia");
        perth.setMapSymbol(" PA ");
        perth.setBlocked(false);
        perth.setMilesFromNorthPole(0);
        scenes[SceneType.perth.ordinal()] = perth;
        
        Scene auckland = new Scene();
        auckland.setDescription("Auckland, New Zealand");
        auckland.setMapSymbol(" ANZ ");
        auckland.setBlocked(false);
        auckland.setMilesFromNorthPole(0);
        scenes[SceneType.auckland.ordinal()] = auckland;
        
        Scene finish = new Scene();
        finish.setDescription(
                        "\n You did it.  You were able to deliver presents throughout the"
                        + "world, and none of the children saw you. As you head "
                        + "back home to the North Pole you exclaim, 'Merry Christmas"
                        + "to all and to all a good night!'");
        finish.setMapSymbol(" FN ");
        finish.setBlocked(false);
        finish.setMilesFromNorthPole(0);
        scenes[SceneType.finish.ordinal()] = finish;
        
        return scenes;
    }
    
    /*public double calcTimeTraveled(double flyingSpeed, double presetTimeLimit, double miles) {
        
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
    }*/
}
