package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/a-refresher.html

http://www.programmingbydoing.com/a/refresher2.html
 */

import java.util.Scanner;

public class RefresherChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String input = sc.next();
        print(input);
    }
    public static void print (String a){
        int b = 11;
        for (int i = 1; i < b; i++) {
            System.out.println(a);
            if(a.equals("Mitchell"))
                b=6;
        }
    }
}
