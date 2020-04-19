package org.ucode.homework5;

/*
Write a Java program to test if 10 appears as either the first or last element of an array of integers.
The length of the array must be greater than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10
true
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise30 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("e://ex30.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            String str = new String(data, "UTF-8");
            System.out.println(str);
            String[] numbersarray = str.split("\r\n");


            if (numbersarray.length >= 2) {
               if (numbersarray[0].equals("10") || numbersarray[numbersarray.length - 1].equals("10")) {
                  System.out.println("True");
            } else
                  System.out.println("False");
            } else
                  System.out.println("False");



            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
