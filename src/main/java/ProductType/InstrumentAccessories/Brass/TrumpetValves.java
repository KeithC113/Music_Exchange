package ProductType.InstrumentAccessories.Brass;

import ProductType.InstrumentAccessories.InstrumentAccessories;

public class TrumpetValves extends InstrumentAccessories {

    private int numberOfValves;

    public TrumpetValves(String material, String colour, double buyPrice, double sellPrice, String description, int numberOfValves) {
        super(material, colour, buyPrice, sellPrice, description);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() { return numberOfValves;}
}
