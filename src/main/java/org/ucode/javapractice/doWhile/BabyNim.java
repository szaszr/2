package org.ucode.javapractice.doWhile;

import java.util.*;

/*
http://www.programmingbydoing.com/a/baby-nim.html
 */

public class BabyNim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;
        System.out.println("A:"+pile1+"\t"+"B:"+pile2+"\t"+"C:"+pile3+"\t");

        while (pile1>0 || pile2>0 || pile3>0){
            System.out.print("Choose a pile: ");
            String choice = input.next();
            System.out.print("How many to remove from pile "+choice+": ");
            int num = input.nextInt();
            if (choice.equals("A")){
                pile1=pile1-num;
            }
            else if (choice.equals("B")){
                pile2=pile2-num;
            }
            else if (choice.equals("C")){
                pile3=pile3-num;
            }
            else {
                System.out.println("That was not an option. Please try again!");
            }
            System.out.println("A:"+pile1+"\t"+"B:"+pile2+"\t"+"C:"+pile3+"\t");
        }
        System.out.println("All piles are empty. Good job!");
    }
}
