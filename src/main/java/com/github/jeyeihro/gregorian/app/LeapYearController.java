package com.github.jeyeihro.gregorian.app;

import com.github.jeyeihro.gregorian.display.Display;
import com.github.jeyeihro.gregorian.display.DisplayFactory;

public class LeapYearController {
    public final String[] args;

    public LeapYearController(String[] args){
        this.args = args;
    }

    public void execute(){
        Display display = DisplayFactory.create(this.args);
        display.show();
    }
}
