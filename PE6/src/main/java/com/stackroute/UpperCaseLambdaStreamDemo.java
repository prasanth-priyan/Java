package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLambdaStreamDemo {

    public static List<String> toUpperCase(List<String> list) {
        // Your code goes here
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
