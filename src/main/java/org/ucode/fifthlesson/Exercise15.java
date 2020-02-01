package org.ucode.fifthlesson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Write a Java program to print the ascii value of a given character.
Expected Output
The ASCII value of Z is :90
 */


public class Exercise15 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex15.txt");
            Scanner myReader = new Scanner(myObj);
            String data = myReader.next();
            char chr = data.charAt(0);
            int ascii = chr;
            System.out.println(data);
            System.out.println("The ASCII value of"+data+" is "+ ascii);
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
