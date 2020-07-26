package ProductType.IntrumentAccessories;

import ProductType.InstrumentAccessories.Brass.TrumpetValves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetValvesTest {

    TrumpetValves trumpetValves;

    @Before
    public void before(){
        trumpetValves = new TrumpetValves("brass","gold",10,20,"Lips",3);

    }
    @Test
    public void canGetNumberOfValves() {assertEquals(3, trumpetValves.getNumberOfValves());}
}
