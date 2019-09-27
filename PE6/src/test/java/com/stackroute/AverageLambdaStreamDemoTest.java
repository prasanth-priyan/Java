package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AverageLambdaStreamDemoTest {

    @Test
    public void average() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(AverageLambdaStreamDemo.average(list));
    }
}