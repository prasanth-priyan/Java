package com.stackroute;


public class TransposeString {

    public static String transposeString(String testStr){
        char[] chars;
        char temp;
        int n;
        String[] words = testStr.split(" ");
        String resultStr = "";
        for (String word :
                words) {
            chars = word.toCharArray();
            n = chars.length;
            for (int i = 0; i < n / 2; i++) {
                temp = chars[i];
                chars[i] = chars[n-i-1];
                chars[n-i-1] = temp;
            }
            resultStr += new String(chars) + " ";
        }
        return resultStr.trim();
    }
}
