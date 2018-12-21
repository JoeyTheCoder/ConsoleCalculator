package ch.bbw.js;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */

public class CalculatorTest {


    private Calculator test;


    //summe

    @Before
    public void initialize() {
        test = new Calculator();
    }

    @After
    public void shutdown() {
        test = null;
    }

    @Test

    public void testSummezweiPositiveTrue() {

        assertTrue(test.summe(5, 10) == 15);
    }

    @Test
    public void testSummeZweiNegativeTrue() {

        assertTrue(test.summe(-9, -7) == -16);
    }

    @Test
    public void testSummePositivUndNegativeTrue() {

        assertTrue(test.summe(33, -8) == 25);
    }

    @Test
    public void testSummeMaxValueUndMinValueTrue() {

        assertTrue(test.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSummeMaxValueUndZeroIsOk() {

        assertTrue(test.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
    }

    @Test
    public void testSummeMaxValueUndIsMinValueFalse() {

        assertTrue(test.summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
    }

    @Test
    public void testSummeMaxValueFalse() {
        assertFalse(test.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -3);
    }

    @Test
    public void testSummeZeroTrue() {

        assertTrue(test.summe(-50, 50) == 0);
    }

    //subtraction
    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        assertTrue(test.subtraction(25, 9) == 16);
    }

    @Test
    public void testSubtraktionZweiNegativeIsOk() {

        assertTrue(test.subtraction(-10, -11) == 1);
    }

    @Test
    public void testSubtraktionPositivUndNegativeIsOk() {

        assertTrue(test.subtraction(15, -6) == 21);
    }


    @Test
    public void testSubtraktionMaxValueUndZeroIsOk() {

        assertTrue(test.subtraction(Integer.MAX_VALUE, 0) == 0x7fffffff);
    }

    @Test
    public void testSubtraktionMinValueUndZeroIsOk() {

        assertTrue(test.subtraction(Integer.MIN_VALUE, 0) == -0x80000000);
    }

    @Test
    public void testSubtraktionZeroIsOk() {

        assertTrue(test.subtraction(18, 18) == 0);
    }


}
