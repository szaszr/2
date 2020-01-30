import java.util.*;

/*
http://www.programmingbydoing.com/a/safe-square-root.html
 */

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while (number<0){
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Enter a new number: ");
            number= input.nextInt();
        }
        double sqrt = Math.sqrt(number);
        System.out.println("The square root of "+number+" is "+sqrt);
    }
}
