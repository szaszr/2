package org.ucode.javapractice.arraysLists;

/*
http://www.programmingbydoing.com/a/sorting-sentences.html
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingSentences {
    public static void main(String[] args) {

        System.out.println("Sentence: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<String> list = Arrays.asList(input.toLowerCase().split(" "));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
