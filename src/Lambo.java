package cars;

import Engines.Engine;
import beepers.Beeper;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    String getCost () {
      return "$$$$";
    }
}
