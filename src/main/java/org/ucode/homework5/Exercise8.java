package org.ucode.homework5;

/*
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex2.txt"));

            String input = s.next();
            int num = Integer.parseInt(input);
            System.out.println("decimal input number is: "+num);
            String binary = Integer.toBinaryString(num);
            System.out.println("binary number is: "+binary);


            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
