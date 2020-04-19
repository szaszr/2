package org.ucode.homework5;

/*
 Write a Java program to find the longest word in a text file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise39 {
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex39.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                String[] split = input.split(" ");
                String longestString = getLongestString(split);
                for (int i=0; i<split.length; i++){
                }
                System.out.println("Longest string is: " +longestString);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}