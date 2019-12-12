package org.ucode.fifthlesson;

/*
 Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex21.txt"));
            String input1 = s.next();
            System.out.println(input1);
            int num1 = Integer.parseInt(input1);
            System.out.println("Input degree in Fahrenheit was: "+num1);
            System.out.println(num1 + " degree Fahrenheit is equal to " + (num1-32)*5/9+" in Celsius");

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
