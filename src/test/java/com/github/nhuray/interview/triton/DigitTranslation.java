package com.github.nhuray.interview.triton;

import org.junit.Assume;

public class DigitTranslation {

    private Integer digit;
    private String translation;

    public DigitTranslation(Integer digit, String translation) {
        Assume.assumeTrue(digit > 0 && digit < 10);
        this.digit = digit;
        this.translation = translation;
    }

    public Integer getDigit() {
        return digit;
    }

    public String getTranslation() {
        return translation;
    }
}
