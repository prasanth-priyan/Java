package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDAndLOccurrencesTest {

    @Test
    public void replaceDAndLOccurrences_TestStrGiven_ShouldReturnOutput() {
        assertEquals("Incorrect Output","faity fry",ReplaceDAndLOccurrences.replaceDAndLOccurrences("daily dry"));
        assertEquals("Incorrect Output","Faity Fance Tevet",ReplaceDAndLOccurrences.replaceDAndLOccurrences("Daily Dance Level"));
    }

}