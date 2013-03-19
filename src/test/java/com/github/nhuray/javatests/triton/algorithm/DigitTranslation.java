package com.github.nhuray.javatests.triton.algorithm;

import org.junit.Assume;

public class DigitTranslation {

    private Integer digit;
    private String translation;

    public DigitTranslation(Integer number, String translation) {
        Assume.assumeTrue(number >= 0 && number < 10);
        this.digit = number;
        this.translation = translation;
    }

    public Integer getNumber() {
        return digit;
    }

    public String getTranslation() {
        return translation;
    }
}
