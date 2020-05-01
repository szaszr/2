package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/finding-a-value-in-an-arraylist.html
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInAnArrayList {
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

        for (int i = 0; i < list.size(); i++) {
            if (input==list.get(i)){
                System.out.println(input+" is in the ArrayList.");
            }
        }

    }
}
