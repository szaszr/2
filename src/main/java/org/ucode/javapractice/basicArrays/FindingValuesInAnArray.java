package org.ucode.javapractice.basicArrays;

/*
http://www.programmingbydoing.com/a/finding-a-value-in-an-array.html
 */

import java.util.Random;
import java.util.Scanner;

public class FindingValuesInAnArray {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (1+r.nextInt(50));
        }

        System.out.print("Array:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"  ");
        }

        System.out.println();
        System.out.print("Value to find: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (guess==numbers[i]){
                System.out.println(guess + " is in the array.");
            }
        }


    }
}
