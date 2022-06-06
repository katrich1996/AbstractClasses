import Engines.Engine;
import Headlights.Headlights;
import beepers.Beeper;

public class Priora extends Car{
    public Priora(Beeper beeper, Engine engine, Headlights headlights) {
        super(beeper, engine, headlights);
    }
    String downShifting () {
        return "downShifted";

    }
    String openDoors () {
        return "Door is stuck";
    }
}
