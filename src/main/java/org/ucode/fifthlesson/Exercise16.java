package org.ucode.fifthlesson;

/*
 Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:
Input number: 5
5 + 55  + 555
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex2.txt"));

            String input = s.next();
            int num1 = Integer.parseInt(input);
            int num2 = Integer.parseInt(input+input);
            int num3 = Integer.parseInt(input+input+input);

            System.out.println("input number was: " +num1);
            System.out.println(num1+" + "+num2+" + "+num3);
            System.out.println(num1+num2+num3);

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
