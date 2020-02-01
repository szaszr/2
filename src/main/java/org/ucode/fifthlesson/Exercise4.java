package org.ucode.fifthlesson;

/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Exercise4 {
    public static void main(String[] args) {
            try {
                Scanner s = new Scanner(new File("e://ex2.txt"));

                String input = s.next();
                double num = Integer.parseInt(input);
                System.out.println("Perimeter of the circle is:" + 2*num*Math.PI);
                System.out.println("Area of this circle is:" + Math.PI*Math.pow(num,2));

                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
