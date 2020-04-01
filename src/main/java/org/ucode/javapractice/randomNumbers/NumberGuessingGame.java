package org.ucode.javapractice.randomNumbers;

import java.util.*;

/*
http://www.programmingbydoing.com/a/a-number-guessing-game.html
 */

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int secret = 1 + r.nextInt(10);
        System.out.println("New and Improved version of the number guessing game!");
        System.out.println();
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("Your guess: ");
        int guess = input.nextInt();

        if (guess==secret){
            System.out.println("That's right!  My secret number was "+secret);
        }
        else if (guess!=secret){
            System.out.println("Sorry, but I was really thinking of "+secret);
        }
    }
}

