package com.github.jeyeihro.gregorian.display;

import java.util.Arrays;

public class DisplayFactory {
    public static Display create(String[] args){
        if(args == null){
            return new DisplayToNow();
        }

        if(!numericCheck(args)){
            // If each argument cannot be parsed as a number, return default.
            return new DisplayToNow();
        }

        switch(args.length){
            case 1 -> {
                return new DisplayOne(Integer.parseInt(args[0]));
            }
            case 2 -> {
                return new DisplayFromTo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            default -> {
                // Invalid number of arguments will be denied.
                 return new DisplayToNow();
            }
        }
    }

    private static boolean numericCheck(String[] args){
        return Arrays.stream(args).allMatch(s -> s.chars().allMatch(Character::isDigit));
    }
}
