package ProductType.Instruments.Strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Black", 250.00, 500.00, "Fender", "Stratocaster", "Electric", "Twaaaaang", 4);
    }
    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());

    }

    @Test
    public void hasStrings(){
        assertEquals(4, guitar.getNumberOfStrings()); }
}