import Engines.Engine;
import Headlights.Headlights;
import beepers.Beeper;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine, Headlights headlights) {
        super(beeper, engine, headlights);
    }

    String getCost () {
      return "$$$$";
    }
    String openDoors () {
        return "Doors are open";
    }
}
