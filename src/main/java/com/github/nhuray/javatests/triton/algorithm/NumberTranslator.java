package com.github.nhuray.javatests.triton.algorithm;

/**
 * Algorithm
 * <p>
 * Given a number between 0 and 999,999, write a method that writes that number in the english language.
 * For example a call with the number 100282 would return "One hundred thousand, two hundred eighty two"
 * </p>
 */
public class NumberTranslator {

    public static final int LOWER_BOUND = 0;
    public static final int UPPER_BOUND = 999999;

    /**
     * Method translating number in plain english.
     *
     * @param number the number to translate in plain english
     * @return the number translated
     */
    public static String plainEnglish(int number) {
        // Number is out of range
        if (number < LOWER_BOUND || number > UPPER_BOUND)
            throw new IllegalArgumentException("Number should be greater than zero and lower than one million.");

        // Processing digits (0 to 9)
        String digits = digit(number);
        if (digits != null) return digits;

        // Processing teens (11 to 19)
        String teen = teen(number);
        if (teen != null) return teen;

        // Processing tens (10 to 99)
        String tens = tens(number);
        if (tens != null) return tens;

        // Processing hundred (100 to 999)
        String hundreds = hundred(number);
        if (hundreds != null) return hundreds;

        // Processing thousand (1000 to 999999)
        String thousands = thousand(number);
        return thousands;
    }


    /**
     * Return the number in plain english if number is a digit
     *
     * @param number the number to translate
     * @return the digit in plain english or null
     */
    private static String digit(int number) {
        // Numbers between 0 to 9
        if (number >= 0 && number < 10) {
            // Digits array
            String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            return digits[(number % 10)];
        }
        return null;
    }

    /**
     * Return the number in plain english if number is a teen
     *
     * @param number the number to translate
     * @return the number in plain english or null
     */
    private static String teen(int number) {
        // Numbers between 11 to 19
        if (number >= 11 && number < 20) {
            // Teens array
            String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            return teens[(number % 10) - 1];
        }
        return null;
    }

    /**
     * Return the number in plain english if number is a tens
     *
     * @param number the number to translate
     * @return the number in plain english or null
     */
    private static String tens(int number) {
        // Numbers is 10 or between 20 to 99
        if (number == 10 || number >= 20 && number < 100) {
            // Tens array
            String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String ten = tens[(number / 10) - 1];
            // Processing digits
            int rest = number % 10;
            if (rest > 0) {
                return ten + " " + digit(rest);
            } else {
                return ten;
            }
        }
        return null;
    }

    /**
     * Return the number in plain english if number is an hundred
     *
     * @param number the number to translate
     * @return the number in plain english or null
     */
    private static String hundred(int number) {
        // Numbers between 100 to 999
        if (number >= 100 && number < 1000) {
            // Get digit
            int digit = number / 100;
            String tens = tens(number - (digit * 100));
            return digit(digit) + " hundred" + (tens != null ? " " + tens : "");
        }
        return null;
    }

    /**
     * Return the number in plain english if number is a thousand
     *
     * @param number the number to translate
     * @return the number in plain english or null
     */
    private static String thousand(int number) {
        // Numbers between 100 to 999999
        if (number >= 1000 && number < 1000000) {
            // Get digit
            int result = number / 1000;
            String hundreds = hundred(number - (result * 1000));

            // Between 1000 to 9999
            String digit = digit(result);
            if (digit != null) {
                return digit + " thousand" + (hundreds != null ? ", " + hundreds : "");
            }

            // Between 10000 to 99999
            String tens = tens(result);
            if (tens != null) {
                return tens + " thousand" + (hundreds != null ? ", " + hundreds : "");
            }

            // Between 100000 to 999999
            String hundred = hundred(result);
            if (hundred != null) {
                return hundred + " thousand" + (hundreds != null ? ", " + hundreds : "");
            }
        }
        return null;
    }
}
