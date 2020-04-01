package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/displaying-some-multiples.html
 */

import java.util.Scanner;

public class DisplayingSomeMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int number = sc.nextInt();
        System.out.println();
        for (int i = 1; i < 13 ; i++) {
            System.out.println(number+"x"+i+" = "+number * i);
        }
    }
}
