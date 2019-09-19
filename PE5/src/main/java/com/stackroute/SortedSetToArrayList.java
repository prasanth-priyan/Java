package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedSetToArrayList {
    public static ArrayList<String> sortedSet(String[] testArr){
        return new ArrayList<>(new TreeSet<>(Arrays.asList(testArr)));
    }
}
