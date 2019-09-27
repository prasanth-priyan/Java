package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilterStringLambdaStreamDemoTest {

    @Test
    public void search() {
        List<String> list = new ArrayList<>();
        list.add("arjun");
        list.add("anu");
        list.add("Ajay");
        list.add("Aju");
        list.add("all");
        List<String> list2 = new ArrayList<>(FilterStringLambdaStreamDemo.search(list));
        System.out.println("Original List");
        for (String item:
                list) {
            System.out.println(item);
        }
        System.out.println("Filtered List");
        for (String item:
                list2) {
            System.out.println(item);
        }
    }
}