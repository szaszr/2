package org.ucode.fifthlesson;

/*
Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex9.txt"));
            String input = s.next();
            int dec = Integer.parseInt(input, 2);
            System.out.println("Binary number is:"+input);
            System.out.println("Decimal number is:" +dec);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}