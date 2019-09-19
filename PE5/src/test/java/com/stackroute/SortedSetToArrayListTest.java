package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortedSetToArrayListTest {

    @Test
    public void sortedSet_PassedStringArray_ShouldReturnSortedList() {
        String[] sortedArr, testArr = {"Harry", "Alice", "Olive", "Bluto", "Eugene"};
        ArrayList<String> actualList = new ArrayList<>(SortedSetToArrayList.sortedSet(testArr));
        Arrays.sort(testArr);
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList(testArr));

        assertEquals("Incorrect Output", expectedList, actualList);
    }
}