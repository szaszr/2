package org.ucode.javapractice.arrays;

/*
http://www.programmingbydoing.com/a/basic-arrays-3.html
 */

import java.util.Random;

public class BasicArrays3 {
    public static void main(String[] args) {
        int [] numbers = new int[1000];

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (10+r.nextInt(90));
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+"\t");
            if(i%25==0){
                System.out.println();
            }
        }
    }
}
