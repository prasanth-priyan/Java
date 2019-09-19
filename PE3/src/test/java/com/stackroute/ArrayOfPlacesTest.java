package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayOfPlacesTest {

    @Test
    public void checkArrayOfPlaces_ArrayGiven_ShouldPrintWithoutVowels(){
        assertArrayEquals("Incorrect Output", new String[]{"Grmny", "untd Stts", "STRL", "MZMBQ", "czchslvk"}, ArrayOfPlaces.checkArrayOfPlaces(new String[]{"Germany", "united States", "AUSTRALIA", "MOZAMBIQUE", "czechoslovakia"}));
    }

}
