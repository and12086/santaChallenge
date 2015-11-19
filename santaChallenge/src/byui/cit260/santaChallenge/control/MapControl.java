/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;

/**
 *
 * @author Lisa Lou
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map(20,20);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.mexicoCity.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.santasKitchen.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.santasWorkshop.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.stables.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.ottawa.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.anchorage.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.madrid.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.prague.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.bangkok.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.seattle.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.capeTown.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.london.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.mumbai.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.perth.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.saoPaulo.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.bogota.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.moscow.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.hongKong.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.auckland.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.buenasAires.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.nairobi.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.casaBlanca.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.ulaanbaatar.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }

    public enum SceneType {
        start,
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
        Game game = new SantaChallenge.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new scene();
        startingScene.setDescription(
                    "\n Twas the night before Christmas and at the North Pole nothing"
                        + "was quiet, not even the mouse. Santa and the elves "
                        + "are busy getting ready to deliver Christmas magic to "
                        + "the world.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(24);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                        "\n You did it.  You were able to deliver presents throughout the"
                        + "world, and none of the children saw you. As you head "
                        + "back home to the North Pole you exclaim, 'Merry Christmas"
                        + "to all and to all a good night!'");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
    }
    
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
