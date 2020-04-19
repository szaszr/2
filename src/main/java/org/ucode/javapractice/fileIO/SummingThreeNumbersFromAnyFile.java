package org.ucode.javapractice.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which file would you like to read numbers from: ");
        String input = sc.next();

        sum(input);
    }
    public static void sum (String fileName){
        try {
            File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\" + fileName);
            Scanner sc = new Scanner(file);

            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();

            int sum = one+two+three;

            System.out.println();
            System.out.println("Reading the numbers from file "+file.getName()+" ... done");
            System.out.println();
            System.out.println(one + " + "+ two + " + "+ three + " = " + sum);


            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
