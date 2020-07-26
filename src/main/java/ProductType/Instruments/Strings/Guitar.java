package ProductType.Instruments.Strings;

import ProductType.Instruments.Instruments;

public class Guitar extends Instruments {

    private String type;

    public Guitar(String material, String colour, double buyPrice, double sellPrice, String make, String model, String type, String sound, int numberOfStrings ) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
