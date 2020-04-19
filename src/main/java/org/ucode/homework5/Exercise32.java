package org.ucode.homework5;

/*
Write a Java program to rotate an array (length 3) of integers in left direction.
Sample Output:
Original Array: [20, 30, 40]
Rotated Array: [30, 40, 20]
 */

import java.io.*;
import java.util.Arrays;

public class Exercise32 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("e://ex32.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            String str = new String(data, "UTF-8");

            String[] numbersarray = str.split("\r\n");
            System.out.println("Original array: "+Arrays.toString(numbersarray));
            String [] rotated ={ numbersarray[1],numbersarray[2],numbersarray[0]};
            System.out.println("Rotated array: "+Arrays.toString(rotated));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
