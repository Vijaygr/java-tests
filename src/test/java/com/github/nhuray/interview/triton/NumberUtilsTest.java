package com.github.nhuray.interview.triton;

import junit.framework.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;


@RunWith(value = Theories.class)
public class NumberUtilsTest {

    @DataPoints
    public static DigitTranslation[] digits() {
        return new DigitTranslation[]{
                new DigitTranslation(1, "one"),
                new DigitTranslation(2, "two"),
                new DigitTranslation(3, "three"),
                new DigitTranslation(4, "four"),
                new DigitTranslation(5, "five"),
                new DigitTranslation(6, "six"),
                new DigitTranslation(7, "seven"),
                new DigitTranslation(8, "eight"),
                new DigitTranslation(9, "nine")
        };
    }

    @DataPoints
    public static TeenTranslation[] teens() {
        return new TeenTranslation[]{
                new TeenTranslation(11, "eleven"),
                new TeenTranslation(12, "twelve"),
                new TeenTranslation(13, "thirteen"),
                new TeenTranslation(14, "fourteen"),
                new TeenTranslation(15, "fifteen"),
                new TeenTranslation(16, "sixteen"),
                new TeenTranslation(17, "seventeen"),
                new TeenTranslation(18, "eighteen"),
                new TeenTranslation(19, "nineteen")
        };
    }

    @Theory
    public void digits(DigitTranslation digitTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberUtils.plainEnglish(digitTranslation.getDigit());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(digitTranslation.getTranslation(), result);
    }


    @Theory
    public void teens(TeenTranslation teenTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberUtils.plainEnglish(teenTranslation.getTeen());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(teenTranslation.getTranslation(), result);
    }


}
