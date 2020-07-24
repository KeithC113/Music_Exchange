package ProductType.Instruments;

import ProductType.ProductType;

public abstract class Instruments extends ProductType {

    private String description;
    private String make;
    private String model;
    private String sound;

    public Instruments(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice);
        this.description = description;
        this.make = make;
        this.model = model;
        this.sound = sound;
    }

    public String getDescription() {
        return description;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSound() {
        return sound;
    }
}
