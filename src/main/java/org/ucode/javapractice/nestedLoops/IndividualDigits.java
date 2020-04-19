package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/getting-individual-digits.html
 */

public class IndividualDigits {
    public static void main(String[] args) {
        for (int i = 10; i <100 ; i++) {
            System.out.print(i+", ");

            for (int j = 0; j <1; j++) {
                int i1=i/10;
                int i2=i%10;
                int sum = i1+i2;
                System.out.print(i1 + "+" + i2 + "=" + sum);
                System.out.println();
            }
        }
    }
}
