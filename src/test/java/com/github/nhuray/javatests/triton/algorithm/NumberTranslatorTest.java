package com.github.nhuray.javatests.triton.algorithm;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(value = Theories.class)
public class NumberTranslatorTest {

    @DataPoints
    public static DigitTranslation[] digits() {
        return new DigitTranslation[]{
                new DigitTranslation(0, "zero"),
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

    @DataPoints
    public static TensTranslation[] tens() {
        return new TensTranslation[]{
                new TensTranslation(10, "ten"),
                new TensTranslation(20, "twenty"),
                new TensTranslation(30, "thirty"),
                new TensTranslation(40, "forty"),
                new TensTranslation(50, "fifty"),
                new TensTranslation(60, "sixty"),
                new TensTranslation(70, "seventy"),
                new TensTranslation(80, "eighty"),
                new TensTranslation(90, "ninety"),
                new TensTranslation(43, "forty three"),
                new TensTranslation(87, "eighty seven")
        };
    }

    @DataPoints
    public static HundredTranslation[] hundreds() {
        return new HundredTranslation[]{
                new HundredTranslation(100, "one hundred"),
                new HundredTranslation(200, "two hundred"),
                new HundredTranslation(300, "three hundred"),
                new HundredTranslation(400, "four hundred"),
                new HundredTranslation(500, "five hundred"),
                new HundredTranslation(600, "six hundred"),
                new HundredTranslation(700, "seven hundred"),
                new HundredTranslation(800, "eight hundred"),
                new HundredTranslation(900, "nine hundred"),
                new HundredTranslation(437, "four hundred thirty seven"),
                new HundredTranslation(873, "eight hundred seventy three")
        };
    }


    @DataPoints
    public static ThousandTranslation[] thousands() {
        return new ThousandTranslation[]{
                new ThousandTranslation(1000, "one thousand"),
                new ThousandTranslation(22000, "twenty two thousand"),
                new ThousandTranslation(35789, "thirty five thousand, seven hundred eighty nine"),
                new ThousandTranslation(456268, "four hundred fifty six thousand, two hundred sixty eight"),
        };
    }

    @Theory
    public void digits(DigitTranslation digitTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberTranslator.plainEnglish(digitTranslation.getNumber());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(digitTranslation.getTranslation(), result);
    }


    @Theory
    public void teens(TeenTranslation teenTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberTranslator.plainEnglish(teenTranslation.getNumber());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(teenTranslation.getTranslation(), result);
    }

    @Theory
    public void tens(TensTranslation tensTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberTranslator.plainEnglish(tensTranslation.getNumber());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(tensTranslation.getTranslation(), result);
    }


    @Theory
    public void hundreds(HundredTranslation hundredsTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberTranslator.plainEnglish(hundredsTranslation.getNumber());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(hundredsTranslation.getTranslation(), result);
    }


    @Theory
    public void thousands(ThousandTranslation thousandTranslation) throws Exception {
        // When we call the method plainEnglish
        String result = NumberTranslator.plainEnglish(thousandTranslation.getNumber());

        // Then the digit is written in plain english
        System.out.println("result = " + result);
        assertEquals(thousandTranslation.getTranslation(), result);
    }

}
