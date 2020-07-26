import Behaviours.ISell;
import ProductType.ProductType;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ProductType> stock;
    private int till;

    public Shop(int till) {
        this.till = 1000;
        this.stock = new ArrayList<ProductType>();
    }

    public int stockCount() { return stock.size();}
//
//        public void calculateProfit (ProductType productType){
//
//        }
//
        public ArrayList<ProductType> getStock () {return stock;}

        public int getTill () {return till;}

        //    @Override
        public void addItemToStock (ProductType productType){
            stock.add(productType);
            till -= productType.getBuyPrice();
        }
        //
        public void sellItem (ProductType productType){
            stock.remove(productType);
            till += productType.getSellPrice();
//                customer.buyItem(productType);
        }

}

