package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.app.LeapYearJudge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class DisplayFromTo implements Display{
    public final int from;
    public final int to;
    public DisplayFromTo(int from, int to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void show(){
        System.out.println("The year from " + from + " to " + to + " AD list");
        System.out.println("-----------------------------------------");
        IntStream.rangeClosed(from, to).filter(n -> LeapYearJudge.isLeap(n)).forEach(n -> System.out.println(n));
    }
}
