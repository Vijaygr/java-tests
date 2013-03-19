package com.github.nhuray.javatests.triton.fibonacci;

import com.github.nhuray.javatests.triton.fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void nonRecursiveFibonacci() throws Exception {
        // Given
        int n = 50;

        // When / Then method should prints fibonacci suite
        Fibonacci.nonRecursiveFibonacci(n);
    }

    @Test
    // Try this tests as your own risks :D
    public void recursiveFibonacci() throws Exception {
        // Given
        int n = 50;

        // When / Then method should prints fibonacci suite
        Fibonacci.recursiveFibonacci(n);
    }


}
