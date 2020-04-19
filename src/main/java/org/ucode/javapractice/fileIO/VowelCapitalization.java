package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/vowel-capitalization.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VowelCapitalization {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Open which file: ");
        Scanner sc = new Scanner(System.in);
        String open = sc.next();

        File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\"+open);
        Scanner read = new Scanner(file);

        String input = "";

        while (read.hasNextLine()){
            input = input.concat("\n"+read.nextLine());
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u'){
                System.out.print(Character.toUpperCase(ch));
            }
            else
                System.out.print(ch);
        }
    }
}
