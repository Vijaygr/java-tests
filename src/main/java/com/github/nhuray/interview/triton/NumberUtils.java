package com.github.nhuray.interview.triton;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class NumberUtils {

    private final static Map<Integer, String> NUMBERS = ImmutableMap.<Integer, String> builder()
            .put(1, "one")
            .put(2, "two")
            .build();

    public static String plainEnglish(int number) {
        return NUMBERS.get(number);
    }
}
