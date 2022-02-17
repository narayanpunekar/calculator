package com.narayanpunekar.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author 
 */
public class CalculatorTest {
    private Calculator clsCalculator = new Calculator();
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSum() {
        assertEquals(5, clsCalculator.sum(2, 3));
    }
}
