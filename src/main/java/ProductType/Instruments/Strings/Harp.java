package ProductType.Instruments.Strings;

import Behaviours.IPluck;
import Behaviours.ISell;
import ProductType.Instruments.Brass.Brass;
import ProductType.Instruments.Instruments;
import ProductType.ProductType;

public class Harp extends Instruments implements ISell, IPluck {

    public Harp(String material, String colour, double buyPrice, double sellPrice, String make, String model, String sound, int numberOfStrings) {
        super(material, colour, buyPrice, sellPrice, make, model, sound);

    }

    public double calculateProfit(ProductType productType) {
        double profit = productType.getSellPrice() - productType.getBuyPrice();
        return profit;
    }


    public void pluck(Strings strings) {

    }


}
