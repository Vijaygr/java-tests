package com.github.nhuray.interview.triton;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class NumberUtils {

    // Digits array
    private static final String[] digits = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };


    // Teens array
    private static final String[] teens = {
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    public static String plainEnglish(int number) {
        // Number is negative
        if (number < 0) throw new IllegalArgumentException("Number should be greater than zero");

        // Number between 0 to 9
        if (number >= 0 && number < 10) {
            return digits[(number % 10)];
        }

        // Number between 11 to 19
        if (number > 10 && number < 20) {
            return teens[(number % 10) - 1];
        }
        return null;
    }
}
