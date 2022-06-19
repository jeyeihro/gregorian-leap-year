package com.github.jeyeihro.gregorian.display;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayFactoryTest {
    @Test
    void args_null(){
        Display d = DisplayFactory.create(null);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_0(){
        Display d = DisplayFactory.create(new String[0]);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_1_numeric(){
        String[] args = {"1"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayOne);
    }

    @Test
    void args_1_non_numeric(){
        String[] args = {"a"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_2_numeric(){
        String[] args = {"1","2"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayFromTo);
    }

    @Test
    void args_2_non_numeric_left(){
        String[] args = {"a","2"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_2_non_numeric_right(){
        String[] args = {"1","a"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_2_non_numeric_both(){
        String[] args = {"b","c"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_3_numeric(){
        String[] args = {"1","2","3"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void args_3_non_numeric(){
        String[] args = {"1","2","a"};
        Display d = DisplayFactory.create(args);
        assertTrue(d instanceof DisplayToNow);
    }

    @Test
    void instantiation(){
        DisplayFactory d = new DisplayFactory();
        assertEquals(DisplayFactory.class, d.getClass());
    }
}