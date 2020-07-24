package Instruments;

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

}
