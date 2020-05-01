package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/sorting-an-arraylist.html
 */

import java.util.ArrayList;
import java.util.Random;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(i,r.nextInt(100));
        }

        System.out.println("ArrayList before: "+list);

        //Simple version
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i)<list.get(j)){
                    temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i, temp);
                }
            }
        }

        //Shorter version
        //Collections.sort(list);

        System.out.println("ArrayList after: "+list);
    }
}
