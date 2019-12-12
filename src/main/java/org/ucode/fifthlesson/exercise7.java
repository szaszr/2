package org.ucode.fifthlesson;

/*
 Write a Java program to swap two integer variables.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex5.txt"));

            String input1 = s.next();
            String input2 = s.next();
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int num3;

            System.out.println("number 1 is:"+num1);
            System.out.println("number 2 is:"+num2);
            System.out.println("Swapping");
            num3=num1;
            num1=num2;
            num2=num3;
            System.out.println("number 1 is:"+num1);
            System.out.println("number 2 is:"+num2);

            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
