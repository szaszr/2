package org.ucode.thirdlesson;
import java.util.Scanner;
/*
 Create a class called SimilarDigits.
 Read from the keyboard 2 numbers and determine if they have the same first and last digits.
 Print "Number (number 1) and number (number 2) have the same first and last digits" or "Number (number 1)
 and number (number 2) don't have the same first and last digits".
Example:
read -> 123
        1446663
print -> Number 123 and number 1446663 have the same first and last digits

read -> 124
        31
print -> Number 124 and number 31 have the same first and last digits
 */

public class SimilarDigits {
    public static void main(String [] args){
        System.out.println("Please input the first number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Please input the second number: ");
        int num2 = scan.nextInt();
        int firstNum = num1;
        int lastNum = num2;
        while (firstNum>=10) {
            firstNum=firstNum/10;
        }
        lastNum=num2%10;

        if (firstNum==lastNum)
            System.out.println("Number "+ num1 + " number " + num2 + " have the same first and last numbers");
        else
            System.out.println("Number "+ num1 + " number " + num2 + " do not have the same first and last numbers");



    }
}
