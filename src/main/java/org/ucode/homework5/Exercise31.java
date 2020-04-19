package org.ucode.homework5;

/*
Write a Java program to create a new array of length 2 from two arrays of integers with three elements and
the new array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:
Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Exercise31 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("e://ex31.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            String str = new String(data, "UTF-8");

            String[] numbersarray = str.split("\r\n");
            int n = numbersarray.length;
            int [] array1 = new int[(n+1)/2];
            int [] array2 = new int[n-array1.length];

            for (int i=0; i<n;i++){
                if (i<array1.length){
                    array1[i]= Integer.parseInt(numbersarray[i]);
                } else
                    array2[i-array1.length] = Integer.parseInt(numbersarray[i]);
            }
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            int [] newarray = {array1[0],array2[2]};
            System.out.println("New array: "+Arrays.toString(newarray));
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
