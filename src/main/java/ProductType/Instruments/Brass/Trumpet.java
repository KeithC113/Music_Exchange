package ProductType.Instruments.Brass;

import Behaviours.ISell;
import Behaviours.IToot;
import ProductType.ProductType;

public class Trumpet extends Brass implements ISell, IToot {
    public Trumpet(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }


    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }

    public void toot(Brass brass) {

    }
}
