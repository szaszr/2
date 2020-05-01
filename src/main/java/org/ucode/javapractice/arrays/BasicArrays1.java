package org.ucode.javapractice.arrays;

/*
http://www.programmingbydoing.com/a/basic-arrays-1.html
 */

public class BasicArrays1 {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = -113;
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Slot "+i+" contains a "+numbers[i]);
        }
    }
}
