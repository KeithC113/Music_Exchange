package ProductType.Instruments.Strings;

public class Harp extends Strings {

    private int numberOfStrings;

    public Harp(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound, int numberOfStrings) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
        this.numberOfStrings = numberOfStrings;

    }
}
