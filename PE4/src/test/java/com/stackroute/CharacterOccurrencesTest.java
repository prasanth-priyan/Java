package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurrencesTest {

    @Test
    public void getCharacterOccurrences_TestStringAndCharacterPassed_ShouldReturnOccurrences() {
        assertEquals("Incorrect Output - Basic Test Failed", 3,CharacterOccurrences.getCharacterOccurrences("Mary had a little lamb",'l'));
        assertEquals("Incorrect Output - Case Test Failed",10 ,CharacterOccurrences.getCharacterOccurrences("Ladle ladle ladle LLll",'L'));
        assertEquals("Incorrect Output - Absent Character Test Failed", 0,CharacterOccurrences.getCharacterOccurrences("Mozambique",'P'));
    }

}