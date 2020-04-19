package org.ucode.homework5;

/*
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
 */

import java.io.*;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex12.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                StringBuilder sb = new StringBuilder(data);
                System.out.println(sb.reverse().toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}