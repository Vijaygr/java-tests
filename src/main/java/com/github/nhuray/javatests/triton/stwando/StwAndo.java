package com.github.nhuray.javatests.triton.stwando;

import com.google.common.base.Joiner;

import static java.lang.Integer.toString;

/**
 * StwAndo
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Stw”
 * instead of the number and for the multiples of five print “Ando”.
 * For numbers which are multiples of both three and five print “StwAndo”.
 */
public class StwAndo {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String replace = "";
            if (i % 3 == 0) replace = "Stw";
            if (i % 5 == 0) replace += "Ando";
            System.out.println(replace.length() == 0 ? i : replace);
        }
    }
}
