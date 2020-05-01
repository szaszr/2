package org.ucode.javapractice.arrays;

/*
http://www.programmingbydoing.com/a/grades-in-an-array-and-a-file.html
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GradesInAnArrayAndFile {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.print("Name (first last): ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Filename: ");
        String fileName = sc.nextLine();

        System.out.println();

        PrintWriter out = new PrintWriter("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\"+fileName);

        out.println(name);

        int [] numbers = new int[5];

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (1+r.nextInt(100));
        }

        System.out.println("Here are your randomly-selected grades(hope you pass):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Grade "+i+1+": "+numbers[i]);
            out.println("Grade "+i+1+": "+numbers[i]);
        }

        System.out.println();

        System.out.println("Data saved in \""+fileName+"\".");
        out.close();
    }
}
