package cars;

import Engines.Engine;
import beepers.Beeper;

public class Priora extends Car {
    public Priora(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    String downShifting () {
        return "Заижена";

    }
}
