/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.santaChallenge.control;

import byui.cit260.santaChallenge.model.Actor;
import byui.cit260.santaChallenge.model.Game;
import byui.cit260.santaChallenge.model.Scene;
import byui.cit260.santaChallenge.model.Location;
import byui.cit260.santaChallenge.model.Map;
import citbyui.cit260.santaChallenge.exceptions.MapControlException;
import citbyui.cit260.santaChallenge.exceptions.SleighControlException;
import java.awt.Point;
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
        map.setScenes(scenes);//save the scene to the map

        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);

        return map;
    }

    public static void moveActorsToStartingLocation(Map map)
            throws MapControlException, SleighControlException {
        //for every actor
        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.setActorToLocation(actor, coordinates);
        }
    }

    public static double calcTime(double tempMiles, double tempFlyingSpeed) {
        double time;
        time = Math.round((tempMiles / tempFlyingSpeed) * 100) / 100;
        return time;
    }
    
    public static double calcTimeRemaining(double tempMiles, double tempFlyingSpeed) {

        double timeRemaining = SantaChallenge.getCurrentGame().getInventory()[GameControl.Item.timeRemaining.ordinal()].getActualAmount();
      
        timeRemaining = Math.round((timeRemaining - (tempMiles / tempFlyingSpeed)) * 100) / 100;
        SantaChallenge.getCurrentGame().setTime(timeRemaining);
        return timeRemaining;      
    }

    public static void setActorToLocation(Actor actor, Point coordinates)
            throws MapControlException, SleighControlException {
        Map map = SantaChallenge.getCurrentGame().getMap();

        int yCoordinate = coordinates.y;
        int xCoordinate = coordinates.x;

        if (xCoordinate < 0 || xCoordinate >= map.getNoOfRows() || yCoordinate < 0 || yCoordinate >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location "
                    + coordinates.y + ", " + coordinates.x
                    + " because that location is outside"
                    + " the bounds of the map.");
        }
        if (actor == null) {
            throw new MapControlException("Actor not specified, please choose another option");
        }

        //get the old location in the actor
        SantaChallenge.getCurrentGame().getActor();

        SantaChallenge.getCurrentGame().getMap();

        //get new location from the map.locations[](index-values of new row and new column)
        Location[][] locations = SantaChallenge.getCurrentGame().getMap().getLocations();

        locations[coordinates.y][coordinates.x].setActor(actor);
        //set the actor in the old location to null (call setter function)

        //set the actor in the new location to the actor passed when the function was called
        //set the location in the Actor to the new location
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.mexicoCity.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.santasKitchen.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.northPole.ordinal()]);
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

        //save the locations to the map
        map.setLocations(locations);
    }

    public static Scene[] getSortedScenes(Scene[] originalScenes) {

        //clone originalList
        Scene[] scenes = originalScenes.clone();

        //using a BubbleSort to sort the list of inventoryList by name
        Scene tempScenes;
        for (int i = 0; i < scenes.length - 1; i++) {
            for (int j = 0; j < scenes.length - 1 - i; j++) {
                if (scenes[j].getDescription().compareToIgnoreCase(scenes[j + 1].getDescription()) > 0) {
                    tempScenes = scenes[j];
                    scenes[j] = scenes[j + 1];
                    scenes[j + 1] = tempScenes;
                }
            }
        }
        return scenes;
    }

    // getting the maximum value
    public static Scene getMaxValue(Scene[] scenes) {
        Scene maxScene = scenes[0];//get scene list from Scene class

        //advance the positition through the entire array
        for (int i = 0; i < scenes.length - 1; i++) {
            if (scenes[i].getMilesFromNorthPole() > maxScene.getMilesFromNorthPole()) {
                maxScene = scenes[i];//
            }
        }
        return maxScene;
    }

