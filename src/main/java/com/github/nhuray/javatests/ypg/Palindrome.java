package com.github.nhuray.javatests.ypg;

/**
 * Write a method to check if a word is a Palindrome
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuffer(word).reverse().toString();
        return word.equals(reversed);
    }
}
