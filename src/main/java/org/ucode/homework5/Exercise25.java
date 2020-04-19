package org.ucode.homework5;

/*
Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex25.txt");
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
