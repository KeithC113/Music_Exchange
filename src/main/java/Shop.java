import Behaviours.ISell;
import ProductType.ProductType;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }
        public int stockCount() { return stock.size();}

        public void addItemToStock (ISell item ){
            stock.add(item);
        }
        public void sellItem (ISell item ){
            stock.remove(item);
        }
}


