package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringLambdaStreamDemo {
    public static List<String> search(List<String> list) {
        // Your code goes here
        return list.stream().filter(s -> s.startsWith("a") && s.length() == 3 ).collect(Collectors.toList());
    }
}
