import java.util.*;

/*
http://www.programmingbydoing.com/a/adding-values-in-a-loop.html
 */

public class AddingValuesWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me. Until you give me a 0");
        System.out.println("Number: ");
        int number = input.nextInt();
        int totalFinal = 0;
        int total = totalFinal+number;
        System.out.println("The total so far is " + total);
        while (number != 0) {
            System.out.println("Number: ");
            number = input.nextInt();
            total = number + total;
            System.out.println("The total so far is " + total);

        }
        System.out.println("The total is: " + total);
    }
}
