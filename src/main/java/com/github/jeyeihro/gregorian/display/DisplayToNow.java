package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.app.LeapYearJudge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class DisplayToNow implements Display{
    @Override
    public void show() {
        int currentYear = Integer.parseInt(DateTimeFormatter.ofPattern("yyyy").format(LocalDateTime.now()));

        System.out.println("The year from 1 to " + currentYear + " AD list");
        System.out.println("-----------------------------------------");
        IntStream.rangeClosed(1, currentYear).filter(n -> LeapYearJudge.isLeap(n)).forEach(n -> System.out.println(n));
    }
}
