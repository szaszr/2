package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/number-puzzle-i.html
 */

public class NumberPuzzlesI {
    public static void main(String[] args) {
        for ( int a=10; a <= 99; a++ )
        {
            for ( int b=10; b <= 99; b++ ) {
                if (a+b==60){
                    System.out.println(a + "+" + b + " sum is 60");
                }
            }
        }
        for (int c = 10; c < 99 ; c++) {
            for (int d = 10; d < 99; d++) {
                if (c-d==14){
                    System.out.println(c + "-" + d + " difference is 14");
                }
            }
        }

    }
}
