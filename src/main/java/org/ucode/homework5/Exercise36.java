package org.ucode.homework5;

/*
Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        try {
            double meter = 39.37;
            Scanner s = new Scanner(new File("e://ex21.txt"));
            String input1 = s.next();
            System.out.println(input1);
            int num1 = Integer.parseInt(input1);
            System.out.println("Input value for inch was: "+num1);
            System.out.println(num1 + " inches is " + num1/meter+" meters");

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
