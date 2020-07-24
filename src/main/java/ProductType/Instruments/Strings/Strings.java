package ProductType.Instruments.Strings;

import Behaviours.IPluck;
import ProductType.Instruments.Instruments;

public abstract class Strings extends Instruments{
    public Strings(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }
}
