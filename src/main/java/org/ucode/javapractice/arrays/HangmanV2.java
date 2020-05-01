package org.ucode.javapractice.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanV2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\words.txt");
        Random random = new Random();
        Scanner sc = new Scanner(file);

        String [] words = new String[30];


        for (int i = 0; i < words.length; i++) {
            words[i]=sc.nextLine();
        }

        String wordToGuess = words[1+ random.nextInt(words.length)];

        char [] wordToGuessInArray = new char[wordToGuess.length()];

        for (int i = 0; i < wordToGuess.length() ; i++) {
            wordToGuessInArray[i] = wordToGuess.charAt(i);
        }

        String [] underscores = new String[wordToGuess.length()];
        for (int i = 0; i < wordToGuessInArray.length; i++) {
            underscores[i] = "_";
        }

        System.out.println(wordToGuess);
        System.out.println(Arrays.toString(underscores));

        int turnChecker = 0;

        while (turnChecker < 7) {
            System.out.print("Value to find: ");
            Scanner input = new Scanner(System.in);
            String guess = input.next();
            char guessChar = guess.charAt(0);

            System.out.println();
            for (int i = 0; i < wordToGuessInArray.length; i++) {
                if (guessChar == wordToGuessInArray[i]) {
                    System.out.println(guess + " is in slot " + i);
                    underscores[i] = String.valueOf(guessChar);
                    System.out.println(Arrays.toString(underscores));
                }
                else {
                    turnChecker++;
                }
            }
            for (int i = 0; i < underscores.length; i++) {
                if (underscores[i].contains("_")) {
                    break;
                }
            }

            ArrayList <Character> misses = new ArrayList<>();
            int j = 0;
                if (guessChar != wordToGuessInArray[j]) {
                    misses.add(guessChar);
                    j++;
                }
            System.out.println(misses);
    }
}
}
