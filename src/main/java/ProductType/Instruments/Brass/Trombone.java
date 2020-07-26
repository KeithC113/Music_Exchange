package ProductType.Instruments.Brass;

import Behaviours.ISell;
import Behaviours.IToot;
import ProductType.ProductType;

public class Trombone extends Brass implements ISell, IToot {
    public Trombone(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
    }

    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }


    public void toot(Brass brass) {

    }
}
