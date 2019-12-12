package org.ucode.fifthlesson;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner s = new Scanner(new File("e://ex5.txt"));

            String input1 = s.next();
            String input2 = s.next();
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

                System.out.println("Area of a rectangle is: " + num1 +"*"+ num2 + " = "+ num1*num2);
                System.out.println("Perimeter of a rectangle is: 2*(" + num1 + "+" + num2 + ") = "+ 2*(num1+num2));

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
