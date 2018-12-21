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


    //add

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
    public void testSummeMaxValueUndZeroTrue() {

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

    //subtract
    @Test
    public void testSubtraktionZweiPositiveTrue() {
        assertTrue(test.subtraction(25, 9) == 16);
    }

    @Test
    public void testSubtraktionZweiNegativeTrue() {

        assertTrue(test.subtraction(-10, -11) == 1);
    }

    @Test
    public void testSubtraktionPositivUndNegativeTrue() {

        assertTrue(test.subtraction(15, -6) == 21);
    }


    @Test
    public void testSubtraktionMaxValueUndZeroTrue() {

        assertTrue(test.subtraction(Integer.MAX_VALUE, 0) == 0x7fffffff);
    }

    @Test
    public void testSubtraktionMinValueUndZeroTrue() {

        assertTrue(test.subtraction(Integer.MIN_VALUE, 0) == -0x80000000);
    }

    @Test
    public void testSubtraktionZeroTrue() {

        assertTrue(test.subtraction(18, 18) == 0);
    }
    //multiply
    @Test
    public void testMultiplikationZweiPositiveTrue() {
        assertTrue(test.multiplikation(8, 7) == 56);
    }

    @Test
    public void testMultiplikationZweiNegativeTrue() {

        assertTrue(test.multiplikation(-5, -7) == 35);
    }

    @Test
    public void testMultiplikationPositivUndNegativeTrue() {

        assertTrue(test.multiplikation(-10, 5) == -50);
    }

    @Test
    public void testMultiplikationZeroTrue() {

        assertTrue(test.multiplikation(80, 0) == 0);
    }

    @Test
    public void testMultiplikationZeroTrue2() {

        assertTrue(test.multiplikation(0, 90) == 0);
    }

    @Test
    public void testMultiplikationNullUndNullTrue() {

        assertTrue(test.multiplikation(0, 0) == 0);
    }

    //divide
    @Test
    public void testDivisionZweiPositiveTrue() {
        assertTrue(test.division(25, 5) == 5);
    }

    @Test
    public void testDivisionZweiNegativeTrue() {

        assertTrue(test.division(-15, -3) == 5);
    }

    @Test
    public void testDivisionPositivUndNegativeTrue() {

        assertTrue(test.division(12, -3) == -4);
    }

    @Test
    public void testDivisionNegativUndPositivTrue() {

        assertTrue(test.division(-10, 5) == -2);
    }
    @Test
    public void testDivisionMaxValueUnd1True() {

        assertTrue(test.division(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
    }

    @Test
    public void testDivisionZweiGleicheZahlenTrue() {

        assertTrue(test.division(19, 19) == 1);
    }

    @Test
    public void testDivisionDurch0False() throws ArithmeticException {

        assertFalse(test.division(13, 0) == 0);
    }

    @Test
    public void testDivisionNullDurchDividisorTrue() {


        assertTrue(test.division(0, 12) == 0);
    }





}
