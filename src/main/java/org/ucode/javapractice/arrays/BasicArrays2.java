package org.ucode.javapractice.arrays;

/*
http://www.programmingbydoing.com/a/basic-arrays-2.html
 */

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (1+random.nextInt(100));
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Slot "+i+" contains a "+numbers[i]);
        }
    }
}
