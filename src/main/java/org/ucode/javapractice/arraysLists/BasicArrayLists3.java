package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/basic-arraylists-3.html
 */

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 1000; i++) {
            list.add(i,r.nextInt(100));
        }

        System.out.println(list);
    }
}
