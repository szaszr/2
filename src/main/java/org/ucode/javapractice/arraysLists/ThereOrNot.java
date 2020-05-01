package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/arraylist-there-or-not.html
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ThereOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i,r.nextInt(50));
        }

        System.out.println("ArrayList: "+list);

        System.out.println("Value to find: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int times=0;

        for (int i = 0; i < list.size(); i++) {
            if (input==list.get(i)){
                System.out.println(input+" is in the Arraylist.");
                times++;
            }
        }

        if (times==0){
            System.out.println(input+" is not in the Arraylist.");
        }

    }
}
