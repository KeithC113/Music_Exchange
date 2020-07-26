package ProductType.Instruments;

import ProductType.Instruments.Strings.Guitar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar ;

    @Before
    public void before(){

        guitar = new Guitar("wood","Red",100.00, 200.00, "Fender", "Strat","electric","Twang", 4 );
    }

    @Test
    public void hasSound() { assertEquals("Twang", guitar.getSound()); }

    @Test
    public void hasMake(){ assertEquals("Fender", guitar.getMake());}

    @Test
    public void hasMaterial(){assertEquals("wood", guitar.getMaterial());}

    @Test
    public void hasType(){assertEquals("electric", guitar.getType());}

}