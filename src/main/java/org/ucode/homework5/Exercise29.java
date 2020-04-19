package org.ucode.homework5;

/*
Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex29.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                System.out.println(input);
                if (input.length()%2==0){
                    System.out.println(input.substring(0, input.length()/2));
                } else {
                    System.out.println("Length of the string was odd, please specify a new string");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
