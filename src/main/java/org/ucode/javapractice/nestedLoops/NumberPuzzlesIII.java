package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/number-puzzles-iii.html
 */

public class NumberPuzzlesIII {
    public static void main(String[] args) {
        for (int a = 1; a <9 ; a++) {
            for (int b = 0; b <10 ; b++) {
                for (int c = 0; c < 10 ; c++) {
                        int abc = a*100+b*10+c;
                        int aCube = a*a*a;
                        int bCube = b*b*b;
                        int cCube = c*c*c;
                        if(abc==(aCube+bCube+cCube)){
                            System.out.println(abc);
                    }
                }
            }
        }
        System.out.println();
    }
}
