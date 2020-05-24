package org.ucode.javapractice.projectEuler;

public class EvenFibonacciSum {
    public static void main(String[] args) {


    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
