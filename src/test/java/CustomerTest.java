
import ProductType.InstrumentAccessories.Brass.TrumpetValves;
import ProductType.Instruments.Brass.Trumpet;
import ProductType.Instruments.Strings.Guitar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
        Shop shop;
        Customer customer;
        Guitar guitar;
        Trumpet trumpet;
        TrumpetValves trumpetValves;

@Before
public void before() {
    customer = new Customer("Keith", 300);
    guitar = new Guitar("wood", "Red", 100.00, 200.00, "Fender", "Strat", "electric", "Twang", 4);
    trumpetValves = new TrumpetValves("brass", "gold", 10, 20, "Lips", 3);

    trumpet = new Trumpet("brass", "gold", 140.00, 250.00, "Bach", "Piccolo", "paaaarp");
}
    @Test
    public void canBuyItem() {
        customer.buy(guitar);
        assertEquals(1, customer.boughtItemsCount());
        assertEquals(100, customer.getMoney());
    }

    @Test
    public void getBoughtItemsCount() {
        assertEquals(0, customer.boughtItemsCount());
    }
}
