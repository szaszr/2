package org.ucode.javapractice.whileLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/pin-lockout.html
 */

public class PinLockout {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxTries = 4;

        System.out.println("WELCOME TO THE BANK OF ROBERT.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = input.nextInt();
        tries++;

        while ( entry != pin && tries < maxTries ) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = input.nextInt();
            tries++;
        }

        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if ( tries >= maxTries )
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}
