package ProductType.Instruments.Brass;

import Behaviours.IToot;
import ProductType.Instruments.Instruments;

public abstract class Brass extends Instruments {
    public Brass(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }
}

