package org.ucode.fifthlesson;

/*
Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        try {
            File myObj = new File("e://ex12.txt");
            Scanner myReader = new Scanner(myObj);

                String data = myReader.nextLine();
                System.out.println(data);
            char[] ch = data.toCharArray();
            int letter = 0;
            int space = 0;
            int num = 0;
            int other = 0;
            for(int i = 0; i < data.length(); i++){
                if(Character.isLetter(ch[i])){
                    letter ++ ;
                }
                else if(Character.isDigit(ch[i])){
                    num ++ ;
                }
                else if(Character.isSpaceChar(ch[i])){
                    space ++ ;
                }
                else{
                    other ++;
                }
            }
            System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
            System.out.println("letter: " + letter);
            System.out.println("space: " + space);
            System.out.println("number: " + num);
            System.out.println("other: " + other);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
