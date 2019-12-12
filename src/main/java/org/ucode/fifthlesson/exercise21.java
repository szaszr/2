package org.ucode.fifthlesson;

/*
Write a Java program that accepts three integers from the user and return true if two or more of them (integers )
 have the same rightmost digit. The integers are non-negative.
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex21.txt"));

            String input1 = s.next();
            String input2 = s.next();
            String input3 = s.next();
            System.out.println(input1+" "+input2+" "+input3);
            int num1 = input1.charAt(input1.length()-1);
            int num2 = input2.charAt(input2.length()-1);
            int num3 = input3.charAt(input3.length()-1);
            if (num1==num2 || num2==num3 || num1==num3) {
                System.out.println("true");
            }
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
