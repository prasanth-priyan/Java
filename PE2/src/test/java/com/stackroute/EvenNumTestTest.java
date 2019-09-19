package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenNumTestTest {

    @Test
    public void testEvenNumTestTrue(){
        assertTrue("Incorrect return value - should return true", EvenNumTest.isEven(596));
    }

    @Test
    public void testEvenNumTestFalse(){
        assertFalse("Incorrect return value - should return false",EvenNumTest.isEven(297));
    }

    @Test
    public void testEvenNumTestTrivial(){
        assertTrue("Trivial test failed",EvenNumTest.isEven(0));
    }

}
