package org.ucode.javapractice.forLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/counting-machine-revisited.html
 */

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int first = input.nextInt();
        System.out.print("Count to: ");
        int last = input.nextInt();
        System.out.print("Count by: ");
        int by = input.nextInt();

        for (int i=1; first<=last;first=first+by){
            System.out.println(first);
        }
    }
}
