package com.github.jeyeihro.gregorian;

import com.github.jeyeihro.gregorian.app.LeapYearController;

public class Main {
    public static void main(String[] args) {
        LeapYearController leapYearController = new LeapYearController(args);
        leapYearController.execute();
    }
}
