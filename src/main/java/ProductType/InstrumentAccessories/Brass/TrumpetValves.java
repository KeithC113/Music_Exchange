package ProductType.InstrumentAccessories.Brass;

import Behaviours.ISell;
import ProductType.InstrumentAccessories.InstrumentAccessories;

public class TrumpetValves extends InstrumentAccessories implements ISell {

    private int numberOfValves;

    public TrumpetValves(String material, String colour, double buyPrice, double sellPrice, String description, int numberOfValves) {
        super(material, colour, buyPrice, sellPrice, description);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() { return numberOfValves;}

    public double calculateMarkup() {
        return  - this.getSellPrice();
    }
}
