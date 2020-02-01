package org.ucode.fifthlesson;

/*
Write a Java program to insert a word in the middle of the another string (of two words separated by space).
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:
Python Tutorial 3.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex28.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                String[] split = input.split(" ");
                System.out.println(split[split.length-2]+ " Tutorial " +split[split.length-1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
