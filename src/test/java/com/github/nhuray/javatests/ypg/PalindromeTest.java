package com.github.nhuray.javatests.ypg;

import org.junit.Test;

import static com.github.nhuray.javatests.ypg.Palindrome.isPalindrome;
import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        // Given a word
        assertEquals(true, isPalindrome("nanan"));
        assertEquals(true, isPalindrome("kayak"));
        assertEquals(false, isPalindrome("quebec"));
        assertEquals(false, isPalindrome("others"));
    }
}
