package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/odometer-loops.html
 */

import java.util.Scanner;

public class OdometerLaps {
    public static void main( String[] args ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which base(2-10): ");
        int number = sc.nextInt();

        for ( int thous=0; thous<number; thous++ )

            for ( int hund=0; hund<number; hund++ )

                for ( int tens=0; tens<number; tens++ )

                    for ( int ones=0; ones<number; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }

        System.out.println();
    }
}
