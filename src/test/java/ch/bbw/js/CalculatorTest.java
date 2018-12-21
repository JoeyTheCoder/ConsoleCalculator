package ch.bbw.js;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CalculatorTest {

    private Calculator test;

    //Summe

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

        assertTrue(test.Summe(5, 10) == 15);
    }

    @Test
    public void testSummeZweiNegativeTrue() {

        assertTrue(test.Summe(-9, -7) == -16);
    }

    @Test
    public void testSummePositivUndNegativeTrue() {

        assertTrue(test.Summe(33, -8) == 25);
    }

    @Test
    public void testSummeMaxValueUndMinValueTrue() {

        assertTrue(test.Summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSummeMaxValueUndZeroIsOk() {

        assertTrue(test.Summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
    }

    @Test
    public void testSummeMaxValueUndIsMinValueFalse() {

        assertTrue(test.Summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
    }

    @Test
    public void testSummeMaxValueFalse() {
        assertFalse(test.Summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -3);
    }

    @Test
    public void testSummeZeroTrue() {

        assertTrue(test.Summe(-50, 50) == 0);
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Calculator.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
