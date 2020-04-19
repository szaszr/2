package org.ucode.homework5;

/*
Write a Java program to find the size of a specified file.
Sample Output:
/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes
 */

import java.io.File;

public class Exercise17 {
    public static void main(String[] args) {
        try {
            File file = new File("e://ex2.txt");
            System.out.println(file.getAbsolutePath() + " : " + file.length()+" bytes");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
