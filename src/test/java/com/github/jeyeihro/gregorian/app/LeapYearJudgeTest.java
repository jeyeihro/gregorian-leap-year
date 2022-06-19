package com.github.jeyeihro.gregorian.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearJudgeTest {
    @Test
    void isLeap_negative(){
        assertFalse(LeapYearJudge.isLeap(-400));
    }

    @Test
    void isLeap_zero(){
        assertFalse(LeapYearJudge.isLeap(0));
    }

    @Test
    void isLeap_1(){
        assertFalse(LeapYearJudge.isLeap(1));
    }

    @Test
    void isLeap_4(){
        assertTrue(LeapYearJudge.isLeap(4));
    }

    @Test
    void isLeap_6(){
        assertFalse(LeapYearJudge.isLeap(6));
    }

    @Test
    void isLeap_8(){
        assertTrue(LeapYearJudge.isLeap(8));
    }

    @Test
    void isLeap_99(){
        assertFalse(LeapYearJudge.isLeap(99));
    }

    @Test
    void isLeap_100(){
        assertFalse(LeapYearJudge.isLeap(100));
    }

    @Test
    void isLeap_101(){
        assertFalse(LeapYearJudge.isLeap(101));
    }

    @Test
    void isLeap_399(){
        assertFalse(LeapYearJudge.isLeap(399));
    }

    @Test
    void isLeap_400(){
        assertTrue(LeapYearJudge.isLeap(400));
    }

    @Test
    void isLeap_401(){
        assertFalse(LeapYearJudge.isLeap(401));
    }

    @Test
    void isLeap_700(){
        assertFalse(LeapYearJudge.isLeap(700));
    }

    @Test
    void isLeap_800(){
        assertTrue(LeapYearJudge.isLeap(800));
    }

    @Test
    void isLeap_1000(){
        assertFalse(LeapYearJudge.isLeap(1000));
    }

    @Test
    void isLeap_2000(){
        assertTrue(LeapYearJudge.isLeap(2000));
    }

    @Test
    void instantiation(){
        LeapYearJudge l = new LeapYearJudge();
        assertEquals(LeapYearJudge.class, l.getClass());
    }

}