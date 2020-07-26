package ProductType.Instruments;

import ProductType.Instruments.Percussion.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

        Drums drums ;

        @Before
        public void before(){

            drums = new Drums("wood","Red",100.00, 200.00, "Gretch", "Brooklyn","taaaattsssssch" );
        }

        @Test
        public void hasSound() {
            assertEquals("taaaattsssssch", drums.getSound());
        }

        @Test
        public void hasMake(){
            assertEquals("Gretch", drums.getMake());
        }

        @Test
        public void hasMaterial(){assertEquals("wood", drums.getMaterial());}

        @Test
        public void hasSellPrice(){assertEquals(200, drums.getSellPrice(),1);}

}
