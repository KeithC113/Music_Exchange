package ProductType.Instruments.Percussion;

import ProductType.Instruments.Percussion.Drums;

public class Drums extends Percussion {
    public Drums(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }

    public String getColour() {
        return null;
    }

    public void beat(Drums drums) {

    }
}
