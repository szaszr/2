package org.ucode.javapractice.forLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/counting-machine.html
 */

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int num = input.nextInt();

        for (int n=0; n<=num; n=n+1) {
            System.out.print(n+" ");
        }
    }
}
