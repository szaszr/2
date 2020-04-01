package org.ucode.javapractice.whileLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/counting-while.html
 */

public class CountingWhile {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it several times." );
        System.out.print( "Message: " );
        String message = input.nextLine();
        System.out.println("How many times?");
        int times = input.nextInt();

        int n = 0;
        while ( n < times ) {
            System.out.println( (n+1)+"0" + ". " + message );
            n++;
        }
    }
}
