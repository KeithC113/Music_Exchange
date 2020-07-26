package ProductType.Instruments.Strings;

import Behaviours.IPluck;
import Behaviours.ISell;
import ProductType.Instruments.Instruments;
import ProductType.ProductType;

public class Guitar extends Instruments implements IPluck, ISell {

    private String type;

    public Guitar(String material, String colour, double buyPrice, double sellPrice, String make, String model, String type, String sound, int numberOfStrings ) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void pluck(Strings strings) {

    }
    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }
}
