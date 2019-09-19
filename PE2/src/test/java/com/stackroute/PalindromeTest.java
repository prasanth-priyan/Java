package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testPalindromeTrue(){
        assertTrue("Incorrect return value - should return true", Palindrome.checkPalindrome(12321));
    }

    @Test
    public void testPalindromeFalse(){
        assertFalse("Incorrect return value - should return false", Palindrome.checkPalindrome(12345));
    }

    @Test
    public void testPalindromeTrivial(){
        assertTrue("Trivial test failed", Palindrome.checkPalindrome(1));
    }

}
