package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/basic-arraylists-1.html
 */

import java.util.ArrayList;

public class BasicArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i,-113);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Slot "+ i +" contains a "+list.get(i));
        }
    }
}