// getting the miniumum value
    public static Scene getMinValue(Scene[] scenes) {
        Scene minScene = scenes[4];//get scene list from Scene class
        for (int i = 4; i < scenes.length - 1; i++) {// advance the position through the entire array
            if (scenes[i].getMilesFromNorthPole() < minScene.getMilesFromNorthPole()) {
                minScene = scenes[i];//found new minimum; remember its index
            }
        }
        return minScene;
    }

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
        Game game = SantaChallenge.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene northPole = new Scene();
        northPole.setDescription("The North Pole");
        northPole.setMapSymbol(" Start ");
        northPole.setBlocked(false);
        northPole.setMilesFromNorthPole(0);
        scenes[SceneType.northPole.ordinal()] = northPole;

        Scene santasKitchen = new Scene();
        santasKitchen.setDescription("Santa's Kitchen");
        santasKitchen.setMapSymbol(" Kitchen ");
        santasKitchen.setBlocked(false);
        santasKitchen.setMilesFromNorthPole(0);
        scenes[SceneType.santasKitchen.ordinal()] = santasKitchen;

        Scene santasWorkshop = new Scene();
        santasWorkshop.setDescription("Santa's Workshop");
        santasWorkshop.setMapSymbol(" Workshop ");
        santasWorkshop.setBlocked(false);
        santasWorkshop.setMilesFromNorthPole(0);
        scenes[SceneType.santasWorkshop.ordinal()] = santasWorkshop;

        Scene stables = new Scene();
        stables.setDescription("Santa's stables");
        stables.setMapSymbol(" Stables ");
        stables.setBlocked(false);
        stables.setMilesFromNorthPole(0);
        scenes[SceneType.stables.ordinal()] = stables;

        Scene seattle = new Scene();
        seattle.setDescription("Seattle, Washington, USA");
        seattle.setMapSymbol(" Seattle ");
        seattle.setBlocked(false);
        seattle.setMilesFromNorthPole(2698);
        scenes[SceneType.seattle.ordinal()] = seattle;

        Scene ottawa = new Scene();
        ottawa.setDescription("Ottawa, Canada");
        ottawa.setMapSymbol(" Ottawa ");
        ottawa.setBlocked(false);
        ottawa.setMilesFromNorthPole(2577);
        scenes[SceneType.ottawa.ordinal()] = ottawa;

        Scene anchorage = new Scene();
        anchorage.setDescription("Anchorage, Alaska, USA");
        anchorage.setMapSymbol(" Anchorage ");
        anchorage.setBlocked(false);
        anchorage.setMilesFromNorthPole(2026);
        scenes[SceneType.anchorage.ordinal()] = anchorage;

        Scene mexicoCity = new Scene();
        mexicoCity.setDescription("Mexico City, Mexico");
        mexicoCity.setMapSymbol(" Mexico City ");
        mexicoCity.setBlocked(false);
        mexicoCity.setMilesFromNorthPole(4463);
        scenes[SceneType.mexicoCity.ordinal()] = mexicoCity;

        Scene saoPaulo = new Scene();
        saoPaulo.setDescription("Sao Paulo, Brazil");
        saoPaulo.setMapSymbol(" Sao Paulo ");
        saoPaulo.setBlocked(false);
        saoPaulo.setMilesFromNorthPole(7342);
        scenes[SceneType.saoPaulo.ordinal()] = saoPaulo;

        Scene buenasAires = new Scene();
        buenasAires.setDescription("Buenos Aires, Argentina");
        buenasAires.setMapSymbol(" Buenos Aires ");
        buenasAires.setBlocked(false);
        buenasAires.setMilesFromNorthPole(8088);
        scenes[SceneType.buenasAires.ordinal()] = buenasAires;

        Scene bogota = new Scene();
        bogota.setDescription("Bogota, Columbia");
        bogota.setMapSymbol(" Bogota ");
        bogota.setBlocked(false);
        bogota.setMilesFromNorthPole(5383);
        scenes[SceneType.bogota.ordinal()] = bogota;

        Scene capeTown = new Scene();
        capeTown.setDescription("Capetown, South Africa");
        capeTown.setMapSymbol(" Capetown ");
        capeTown.setBlocked(false);
        capeTown.setMilesFromNorthPole(8453);
        scenes[SceneType.capeTown.ordinal()] = capeTown;

        Scene nairobi = new Scene();
        nairobi.setDescription("Nairobi, Kenya");
        nairobi.setMapSymbol(" Nairobi ");
        nairobi.setBlocked(false);
        nairobi.setMilesFromNorthPole(6386);
        scenes[SceneType.nairobi.ordinal()] = nairobi;

        Scene casaBlanca = new Scene();
        casaBlanca.setDescription("Casablanca, Morocco");
        casaBlanca.setMapSymbol(" Casablanca ");
        casaBlanca.setBlocked(false);
        casaBlanca.setMilesFromNorthPole(3615);
        scenes[SceneType.casaBlanca.ordinal()] = casaBlanca;

        Scene moscow = new Scene();
        moscow.setDescription("Moscow, Russia");
        moscow.setMapSymbol(" Moscow ");
        moscow.setBlocked(false);
        moscow.setMilesFromNorthPole(2501);
        scenes[SceneType.moscow.ordinal()] = moscow;

        Scene london = new Scene();
        london.setDescription("London, England");
        london.setMapSymbol(" London ");
        london.setBlocked(false);
        london.setMilesFromNorthPole(2454);
        scenes[SceneType.london.ordinal()] = london;

        Scene madrid = new Scene();
        madrid.setDescription("Madrid, Spain");
        madrid.setMapSymbol(" Madrid ");
        madrid.setBlocked(false);
        madrid.setMilesFromNorthPole(3178);
        scenes[SceneType.madrid.ordinal()] = madrid;

        Scene prague = new Scene();
        prague.setDescription("Prague, Czech Republic");
        prague.setMapSymbol(" Prague ");
        prague.setBlocked(false);
        prague.setMilesFromNorthPole(2679);
        scenes[SceneType.prague.ordinal()] = prague;

        Scene mumbai = new Scene();
        mumbai.setDescription("Mumbai, India");
        mumbai.setMapSymbol(" Mumbai ");
        mumbai.setBlocked(false);
        mumbai.setMilesFromNorthPole(5270);
        scenes[SceneType.mumbai.ordinal()] = mumbai;

        Scene hongKong = new Scene();
        hongKong.setDescription("Hong Kong, China");
        hongKong.setMapSymbol(" Hong Kong ");
        hongKong.setBlocked(false);
        hongKong.setMilesFromNorthPole(5184);
        scenes[SceneType.hongKong.ordinal()] = hongKong;

        Scene ulaanbaatar = new Scene();
        ulaanbaatar.setDescription("Ulaanbaatar, Mongolia");
        ulaanbaatar.setMapSymbol(" Ulaanbaatar ");
        ulaanbaatar.setBlocked(false);
        ulaanbaatar.setMilesFromNorthPole(3417);
        scenes[SceneType.ulaanbaatar.ordinal()] = ulaanbaatar;

        Scene bangkok = new Scene();
        bangkok.setDescription("Bangkok, Thailand");
        bangkok.setMapSymbol(" Bangkok ");
        bangkok.setBlocked(false);
        bangkok.setMilesFromNorthPole(5760);
        scenes[SceneType.bangkok.ordinal()] = bangkok;

        Scene perth = new Scene();
        perth.setDescription("Perth, Austrailia");
        perth.setMapSymbol(" Perth ");
        perth.setBlocked(false);
        perth.setMilesFromNorthPole(8938);
        scenes[SceneType.perth.ordinal()] = perth;

        Scene auckland = new Scene();
        auckland.setDescription("Auckland, New Zealand");
        auckland.setMapSymbol(" Auckland ");
        auckland.setBlocked(false);
        auckland.setMilesFromNorthPole(9020);
        scenes[SceneType.auckland.ordinal()] = auckland;

        Scene finish = new Scene();
        finish.setDescription(
                "The North Pole");
        finish.setMapSymbol(" Finish ");
        finish.setBlocked(false);
        finish.setMilesFromNorthPole(0);
        scenes[SceneType.finish.ordinal()] = finish;

        return scenes;
    }

}
