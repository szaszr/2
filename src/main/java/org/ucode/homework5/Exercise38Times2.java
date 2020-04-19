package org.ucode.homework5;

/*
Write a Java program to check if a file or directory specified by pathname exists or not.
 */

import java.io.File;

public class Exercise38Times2 {
    public static void main(String[] args) {
        try {
            File f = new File("e://ex38v2.txt");
            if (f.exists() && !f.isDirectory()) {
                System.out.println("File exists");
            } else
                System.out.println("File does not exist");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
