package org.ucode.lesson13;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>();
//        myList.add(12);
//        myList.add(13);
//
//        for (Integer theInt : myList) {
//            System.out.println(theInt);
//        }

        List<String> words = new ArrayList<>();
        words.add("dog");
        words.add("cat");
        words.add("dog");

//        for (String word : words) {
//            System.out.println(word);
//        }

        //search the word dog in list

        String mySearchString = "dog";

        for (String word : words) {
            if (mySearchString.equals(word)){
                System.out.println("Am gasit cuvantul dog");
            }
        }

        //Set
        SortedSet<String> myStringSet = new TreeSet<>();
        myStringSet.add("dog");
        myStringSet.add("cat");
        myStringSet.add("cat");
        myStringSet.add("lion");
        myStringSet.add("wolf");
        myStringSet.add("camel");
        myStringSet.add("camela");

        for (String s : myStringSet) {
            System.out.println("Element in set is " + s);
        }

        SortedSet<String> wordsSet = new TreeSet<>(words);

        for (String s : wordsSet) {
            System.out.println("Element in sorted set is " + s);
        }






//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
    }
}
