import Engines.Engine;
import Headlights.Headlights;
import beepers.Beeper;

public class Pazik extends Car{
    public Pazik(Beeper beeper, Engine engine, Headlights headlights) {
        super(beeper, engine, headlights);
    }

    String doorsAreOpen() {
        return "Doors are open";
    }
}
