package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.app.LeapYearJudge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayOne implements Display{
    public final int target;
    public DisplayOne(int target){
        this.target = target;
    }

    @Override
    public void show() {
        if(LeapYearJudge.isLeap(target)){
            System.out.println("The year " + target + " AD is a leap year.");
        }else{
            System.out.println("The year " + target + " AD is not a leap year.");
        }
    }

}
