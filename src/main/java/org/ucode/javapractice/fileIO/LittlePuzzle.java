package org.ucode.javapractice.fileIO;

import java.io.*;
import java.util.Scanner;

public class LittlePuzzle {
    public static void main(String[] args) {

        System.out.print("Which file would you like to open: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        readEveryThirdLetter(input);

    }
    public static void readEveryThirdLetter (String fileName){
        File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\"+fileName);
        try {
            Scanner sc = new Scanner(file);
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                if ((1+i)%3==0){
                    System.out.print(input.charAt(i));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
