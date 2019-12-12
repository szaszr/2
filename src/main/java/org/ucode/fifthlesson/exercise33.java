package org.ucode.fifthlesson;

/*
Write a Java program to compute body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex33.txt"));
            String input1 = s.next();
            String input2 = s.next();
            System.out.println(input1);
            System.out.println(input2);
            int weight = Integer.parseInt(input1);
            int height = Integer.parseInt(input2);
            System.out.println("Input weight was "+weight+" pounds with a height of "+height +" inches");
            System.out.println("Body Mass index is "+703*weight/Math.pow(height, 2));

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
