package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/simple-file-input.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileInput {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\SimpleFileInput.txt");
            Scanner sc = new Scanner(file);

            String first = sc.next();
            String last = sc.next();

            System.out.println("Using my psychic powers (aided by reading data from the file),\n" +
                    "I have determined that your name is "+first+" "+last+".");

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
