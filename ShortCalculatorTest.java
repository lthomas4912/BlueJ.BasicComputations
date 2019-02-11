 

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ShortCalculatorTest {
   private static volatile  ShortCalculator shortCalc = new ShortCalculator();
    
   @Test
   public void testShortAddition() {
     
       short baseValue = 20;
       short addedValue = 4;
       short expected = 24;
       
       short actual = shortCalc.add(baseValue, addedValue);
       
       assertEquals(expected, actual);
       
  
}
    
@Test
    public void testShortSubtraction() {
        
        short baseValue = 20;
        short addedValue = 4;
        short expected = 16;
        
        short actual = shortCalc.sub( baseValue, addedValue);
        
        assertEquals(expected, actual);
}
    
@Test
    public void testShortMultiply() {
    
        short multiplicand = 5;
        short multiplier = 2;
        short expected = 10;
        
        short actual = shortCalc.mult( multiplicand, multiplier);
        
        assertEquals(expected, actual);
    }
    
@Test
    public void testShortDivide() {
    
        short dividend = 36;
        short divisor = 3;
        short expected = 12;
        
        short actual = shortCalc.div( dividend, divisor);
        
        assertEquals(expected, actual);
   }
   
@Test
    public void testShortMod() {
    
        short dividend = 12;
        short divisor = 5;
        short expected = 2;
        
        short actual = shortCalc.mod( dividend, divisor);
        
        assertEquals(expected, actual);
    }
    
    
}


