import Engines.Engine;
import Headlights.Headlights;
import beepers.Beeper;

public abstract class Car {
    Beeper beeper;
    Engine engine;
    Headlights headlights;
    public Car (Beeper beeper, Engine engine, Headlights headlights) {
        this.beeper = beeper;
        this.engine = engine;
        this.headlights = headlights;
    }
}
