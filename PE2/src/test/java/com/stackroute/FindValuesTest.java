package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindValuesTest {

    @Test
    public void testFindValuesAvg(){
        assertEquals("Incorrect average value - should return 81.5",81.5d,
                FindValues.findAvg(new int[]{86, 65, 98, 77}, 4),0.01);
        assertEquals("Incorrect average value - should return 70.0",70.0d,
                FindValues.findAvg(new int[]{200,4,6}, 3),0.01);
    }


    @Test
    public void testFindValuesMin(){
        assertEquals("Incorrect minimum value - should return 65", 65,
                FindValues.findMin(new int[]{86, 65, 98, 77},4));
        assertEquals("Incorrect minimum value - should return 4",4,
                FindValues.findMin(new int[]{200, 4, 6},3));
        assertEquals("Incorrect minimum value - should return 0", 0,
                FindValues.findMin(new int[]{0, 0, 0, 0, 0},5));
    }

    @Test
    public void testFindValuesMax(){
        assertEquals("Incorrect return value - should return 98", 98,
                FindValues.findMax(new int[]{86, 65, 98, 77},4));
        assertEquals("Incorrect return value - should return 200",200,
                FindValues.findMax(new int[]{200,4,6},3));
        assertEquals("Incorrect maximum value - should return 0", 0,
                FindValues.findMax(new int[]{0, 0, 0, 0, 0},5));
    }
}
