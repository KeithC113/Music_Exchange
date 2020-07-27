package ProductType.Instruments.Brass;

import Behaviours.ISell;
import Behaviours.IToot;
import ProductType.ProductType;

public class Trumpet extends Brass implements ISell, IToot {

    private double buyPrice;
    private double sellPrice;

    public Trumpet(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);

        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public double calculateProfit() {
        double profit = this.buyPrice - this.sellPrice;
        return profit;
    }

    public double calculateProfit(ProductType productType) {
        return 0;
    }

    public void toot(Brass brass) {

    }
}
