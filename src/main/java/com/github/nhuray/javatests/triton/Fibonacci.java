package com.github.nhuray.javatests.triton;

import java.math.BigInteger;

import static java.math.BigInteger.valueOf;

/**
 * Fib
 * <ul>
 * <li>Write a non recursive function that prints the returns the 10 first numbers of the Fibonacci sequence.</li>
 * <li>What is (are) the advantage(s) of using a non-recursive function ? </li>
 * </ul>
 *
 * Note: We use BigInteger to prevents reaching upper limits with Integer or Long
 */
public class Fibonacci {

    /**
     * The non recursive Fibonacci method is more efficient and prevents StackOverflow.
     */
    public static void nonRecursiveFibonacci(int n) {
        BigInteger first = valueOf(0);
        BigInteger second = valueOf(1);

        System.out.println("1 => " + first);
        System.out.println("2 => " + second);

        for (int i = 2; i < n; i++) {
            BigInteger newSecond = second.add(first);
            System.out.println(i + 1 + " => " + newSecond);
            first = second;
            second = newSecond;
        }
    }

    /**
     * The recursive Fibonacci method is not efficient for a number of recursion too important (for example 50)
     * and should give OutOfMemoryError because calls are .
     */
    public static void recursiveFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i + 1 + " => " + fibonacci(valueOf(i)));
        }
    }

    /**
     * The recursive Fibonacci method is not efficient for a n of recursion too important (for example 50)
     * and should give OutOfMemoryError.
     */
    private static BigInteger fibonacci(BigInteger n) {
        if (n.intValue() == 0) return valueOf(0);
        if (n.intValue() == 1 || n.intValue() == 2) {
            return valueOf(1);
        }

        return fibonacci(n.subtract(valueOf(1))).add(fibonacci(n.subtract(valueOf(2))));
    }

}
