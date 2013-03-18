package com.github.nhuray.interview.triton;

import org.junit.Assume;

public class TensTranslation {

    private Integer tens;
    private String translation;

    public TensTranslation(Integer number, String translation) {
        Assume.assumeTrue(number == 10 || number >= 20 && number < 100);
        this.tens = number;
        this.translation = translation;
    }

    public Integer getNumber() {
        return tens;
    }

    public String getTranslation() {
        return translation;
    }
}
