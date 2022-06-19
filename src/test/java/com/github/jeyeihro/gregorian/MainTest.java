package com.github.jeyeihro.gregorian;

import com.github.jeyeihro.gregorian.display.common.CommonSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CommonSetup.class)
class MainTest {
    @Test
    void mainTest(){
        String[] args = {"400"};
        Main.main(args);
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 400 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void instantiation(){
        Main m = new Main();
        assertEquals(Main.class, m.getClass());
    }
}