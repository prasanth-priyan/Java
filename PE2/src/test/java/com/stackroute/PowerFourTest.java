package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerFourTest {
    @Test
    public void testPalindromeTrue(){
        assertTrue("Incorrect return value - should return true", PowerFour.checkFour(4096));
    }

    @Test
    public void testPalindromeFalse(){
        assertFalse("Incorrect return value - should return false", PowerFour.checkFour(257));
    }

    @Test
    public void testPalindromeTrivial(){
        assertFalse("Trivial test failed", PowerFour.checkFour(0));
    }
}
