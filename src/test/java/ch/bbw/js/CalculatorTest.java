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
    //multiply
    @Test
    public void testMultiplikationZweiPositiveIsOk() {
        assertTrue(test.multiplikation(8, 7) == 56);
    }

    @Test
    public void testMultiplikationZweiNegativeIsOk() {

        assertTrue(test.multiplikation(-5, -7) == 35);
    }

    @Test
    public void testMultiplikationPositivUndNegativeIsOk() {

        assertTrue(test.multiplikation(-10, 5) == -50);
    }

    @Test
    public void testMultiplikationZeroIsOk() {

        assertTrue(test.multiplikation(80, 0) == 0);
    }

    @Test
    public void testMultiplikationZeroIsOk2() {

        assertTrue(test.multiplikation(0, 90) == 0);
    }

    @Test
    public void testMultiplikation0Und0IsOk() {

        assertTrue(test.multiplikation(0, 0) == 0);
    }



}
