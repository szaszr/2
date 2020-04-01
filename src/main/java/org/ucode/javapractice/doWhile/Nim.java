package org.ucode.javapractice.doWhile;

import java.util.*;

/*
http://www.programmingbydoing.com/a/nim.html
 */

public class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pile1 = 3;
        int pile2 = 4;
        int pile3 = 5;
        System.out.print("Player 1, enter your name: ");
        String player1 = input.next();

        System.out.print("Player 2, enter your name: ");
        String player2 = input.next();

        System.out.println("A:"+pile1+"\t"+"B:"+pile2+"\t"+"C:"+pile3+"\t");
        int i=0;

        while (pile1>0 || pile2>0 || pile3>0){
            if (i%2==0) {
                System.out.print(player1+", choose a pile: ");
                String choice = input.next();

                while (choice.equals("A") && pile1<=0){
                    System.out.println("Nice try "+player1+". That pile is empty. Choose another one:");
                    choice = input.next();
                }
                while (choice.equals("B") && pile2<=0){
                    System.out.println("Nice try "+player1+". That pile is empty. Choose another one:");
                    choice = input.next();
                }
                while (choice.equals("C") && pile3<=0){
                    System.out.println("Nice try "+player1+". That pile is empty. Choose another one:");
                    choice = input.next();
                }

                System.out.print("How many to remove from pile "+choice+": ");
                int num = input.nextInt();

                if (choice.equals("A")){
                        while (num<=0 || num>pile1) {
                            if (num<=0) {
                                System.out.print("You must choose at least 1. How many?");
                                num = input.nextInt();
                            }
                            else if (num>pile1){
                                System.out.println("Pile "+pile1+" does not have that many. Try again: ");
                                num = input.nextInt();
                            }
                        }
                    pile1=pile1-num;
                }
                else if (choice.equals("B")){
                        while (num<=0 || num>pile2) {
                           if (num<=0) {
                                System.out.print("You must choose at least 1. How many?");
                                num = input.nextInt();
                           }
                           else if(num>pile2){
                                System.out.println("Pile "+pile2+" does not have that many. Try again: ");
                                num = input.nextInt();
                           }
                        }
                    pile2=pile2-num;
                }
                else if (choice.equals("C")){
                        while (num<=0 || num>pile3) {
                            if (num<=0) {
                                System.out.print("You must choose at least 1. How many?");
                                num = input.nextInt();
                            }
                            else if(num>pile3){
                                System.out.println("Pile "+pile3+" does not have that many. Try again: ");
                                num = input.nextInt();
                            }
                        }
                    pile3=pile3-num;
                }
                else {
                    System.out.println("That was not an option. Please try again!");
                }
                i++;
            }
            else if (i%2!=0) {
                System.out.print(player2+", choose a pile: ");
                String choice = input.next();

                while (choice.equals("A") && pile1<=0){
                    System.out.println("Nice try "+player2+". That pile is empty. Choose another one:");
                    choice = input.next();
                }
                while (choice.equals("B") && pile2<=0){
                    System.out.println("Nice try "+player2+". That pile is empty. Choose another one:");
                    choice = input.next();
                }
                while (choice.equals("C") && pile3<=0){
                    System.out.println("Nice try "+player2+". That pile is empty. Choose another one:");
                    choice = input.next();
                }

                System.out.print("How many to remove from pile "+choice+": ");
                int num = input.nextInt();

                if (choice.equals("A")){
                        while (num<=0 || num>pile1) {
                            if (num<=0) {
                                System.out.print("You must choose at least 1. How many?");
                                num = input.nextInt();
                            }
                            else if(num>pile1){
                                System.out.println("Pile "+pile1+" does not have that many. Try again: ");
                                num = input.nextInt();
                            }
                        }
                        pile1=pile1-num;
                }
                else if (choice.equals("B")){
                        while (num<=0 || num>pile2) {
                            if (num<=0) {
                                System.out.print("You must choose at least 1. How many?");
                                num = input.nextInt();
                            }
                            else if(num>pile2){
                                System.out.println("Pile "+pile2+" does not have that many. Try again: ");
                                num = input.nextInt();
                            }
                        }
                    pile2=pile2-num;
                }
                else if (choice.equals("C")){
                    while (num<=0 || num>pile3) {
                        if (num<=0) {
                            System.out.print("You must choose at least 1. How many?");
                            num = input.nextInt();
                        }
                        else if(num>pile3){
                            System.out.println("Pile "+pile3+" does not have that many. Try again: ");
                            num = input.nextInt();
                        }
                    }
                    pile3=pile3-num;
                }
                else {
                    System.out.println("That was not an option. Please try again!");
                }
                i++;
            }
            System.out.println("A:"+pile1+"\t"+"B:"+pile2+"\t"+"C:"+pile3+"\t");

            if(pile1+pile2+pile3==1){
                if (i%2==0){
                    System.out.println(player2+" you must take the last counter, so you lose. "+player1+" wins.");
                    break;
                }
                else if (i%2!=0){
                    System.out.println(player2+" you must take the last counter, so you lose. "+player1+" wins.");
                    break;
                }
            }
        }
        if (pile1<=0 && pile2<=0 && pile3<=0) {
            if (i % 2 == 0) {
                System.out.println(player1 + " , there are no counters left, so you WIN!");
            }
            else if (i % 2 != 0) {
                System.out.println(player2 + " , there are no counters left, so you WIN!");
            }
        }
    }
}
