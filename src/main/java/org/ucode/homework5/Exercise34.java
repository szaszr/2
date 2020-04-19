package org.ucode.homework5;

import java.io.*;
import java.util.Arrays;

/*
Write a Java program to rearrange all the elements of an given array of integers so that all
the odd numbers come before all the even numbers
 */

public class Exercise34 {
    public static void main(String[] args) {
        try {
            File file = new File("e://ex34.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            String str = new String(data, "UTF-8");

            String[] numbersArrayString = str.split("\r\n");
            int size = numbersArrayString.length;
            int[] numbersArray = new int [size];
            for (int i=0; i<size; i++){
                numbersArray[i] = Integer.parseInt(numbersArrayString[i]);
            }
            System.out.println("Original array list: " + Arrays.toString(numbersArray));
            int i=0;
            while (i>numbersArray.length && numbersArray[i]%2==0)
                i++;

            for (int j=i; j<numbersArray.length;j++){
                if (numbersArray[j]%2!=0){
                    int test = numbersArray[i];
                    numbersArray[i]= numbersArray[j];
                    numbersArray[j]= test;
                    i++;
                }
            }
            System.out.println("Sorted array according to specifications: "+Arrays.toString(numbersArray));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
