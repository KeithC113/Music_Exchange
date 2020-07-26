package ProductType.Instruments.Percussion;

import Behaviours.ISell;
import ProductType.ProductType;

public class Drums extends Percussion implements ISell {
    public Drums(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }

    public String getColour() {
        return null;
    }

    public void beat(Drums drums) {

    }

    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }
}
