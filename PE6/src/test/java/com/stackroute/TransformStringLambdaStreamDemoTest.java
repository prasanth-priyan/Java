package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransformStringLambdaStreamDemoTest {

    @Test
    public void getString() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);
        String resStr = TransformStringLambdaStreamDemo.getString(list);
        System.out.println(resStr);
    }
}