package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCheckHarryTest {

    @Test
    public void checkHarry_PassedString_ShouldReturnBoolean() {

        assertTrue("Incorrect Output", StringCheckHarry.checkHarry("I am Harry Potter"));
        assertTrue("Incorrect Output", StringCheckHarry.checkHarry("HARRYism"));
        assertTrue("Incorrect Output", StringCheckHarry.checkHarry("WHEN HArrY met Sally"));
        assertFalse("Incorrect Output", StringCheckHarry.checkHarry("Hairy hari is a hary beast"));
    }
}