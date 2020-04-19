package org.ucode.homework5;

/*
 Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:
Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex22.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                char[] a = input.toCharArray();
                for (int i = 0; i < a.length; i++) {
                    if (i == 0)
                        a[i] = Character.toUpperCase(a[i]);
                    if (a[i] == ' ')
                        a[i+1] = Character.toUpperCase(a[i+1]);
                }
                System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
