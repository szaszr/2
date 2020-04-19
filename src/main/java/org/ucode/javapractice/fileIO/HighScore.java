package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/high-score.html
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\score.txt");
            Scanner sc = new Scanner(System.in);

            System.out.println("You got a high score!");
            System.out.println();
            System.out.print("Please enter your score: ");
            int score = sc.nextInt();
            System.out.print("Please enter your name: ");
            String name = sc.next();
            System.out.println();
            System.out.println("Data stored into score.txt");

            out.print(score);
            out.print(name);

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
