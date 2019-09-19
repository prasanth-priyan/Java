package com.stackroute;

public class ReplaceDAndLOccurrences {
    public static String replaceDAndLOccurrences(String testStr){
        String resultStr = testStr.replace('d','f');
        resultStr = resultStr.replace('D','F');
        resultStr = resultStr.replace('l','t');
        resultStr = resultStr.replace('L','T');

        return resultStr;
    }
}
