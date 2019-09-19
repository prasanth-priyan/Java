package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Q3Test {

    @Test
    public void q3_PassedStringArray_ShouldReturnMap() {
        String[] testArr = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> testMap = new HashMap<>();
        testMap.put("a", true);
        testMap.put("b", false);
        testMap.put("c", true);
        testMap.put("d", false);

        assertEquals("Incorrect Output", testMap, Q3.q3(testArr));
    }
}