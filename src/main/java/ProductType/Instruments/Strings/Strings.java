package ProductType.Instruments.Strings;

import ProductType.Instruments.Instruments;

public abstract class Strings extends Instruments{

    private int numberOfStrings;

    public Strings(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound, int numberOfStrings) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
