package ProductType.Instruments.Percussion;

import Behaviours.IBeat;

import ProductType.Instruments.Instruments;

public abstract class Percussion extends Instruments implements IBeat {
    public Percussion(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }

}
