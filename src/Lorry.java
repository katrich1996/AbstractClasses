import Engines.Engine;
import Headlights.Headlights;
import beepers.Beeper;

public class Lorry extends Car{
    public Lorry(Beeper beeper, Engine engine, Headlights headlights) {
        super(beeper, engine, headlights);
    }

    String loadCargo() {
        return "Goods are being loaded";
    }
}
