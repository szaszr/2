package org.ucode.javapractice.arrays;

/*
http://www.programmingbydoing.com/a/finding-the-largest-value-in-an-array.html
 */

import java.util.Random;

public class FindingTheLargestValueInAnArray {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Random r = new Random();

        System.out.print("Array:  ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (1+r.nextInt(100));
            System.out.print(numbers[i]+"  ");
        }

        int largest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }

        System.out.println();
        System.out.println("The largest value is " + largest);
    }
}
