package ProductType.InstrumentAccessories;

import Behaviours.ISell;
import ProductType.ProductType;

public class InstrumentAccessories extends ProductType implements ISell {

    private String description;

    public InstrumentAccessories(String material, String colour, double buyPrice, double sellPrice, String description) {
        super(material, colour, buyPrice, sellPrice);

        this.description = description;
    }

    public String getDescription() { return description;}

    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }
}