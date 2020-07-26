package ProductType.Instruments;

import ProductType.Instruments.Brass.Trumpet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

        Trumpet trumpet ;

        @Before
        public void before(){

            trumpet = new Trumpet ("brass","gold",140.00, 250.00, "Bach", "Piccolo","paaaarp" );
        }

        @Test
        public void hasSound() {
            assertEquals("paaaarp", trumpet.getSound());
        }

        @Test
        public void hasBuyPrice(){
            assertEquals(140, trumpet.getBuyPrice(),1);
        }

        @Test
        public void hasColour(){
            assertEquals("gold", trumpet.getColour());
        }


}