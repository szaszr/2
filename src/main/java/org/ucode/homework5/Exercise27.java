package org.ucode.homework5;

/*
Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Output:
Input the first number : 35
Input the second number: 45
Result: true
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex27.txt"));

            String input1 = s.next();
            String input2 = s.next();
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int firstDigNum1 = num1/10;
            int secondDigNum1 = num1%10;
            int firstDigNum2 = num2/10;
            int secondDigNum2 = num2%10;

            if (num1<25 || num2<25 || num1>75 || num2>75){
                System.out.println("Input can be only in the range from 25 till 75");
            } else if (firstDigNum1==firstDigNum2 || firstDigNum1==secondDigNum2 || firstDigNum2==secondDigNum1 || secondDigNum2==secondDigNum1){
                System.out.println("True");
            } else {
                System.out.println("These two "+num1 +" "+ num2 +" numbers have no common digits");
            }

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
