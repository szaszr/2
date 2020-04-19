package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/basic-nested-loops.html
 */

public class BasicNestedLoops {
    public static void main(String[] args) {
        for ( int a=0; a <= 5; a++ )
        {
            for ( int b=0; b <= 5; b++ )
            {
                System.out.print("("+ a + "," + b + ") " );
            }
            // * You will add a line of code here.
            System.out.println();
        }
    }
}
