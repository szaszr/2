package org.ucode.homework5;

/*
Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the
 subtraction of others.
Sample Output:
Input the first number : 15
Input the second number: 20
Input the third number : 25
false
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex21.txt"));

            String input1 = s.next();
            String input2 = s.next();
            String input3 = s.next();
            System.out.println(input1+" "+input2+" "+input3);
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int num3 = Integer.parseInt(input3);
            if (num1>=20 || num2>=20 || num1>=20) {
                if ((num1 - num2) >= 20 || (num2 - num3) >= 20 || (num3 - num1) >= 20) {
                    System.out.println("true");
                } else
                    System.out.println("false");
            } else
                System.out.println("false");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
