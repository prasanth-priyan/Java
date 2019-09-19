package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConsecutiveNumbersTest {

    @Test
    public void consecutiveNumbers_NumbersGiven_ShouldPrintConsecutiveOrNot(){

        assertTrue("Incorrect Output", ConsecutiveNumbers.checkConsecutive("110,111,112,113,114,115,116"));
        assertTrue("Incorrect Output", ConsecutiveNumbers.checkConsecutive("-1,0,1,2,3,4,5"));

        assertFalse("Incorrect Output", ConsecutiveNumbers.checkConsecutive("110,111,121,113,114,109,116"));
        assertFalse("Incorrect Output", ConsecutiveNumbers.checkConsecutive("-1,-1,0,0,1,1,2"));

    }

}