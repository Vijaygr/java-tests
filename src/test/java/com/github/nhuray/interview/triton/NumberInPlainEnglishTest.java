package com.github.nhuray.interview.triton;

import junit.framework.Assert;
import org.junit.Test;

public class NumberInPlainEnglishTest {

    @Test
    public void justOne() throws Exception {
        // Given a number
        int number = 1;

        // When we call the method plainEnglish
        String result = NumberUtils.plainEnglish(number);

        // Then the digit is written in plain english
        Assert.assertEquals("one", result);
    }
}
