package com.ashahova.springboot.knightmove.spring_boot.service.algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Converter {
    protected int x;
    protected int y;

    static final int LENGHT_ALPHABET = 26;

    public static int getNumericCoorinate(String coordinate) {
        Matcher matcher = Pattern.compile("\\d+").matcher(coordinate);
        matcher.find();
        return Integer.valueOf(matcher.group());
    }
    public static int getNumericFromValue(String coordinate) {
        Matcher matcher = Pattern.compile("\\D+").matcher(coordinate);
        matcher.find();
        int corY = 0;
        for (int i = 0; i < matcher.group().length(); i++) {
            corY += ((int) matcher.group().charAt(i) - (int) ('A') + 1) * fast(LENGHT_ALPHABET, matcher.group().length() - 1 - i);
        }

        return corY;
    }
    public static long fast(int baseOfNumber, int power) {
        int result = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                result *= baseOfNumber;
            }
            power >>= 1;
            baseOfNumber *= baseOfNumber;
        }
        return result;
    }

}
