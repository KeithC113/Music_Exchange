import ProductType.InstrumentAccessories.Brass.TrumpetValves;
import ProductType.Instruments.Brass.Trumpet;
import ProductType.Instruments.Strings.Guitar;

import ProductType.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Customer customer;
    Guitar guitar;
    Trumpet trumpet;
    TrumpetValves trumpetValves;

    @Before
    public void before(){
        customer = new Customer("Keith", 500);
        guitar = new Guitar("wood","Red",100.00, 200.00, "Fender", "Strat","electric","Twang", 4 );
        trumpetValves = new TrumpetValves("brass","gold",10,20,"Lips",3);
        trumpet = new Trumpet("brass","gold",140.00, 250.00, "Bach", "Piccolo","paaaarp" );
        shop = new Shop();
    }

    @Test
    public void stockStartsAtZero(){ assertEquals(0,shop.stockCount()); }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(trumpet);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canSell(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(trumpetValves);
        shop.sellItem(guitar);
        assertEquals(2, shop.stockCount());
    }

//    @Test
//    public void canCalculateProfit(){
//        shop.addItemToStock(guitar);
//        shop.addItemToStock(trumpet);
//        shop.addItemToStock(trumpetValves);
//        assertEquals(220,shop.calculateProfit(productType));
//
//    }
}