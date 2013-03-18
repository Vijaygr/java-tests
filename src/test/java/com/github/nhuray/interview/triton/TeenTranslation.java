package com.github.nhuray.interview.triton;

import org.junit.Assume;

public class TeenTranslation {

    private Integer teen;
    private String translation;

    public TeenTranslation(Integer teen, String translation) {
        Assume.assumeTrue(teen > 9 && teen < 20);
        this.teen = teen;
        this.translation = translation;
    }

    public Integer getTeen() {
        return teen;
    }

    public String getTranslation() {
        return translation;
    }
}
