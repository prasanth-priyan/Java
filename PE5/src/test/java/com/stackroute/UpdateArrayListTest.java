package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArrayListTest {

    @Test
    public void updateArrayList_PassedListAndReplacement_ShouldReturnModifiedList() {
        ArrayList<String> testList = new ArrayList<String>(Arrays.asList("Apple", "Orange", "Mango"));
        ArrayList<String> resList = new ArrayList<String>(Arrays.asList("Kiwi", "Orange", "Mango"));
        assertEquals("Incorrect Output", resList, UpdateArrayList.updateArrayList(testList, "Apple", "Kiwi"));
    }
}