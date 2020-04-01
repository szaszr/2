package org.ucode.javapractice.forLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/adding-values-with-a-for-loop.html
 */

public class AddingValuesWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        System.out.println();
        int total = 0;
        for (int i = 0; i <= num; i += 1) {
            System.out.print(i+" ");
            total = total+i;
        }
        System.out.println();
        System.out.println("The sum is "+total);
    }
}
