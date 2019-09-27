package com.stackroute;

import java.util.List;

public class AverageLambdaStreamDemo {
    public static Double average(List<Integer> list){
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
