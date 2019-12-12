package org.ucode.fifthlesson;

/*
Write a Java program to find the penultimate (next to last) word of a sentence.
Sample Output:
Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex22.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                String[] split = input.split(" ");
                System.out.println("Penultimate word: "+split[split.length-2]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
