package com.stackroute;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Q5Test {

    @Test
    public void modifyMap() {
        HashMap<String, String> testMap = new HashMap<>();
        HashMap<String, String> resMap = new HashMap<>();
        testMap.put("key1", "clock");
        testMap.put("key2", "watch");
        resMap.put("key1","");
        resMap.put("key2","clock");

        assertEquals("Incorrect Output", resMap, Q5.modifyMap(testMap));
    }
}