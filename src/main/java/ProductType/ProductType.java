package ProductType;

public abstract class ProductType {
    private String material;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public ProductType(String material, String colour, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
