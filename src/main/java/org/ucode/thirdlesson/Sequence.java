package org.ucode.thirdlesson;
import java.util.Scanner;
/*
Create a class called Sequence.
Read from the keyboard a number (long) and print "yes" or "no" if the number has its digits in sequential order
(both increasing or decreasing).
        Example:
        read -> 12345
        print -> yes

        read-> 432
        print -> yes

        read-> 123451
        print -> no

*/

public class Sequence {
    static boolean checkOrder(long n)
    {
        boolean flag = true;

        // to store the previous digit
        long prev = -1;

        // pointer to tell what type of sequence
        // are we dealing with
        long type = -1;

        while(n != 0)
        {
            if(type ==-1)
            {
                if(prev ==-1)
                {
                    prev = n % 10;
                    n = n/10;
                    continue;
                }

                if(prev == n % 10)
                {
                    flag = false;
                    break;
                }


                prev = n % 10;
                n = n / 10;
            }
            else
            {

                if(prev == n % 10)
                {
                    flag = false;
                    break;
                }
                // check if the digit is greater than
                // the prevoius one
                // If true, then break from the loop as
                // we are in decending order part
                if(prev < n % 10)
                {
                    flag = false;
                    break;
                }

                prev = n % 10;
                n = n / 10;
            }
        }

        return flag;
    }

// Driver code

    public static void main (String[] args) {
        System.out.println("Please input a number to check if characters are in ascending or descending order");
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        if(checkOrder(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
