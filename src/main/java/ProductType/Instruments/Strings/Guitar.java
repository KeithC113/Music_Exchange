package ProductType.Instruments.Strings;

public class Guitar extends Strings {

    private String type;
    private int numberOfStrings;

    public Guitar(String material, String colour, double buyPrice, double sellPrice, String make, String model, String type, String sound, int numberOfStrings ) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
