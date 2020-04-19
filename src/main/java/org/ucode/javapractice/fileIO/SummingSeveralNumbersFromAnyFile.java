package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/summing-several-numbers-from-any-file.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile {
    public static void main(String[] args) {
        int totalFinal=0;

        System.out.print("Which file would you like to read numbers from: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while (true){
            totalFinal = sum(input)+totalFinal;
            System.out.println();
            System.out.println(totalFinal);
            System.out.println();
            System.out.print("Which file would you like to read numbers from: ");
            input = sc.next();
        }
    }

    public static int sum (String fileName){
        int total = 0;
        try {
            File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\" + fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                int number = Integer.parseInt(sc.next());
                total = number+total;
            }
            sc.close();
        }
        catch (FileNotFoundException | NoSuchElementException e) {
            e.printStackTrace();
        }
        return total;
    }
}

