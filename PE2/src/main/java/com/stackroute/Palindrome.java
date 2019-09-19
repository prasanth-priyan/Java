package com.stackroute;

public class Palindrome {
    public static boolean checkPalindrome(int num){
        int temp,rev=0;
        temp=num;
        while (temp != 0) {
            rev += (temp%10);
            rev *= 10;
            temp /= 10;
        }
        rev /= 10;
        return rev == num;
    }
}
