package com.github.nhuray.javatests.triton;

import org.junit.Assume;

public class TeenTranslation {

    private Integer teen;
    private String translation;

    public TeenTranslation(Integer number, String translation) {
        Assume.assumeTrue(number > 9 && number < 20);
        this.teen = number;
        this.translation = translation;
    }

    public Integer getNumber() {
        return teen;
    }

    public String getTranslation() {
        return translation;
    }
}
