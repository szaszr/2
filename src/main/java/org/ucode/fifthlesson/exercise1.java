package org.ucode.fifthlesson;

import java.util.*;
import java.io.*;

/*
Write a Java program to print the result of the following operations.
        Input data:
        -5 + 8 * 6
        (55+9) % 9
        20 + -3*5 / 8
        5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13

 */

public class exercise1 {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("e://ex1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();;
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
