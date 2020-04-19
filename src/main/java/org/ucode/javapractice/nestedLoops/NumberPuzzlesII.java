package org.ucode.javapractice.nestedLoops;

/*
http://www.programmingbydoing.com/a/more-number-puzzles.html
 */

import java.util.Scanner;

public class NumberPuzzlesII {
    public static void main(String[] args) {
        System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
        System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
        System.out.println("3) Quit");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        do {

            if (input.equals("1")){
                function1();
            }
            else if (input.equals("2")){
                function2();
                }
            }
        while (!input.equals("3"));
    }

    //Find two digit numbers <= 56 with sums of digits > 10
    public static void menu (){
        System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
        System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
        System.out.println("3) Quit");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
    }

    public static void function1(){
        System.out.println("The numbers are: ");
        System.out.println();
        for (int ten = 1; ten <=5 ; ten++) {
            for (int one = 0; one <10 ; one++) {
                if ((ten+one)>10 && ((ten*10)+one)<=56){
                    System.out.println(ten + "" + one + "\t");
                }
            }
        }
        System.out.println();
        menu();
    }

    //Find two digit number minus number reversed which equals sum of digits
    public static void function2(){
        System.out.println("The number is: ");
        System.out.println();
        for (int ten = 1; ten <10 ; ten++) {
            for (int one = 0; one <10 ; one++) {
                if (((ten*10)+one)-((one*10)+(ten))==(ten+one)){
                    System.out.println((ten*10)+one);
                }
            }
        }
        System.out.println();
        menu();
    }
}
