package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/nesting-loops.html
 */

public class NestingLoops {
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {
                //iterates from 1 trough 3 and then changes outer loop, then jumps back in
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}
