package org.ucode.thirdlesson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Create a class called OddOrEven.
Create a main method and read numbers form the keyboard.
Create another method which returns true or false if a number is odd or even.
From the main method pass each number read from keyboard and print the message "The number is odd" or "The number is even"
 */
public class OddOrEven {
    public static void main (String[] args) throws IOException {
        FileWriter objToWrite = new FileWriter( "e://oddoreven.txt");
        int i;
        System.out.println("Please enter an integer to test for odd or even");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        if (i % 2 ==0)
            System.out.println(i + " - This number is even");
        else
            System.out.println(i + " - This number is odd");
    }

}
