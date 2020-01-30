import java.util.*;

/*
http://www.programmingbydoing.com/a/a-dumb-calculator.html
 */

public class DumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first number?");
        double num1 = input.nextDouble();
        System.out.println("What is your second number?");
        double num2 = input.nextDouble();
        System.out.println("What is your third number?");
        double num3 = input.nextDouble();
        double result = (num1+num2+num3)/2;

        System.out.println("("+num1+" + "+num2+" + "+num3+")/2 is " + result);
    }
}
