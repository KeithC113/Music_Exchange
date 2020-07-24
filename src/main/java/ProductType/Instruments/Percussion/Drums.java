package ProductType.Instruments.Percussion;

import Behaviours.IBeat;
import ProductType.Instruments.Instruments;

public class Drums extends Percussion {
    public Drums(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }

    public void beat(Drums drums) {

    }
}
