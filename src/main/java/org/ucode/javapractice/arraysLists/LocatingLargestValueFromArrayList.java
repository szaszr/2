package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/locating-the-largest-value-in-an-arraylist.html
 */

import java.util.ArrayList;
import java.util.Random;

public class LocatingLargestValueFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10 ; i++) {
            list.add(i,r.nextInt(100));
        }

        System.out.println("ArrayList: "+list);

        int largest=0;

        for (int i = 0; i < list.size() ; i++) {
            if (largest<list.get(i)){
                largest=list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (largest==list.get(i)){
                System.out.println("The largest value is "+largest+", which is in slot "+i);
            }
        }
    }
}
