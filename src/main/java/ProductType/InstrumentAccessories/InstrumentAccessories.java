package ProductType.InstrumentAccessories;

import ProductType.ProductType;




public class InstrumentAccessories extends ProductType {

    private String description;

    public InstrumentAccessories(String material, String colour, double buyPrice, double sellPrice, String description) {
        super(material, colour, buyPrice, sellPrice);

        this.description = description;
    }

    public String getDescription() { return description;}
}