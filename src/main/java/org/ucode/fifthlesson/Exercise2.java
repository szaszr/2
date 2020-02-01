package org.ucode.fifthlesson;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
         Input a number: 8
         Expected Output :
         8 x 1 = 8
         8 x 2 = 16
         8 x 3 = 24
         ...
         8 x 10 = 80

 */

public class Exercise2 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex2.txt"));

            String input = s.next();
            int num = Integer.parseInt(input);

            for (int i=0; i<11; i++){
                System.out.println(num + " * " + i+ " = "+ num*i);
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
