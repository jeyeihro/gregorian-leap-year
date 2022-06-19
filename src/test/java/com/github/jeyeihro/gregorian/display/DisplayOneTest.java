package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.display.common.CommonSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CommonSetup.class)
class DisplayOneTest{
    @Test
    void show_2000(){
        Display d = new DisplayOne(2000);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 2000 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_2001(){
        Display d = new DisplayOne(2001);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 2001 AD is not a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_2004(){
        Display d = new DisplayOne(2004);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 2004 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_1600(){
        Display d = new DisplayOne(1600);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 1600 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_1900(){
        Display d = new DisplayOne(1900);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 1900 AD is not a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_100(){
        Display d = new DisplayOne(100);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 100 AD is not a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_400(){
        Display d = new DisplayOne(400);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 400 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }

    @Test
    void show_4(){
        Display d = new DisplayOne(4);
        d.show();
        System.out.flush();
        String expected = CommonSetup.createExpected("The year 4 AD is a leap year.");
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }
}