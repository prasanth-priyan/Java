package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static Map<String, Boolean> q3(String[] testArr){
        Arrays.sort(testArr);
        Map<String, Boolean> result = new HashMap<>();
        String test;
        int count;
        for (int i = 0; i < testArr.length; i++) {
            test = testArr[i];
            count = 1;
            for (int j = i+1; j < testArr.length; j++) {
                if(test.equals(testArr[j])){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            if (count>1){
                result.put(test, true);
            }
            else{
                result.put(test, false);
            }
        }
        return result;
    }
}
