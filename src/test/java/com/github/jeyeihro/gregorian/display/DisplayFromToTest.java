package com.github.jeyeihro.gregorian.display;

import com.github.jeyeihro.gregorian.display.common.CommonSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CommonSetup.class)
class DisplayFromToTest {
    @Test
    void show_200_400(){
        String lf = CommonSetup.newline();
        Display d = new DisplayFromTo(200, 400);
        d.show();
        System.out.flush();

        List<String> list = Arrays.asList("204","208","212","216","220","224","228","232","236","240","244","248","252","256","260","264","268","272","276","280","284","288","292","296","304","308","312","316","320","324","328","332","336","340","344","348","352","356","360","364","368","372","376","380","384","388","392","396","400");
        StringJoiner sj = new StringJoiner(lf);
        list.stream().forEach(s -> sj.add(s));

        String expected =
                "The year from 200 to 400 AD list" + lf
                        + "-----------------------------------------" + lf
                        + sj.toString() + lf;
        String actual = CommonSetup.getOutput();
        assertEquals(expected, actual);
    }
}