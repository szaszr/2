package org.ucode.homework3;
import java.util.Scanner;
/*
Create a class called Palindrome.
Read from the keyboard a number (long) and print "The number is a palindrome"
or the "Number is not a palindrome" based on the following rule:
A number is a palindrome if you can read it the same way backward and forward.
Example:
read-> 12321
print -> 12321 is a palindrome
read-> 123 is not a palindrome
 */

public class Palindrome {
        public static void main(String[] args) {

            int remainder, reverse= 0, temporary;

            System.out.println("Please enter an integer to test if a palindrome or not");
            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();

            temporary = num;

            while( num != 0 )
            {
                remainder= num % 10;
                reverse= reverse * 10 + remainder;
                num=num/10;
            }

        if (temporary==reverse)
            System.out.println(temporary + " is a palindrome");
        else
            System.out.println(temporary + " is not a palindrome");
    }
}
