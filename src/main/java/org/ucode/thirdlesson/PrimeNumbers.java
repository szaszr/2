package org.ucode.thirdlesson;
import java.util.Scanner;
import java.io.*;
/*
Create a class called PrimeNumbers.
Create a main method and read numbers form the keyboard.
Once a number is read, iterate through all of the numbers from 1 to the given number
and print "Number x is prime" if the number is prime.
Otherwise don't print anything. For example if you read number 10 from the keyboard you should print:
2 is prime
5 is prime
7 is prime
*/

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = 1;
        System.out.print("Enter a number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime");
            }
        }
        File file = new File("e:/primenumbers.txt");

    }



    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}