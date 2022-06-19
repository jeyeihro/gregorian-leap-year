package com.github.jeyeihro.gregorian.app;

public class LeapYearJudge {
    public static boolean isLeap(int year){
        if(year <= 0){
            return false;
        }
        if(year % 400 == 0){
            return true;
        }
        if(year % 4 == 0){
            if(year % 100 == 0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
