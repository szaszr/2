package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/sorting-an-arraylist-of-strings.html
 */

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("ranch");
        list.add("cola");
        list.add("ribs");
        list.add("drink");
        list.add("slurp");
        list.add("donuts");
        list.add("coffee");
        list.add("podcast");
        list.add("tall");
        list.add("code");
        list.add("pumpkin");
        list.add("exit");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
