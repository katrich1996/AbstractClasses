import Engines.*;
import Headlights.Headlights;
import Headlights.lamboLights;
import Headlights.XenonLights;
import Headlights.truckLights;
import Headlights.roundLights;
import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import beepers.TruckBeeper;
import beepers.BusHorn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Headlights lamboLights = new lamboLights();

        Lambo lambo = new Lambo(horn, engineV12, lamboLights);

        Headlights XenonLights = new XenonLights();
        Beeper magicSound = new MagicSound();
        Engine engineV6 = new engineV6();

        Priora priora = new Priora(magicSound, engineV6, XenonLights);

        Headlights truckLights = new truckLights();
        Beeper TruckBeeper = new TruckBeeper();
        Engine volvoTruckEngine = new volvoTruckEngine();

        Lorry lorry = new Lorry(TruckBeeper, volvoTruckEngine, truckLights);

        Headlights roundLights = new roundLights();
        Beeper busHorn = new BusHorn();
        Engine pazEngine = new pazEngine();

        Pazik pazik = new Pazik(busHorn, pazEngine, roundLights);



        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.downShifting());
        System.out.println(lambo.getCost());

        ArrayList<Car> transporte = new ArrayList();
        transporte.add(lambo);
        transporte.add(priora);

        transporte.forEach((Car)-> {
            System.out.println(Car.beeper.makeSound());
            System.out.println(Car.engine.getSpeed());
        });
        System.out.println(lambo.openDoors());
        System.out.println(priora.openDoors());
        System.out.println(lambo.headlights.shine());
        System.out.println(priora.headlights.shine());
        System.out.println(lorry.headlights.shine());
        System.out.println(lorry.loadCargo());
        System.out.println(pazik.engine.getSpeed());
        System.out.println(pazik.doorsAreOpen());
    }
}