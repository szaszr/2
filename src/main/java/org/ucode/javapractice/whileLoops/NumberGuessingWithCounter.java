package org.ucode.javapractice.whileLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/number-guessing-with-a-counter.html
 */

public class NumberGuessingWithCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int secret = 1 + r.nextInt(10);
        System.out.println("New and Improved version of the number guessing game!");
        System.out.println();
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("Your guess: ");
        int guess = input.nextInt();
        int tries = 0;

        while (guess!=secret){
            System.out.println("Sorry, that is incorrect. Guess again");
            guess=input.nextInt();
            tries++;
        }
        System.out.println("That's right!  You are a good guesser.");
        System.out.println("It only took you "+tries+" tries.");

    }
}
