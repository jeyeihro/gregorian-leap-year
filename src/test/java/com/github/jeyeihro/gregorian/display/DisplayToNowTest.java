package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.display.common.CommonSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CommonSetup.class)
class DisplayToNowTest {
    private static final LocalDateTime localDateTime = LocalDateTime.of(400, 11, 30, 12, 34, 56);

    @InjectMocks
    private DisplayToNow displayToNow;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void show_1_400(){
        String lf = CommonSetup.newline();
        MockedStatic<LocalDateTime> mock = Mockito.mockStatic(LocalDateTime.class, Mockito.CALLS_REAL_METHODS);
        mock.when(LocalDateTime::now).thenReturn(localDateTime);

        displayToNow = new DisplayToNow();
        displayToNow.show();
        System.out.flush();

        List<String> list = Arrays.asList("4","8","12","16","20","24","28","32","36","40","44","48","52","56","60","64","68","72","76","80","84","88","92","96","104","108","112","116","120","124","128","132","136","140","144","148","152","156","160","164","168","172","176","180","184","188","192","196","204","208","212","216","220","224","228","232","236","240","244","248","252","256","260","264","268","272","276","280","284","288","292","296","304","308","312","316","320","324","328","332","336","340","344","348","352","356","360","364","368","372","376","380","384","388","392","396","400");
        StringJoiner sj = new StringJoiner(lf);
        list.stream().forEach(s -> sj.add(s));

        String expected =
                  "The year from 1 to 400 AD list" + lf
                + "-----------------------------------------" + lf
                + sj.toString() + lf;
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }
}