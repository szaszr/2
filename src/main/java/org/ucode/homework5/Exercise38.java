package org.ucode.homework5;

/*
 Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:
Number of  Vowels in the string: 4
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex38.txt"));

            String input1 = s.next();
            System.out.println(input1);
            int vowels = 0;
            for (int i=0; i<input1.length(); i++){
                char character = input1.charAt(i);
                if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u') {
                    vowels++;
                }
            }
            System.out.println("Number of  Vowels in the string: " +vowels);



            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
