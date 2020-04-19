package org.ucode.homework5;

/*
Write a Java program to convert a given string into lowercase.
Sample Output:
Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex22.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                String inputLower = input.toLowerCase();
                System.out.println(inputLower);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
