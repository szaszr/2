package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/basic-arraylists-2.html
 */

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i,r.nextInt(100));
        }

        System.out.println("ArrayList: "+list);
    }
}
