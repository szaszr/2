package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/summing-three-numbers-from-a-file.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\3nums.txt");
            Scanner sc = new Scanner(file);

            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();

            int sum = one+two+three;

            System.out.println("Reading the numbers from file "+file.getName()+" ... done");
            System.out.println();
            System.out.println(one + " + "+ two + " + "+ three + " = " + sum);

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
