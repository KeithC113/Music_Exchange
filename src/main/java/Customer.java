import ProductType.ProductType;

import java.util.ArrayList;

public class Customer{

    private String name;
    private int money;
    private ArrayList<ProductType> boughtItems;

    public Customer(String name, int money){
        this.money = money;
        this.name = name;
        this.boughtItems = new ArrayList<ProductType>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<ProductType> getBoughtItems() {
        return boughtItems;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setBoughtItems(ArrayList<ProductType> boughtItems) {
        this.boughtItems = boughtItems;
    }
    public void buy(ProductType productType){
        boughtItems.add(productType);
        money -= productType.getSellPrice();
    }
    public int boughtItemsCount(){ return boughtItems.size();}
}