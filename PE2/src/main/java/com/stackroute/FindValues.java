package com.stackroute;

public class FindValues {

    public static double findAvg(int[] grades, int n){
        double avg=0;
        for (int grade :
                grades) {
            avg += grade;
        }
        avg/=n;
        return avg;
    }

    public static int findMin(int[] grades, int n){
        int min=grades[0];
        for (int grade :
                grades) {
            min = (min<=grade) ? min : grade;
        }
        return min;
    }

    public static int findMax(int[] grades, int n){
        int max=0;
        for (int grade :
                grades) {
            max = (max>=grade) ? max : grade;
        }
        return max;
    }

}
