package org.ucode.catCoder;

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[]) {
        int a =6;
        System.out.println(fib(a));
        int b =19;
        System.out.println(fib(b));
        int c =28;
        System.out.println(fib(c));
        int d =36;
        System.out.println(fib(d));
        int e =38;
        System.out.println(fib(e));
    }
}
