package com.stackroute;

import java.util.Arrays;

public class StringSort {
    public static String[] sortPara(String para){
        String[] results = para.split(" ");
        Arrays.sort(results);
        return results;
/*        String resultStr = "";
        for (String result :
                results) {
            resultStr += result;
        }
        return resultStr;*/
    }
}
