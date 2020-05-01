package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/copying-arraylists.html
 */

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i,r.nextInt(100));
        }

        for (int i = 0; i < list.size(); i++) {
            list2.add(i, list.get(i));
        }

        list.set(9, -7);

        System.out.println("ArrayList 1: "+list);
        System.out.println("ArrayList 2: "+list2);
    }
}
