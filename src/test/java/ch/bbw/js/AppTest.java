package ch.bbw.js;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;



public class AppTest extends TestCase
    {

        public AppTest( String testName )
        {
            super( testName );
        }

        public static Test suite()
        {
            return new TestSuite( AppTest.class );
        }

        public void testApp()
        {
            assertTrue( true );
        }
    }



