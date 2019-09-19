package com.stackroute;

public class PowerFour {
    public static boolean checkFour(int num){
        int div=4;
        while( (num>div) && ((num%div)!=0) ){
            div*=4;
        }
        return div <= num;
    }
}
