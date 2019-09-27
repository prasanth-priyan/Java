package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpperCaseLambdaStreamDemoTest {

    @Test
    public void toUpperCase() {
        List<String> list = new ArrayList<>();
        list.add("arjun");
        list.add("bHANu");
        list.add("ChaRLIE");
        list.add("GOPAL");
        list.add("XANder");
        List<String> list2 = new ArrayList<>(UpperCaseLambdaStreamDemo.toUpperCase(list));
        System.out.println("Original List");
        for (String item:
             list) {
            System.out.println(item);
        }
        System.out.println("Revised List");
        for (String item:
                list2) {
            System.out.println(item);
        }
    }
}