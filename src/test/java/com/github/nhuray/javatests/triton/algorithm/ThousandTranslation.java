package com.github.nhuray.javatests.triton.algorithm;

import org.junit.Assume;

public class ThousandTranslation {

    private int number;
    private String translation;

    public ThousandTranslation(int number, String translation) {
        Assume.assumeTrue(number >= 1000 && number < 1000000);
        this.number = number;
        this.translation = translation;
    }

    public int getNumber() {
        return number;
    }

    public Object getTranslation() {
        return translation;
    }
}
