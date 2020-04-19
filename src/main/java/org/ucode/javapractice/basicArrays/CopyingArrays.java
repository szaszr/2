package org.ucode.javapractice.basicArrays;

/*
http://www.programmingbydoing.com/a/copying-arrays.html
 */

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (1+r.nextInt(100));
        }

        int [] numbers2 = numbers.clone();

        numbers[9] = -7;

        System.out.print("Array 1:");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+"  ");
        }

        System.out.println();
        System.out.print("Array 2:");
        for (int i = 0; i < numbers2.length ; i++) {
            System.out.print(numbers2[i]+"  ");
        }


    }
}
