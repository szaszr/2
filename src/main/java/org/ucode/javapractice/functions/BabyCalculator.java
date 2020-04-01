package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/project-calculator.html
 */

import java.util.Scanner;

public class BabyCalculator {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;

        do
        {
            System.out.print("> ");
            a  = keyboard.nextDouble();
            op = keyboard.next();
            b  = keyboard.nextDouble();

            if ( op.equals("+") )
                System.out.println(add(a, b));
            else if (op.equals("-"))
                System.out.println(substract(a, b));
            else if (op.equals("*"))
                System.out.println(multiply(a, b));
            else if (op.equals("/"))
                System.out.println(divide(a, b));
            else if (op.equals("^"))
                System.out.println(exponent(a, b));
            else if (op.equals("%"))
                System.out.println(modulus(a, b));
            else
            {
                System.out.println("Undefined operator: '" + op + "'.");
            }
        } while ( a!=0 );
    }
    public static double add (double a, double b){
        double c;
        c = a + b;
        return c;
    }
    public static double substract (double a, double b){
        double c;
        c = a - b;
        return c;
    }
    public static double divide (double a, double b){
        double c;
        c = a / b;
        return c;
    }
    public static double multiply (double a, double b){
        double c;
        c = a * b;
        return c;
    }
    public static double modulus (double a, double b){
        double c;
        c = a % b;
        return c;
    }

    //https://en.wikipedia.org/wiki/Exponentiation_by_squaring
    //recursive algorithm
    public static double exponent (double a, double b){
        double c=0;
        if(b<0){
            c = exponent(1/a, -b);
        }
        else if (b==0){
            c = 1;
        }
        else if (b==1){
            c = a;
        }
        else if (b%2==0){
            c = exponent(a*a, b/2);
        }
        else if (b%2!=0){
            c = a * exponent(a*a, (b-1)/2);
        }
        return c;
    }
}
