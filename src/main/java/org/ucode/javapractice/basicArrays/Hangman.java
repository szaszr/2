package org.ucode.javapractice.basicArrays;

/*
http://www.programmingbydoing.com/a/hangman.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws FileNotFoundException {
        int turn =0;

        File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\words.txt");
        Random random = new Random();
        Scanner sc = new Scanner(file);

        String [] words = new String[30];
        for (int i = 0; i < words.length; i++) {
            words[i]=sc.nextLine();
        }

        String wordToGuess = words[1+ random.nextInt(words.length)];

        String underscores = new String(new char[wordToGuess.length()]).replace("\0", "_");


        while (turn<7 && underscores.contains("_")){
            System.out.println(underscores);
            System.out.println("Guess: ");
            Scanner input = new Scanner(System.in);

            String guess = input.next();

            String newUnderscore = "";
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess.charAt(0)){
                    newUnderscore += guess.charAt(0);
                }
                else if (underscores.charAt(i)!='_'){
                    newUnderscore += wordToGuess.charAt(i);
                }
                else {
                    newUnderscore += "_";
                }
            }
            if (underscores.equals(newUnderscore)){
                turn++;
            }
            else
                underscores = newUnderscore;

            if (underscores.equals(wordToGuess)){
                System.out.println("You have won!");
            }
            if (turn==7)
                System.out.println("You have lost!");
        }
    }
}
