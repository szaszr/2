package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/finding-prime-numbers.html
 */

public class FindingPrimeNumbers {
    public static boolean isPrime( int n ) {

        boolean temp = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp = false;
            }
        }
            return temp;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 101 ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
            
        }
    }
}
