package org.ucode.javapractice.whileLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/hi-lo-with-limited-tries.html
 */

public class HiLoLimitedTries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        System.out.println("First guess: ");
        int tries = 1;
        int maxTries = 8;
        int secret = (1+r.nextInt(100));
        int guess = input.nextInt();
        while (guess!=secret && tries<maxTries){
            if (guess>secret){
                System.out.println("Sorry you are too high.");
                System.out.println("Guess "+tries);
                guess = input.nextInt();
            }
            else if (guess<secret){
                System.out.println("Sorry you are too low.");
                System.out.println("Guess "+tries);
                guess = input.nextInt();
            }
            tries++;
        }
        if (tries==maxTries){
            System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
        }
        else if (tries<maxTries){
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
