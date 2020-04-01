package org.ucode.javapractice.randomNumbers;

import java.util.*;

/*
http://www.programmingbydoing.com/a/one-shot-hi-lo.html
 */

public class OneShotHiLo {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int secret = (1+r.nextInt(100));
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = input.nextInt();

        if (guess>secret) {
            System.out.println("Sorry, you are too high.  I was thinking of "+secret);
        }
        else if (guess<secret){
            System.out.println("Sorry, you are too low.  I was thinking of "+secret);
        }
        else if (guess==secret) {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
