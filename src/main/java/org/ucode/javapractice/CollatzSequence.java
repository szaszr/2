import java.util.*;

/*
http://www.programmingbydoing.com/a/collatz-sequence.html
 */

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Starting number: ");
        int n = input.nextInt();
        int i = 0;
        int largest = 0;
        while (n!=1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
                i++;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
                System.out.println(n);
                i++;
            }
            if (n>largest){
                largest=n;
        }
        }
        System.out.println("The largest number was: "+largest);
        System.out.println("Total steps: "+i);
    }
}

