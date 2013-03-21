package com.github.nhuray.javatests.ypg;

/**
 * Write a method to check if a word is a Palindrome
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            char a = word.charAt(i);
            char b = word.charAt(length - 1 - i);
            if (a != b) return false;
        }
        return true;
        // Another way to do that is to use a StringBuffer
        // String reversed = new StringBuffer(word).reverse().toString();
        // return word.equals(reversed);
    }
}
