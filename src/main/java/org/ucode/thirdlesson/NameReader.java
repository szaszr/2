package org.ucode.thirdlesson;
import java.util.Scanner;

/*
Create a class called NameReader.
Create a main method and read strings from the keyboard.
For every read string print the length of the string and the number of appearances of each letter.
Keep reading in a loop from the keyboard until you read the word "STOP" the the execution should end.
Example:
read ->"Boy"
print ->3 letters
        B - 1
        o - 1
        y - 1

read -> "calling"
print -> 7 letters
         c - 1
         a - 1
         l - 2
         i - 1
         n - 1
         g - 1

        - STOP magic word not implemented -
 */
public class NameReader {
    public static void main(String[] args) {

            System.out.println("Please input a string of characters");
            Scanner scan = new Scanner(System.in);
            String inputString = scan.nextLine();
            int countChar = 0;

            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) != ' ')
                    countChar++;
            }

            System.out.println("Total number of characters in the input: " + countChar);

            numberOfChar(inputString);
    }

    static final int MAX_CHAR = 256;

    static void numberOfChar(String str) {
        // Create an array of size 256 i.e. ASCII_SIZE
        int[] count = new int[MAX_CHAR];

        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char[] ch = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if(find ==1)
                System.out.println(str.charAt(i)+" - "+count[str.charAt(i)]);

        }
    }
}
