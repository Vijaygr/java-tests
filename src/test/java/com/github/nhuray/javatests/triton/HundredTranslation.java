package com.github.nhuray.javatests.triton;

import org.junit.Assume;

public class HundredTranslation {

    private int hundred;
    private String translation;

    public HundredTranslation(int number, String translation) {
        Assume.assumeTrue(number >= 100 && number < 1000);
        this.hundred = number;
        this.translation = translation;
    }

    public int getNumber() {
        return hundred;
    }

    public String getTranslation() {
        return translation;
    }
}
