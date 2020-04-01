package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/area-calculator.html
 */

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using this program you can calculate the area of different shapes.");
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.print("Which shape would you like to calculate the area: ");

        String input = sc.next();
        while (!input.equals("5")){
            if (input.equals("1")) {
                System.out.print("Base:");
                int base = sc.nextInt();
                System.out.print("Height:");
                int height = sc.nextInt();
                System.out.println("The area is "+ area_triangle(base, height)+".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println();
                System.out.println("1) Triangle");
                System.out.println("2) Rectangle");
                System.out.println("3) Square");
                System.out.println("4) Circle");
                System.out.println("5) Quit");
                System.out.println("Which shape would you like to calculate the area?");
                input = sc.next();
            }
            else if (input.equals("2")){
                System.out.print("Length:");
                int length = sc.nextInt();
                System.out.print("Width:");
                int width = sc.nextInt();
                System.out.println("The area is "+ area_rectangle(length, width) +".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println();
                System.out.println("1) Triangle");
                System.out.println("2) Rectangle");
                System.out.println("3) Square");
                System.out.println("4) Circle");
                System.out.println("5) Quit");
                System.out.println("Which shape would you like to calculate the area?");
                input = sc.next();
            }
            else if (input.equals("3")){
                System.out.print("Side:");
                int side = sc.nextInt();
                System.out.println("The area is "+ area_square(side) +".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println();
                System.out.println("1) Triangle");
                System.out.println("2) Rectangle");
                System.out.println("3) Square");
                System.out.println("4) Circle");
                System.out.println("5) Quit");
                System.out.println("Which shape would you like to calculate the area?");
                input = sc.next();
            }
            else if (input.equals("4")){
                System.out.print("Radius:");
                int radius = sc.nextInt();
                System.out.println("The area is "+ area_circle(radius) +".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println();
                System.out.println("1) Triangle");
                System.out.println("2) Rectangle");
                System.out.println("3) Square");
                System.out.println("4) Circle");
                System.out.println("5) Quit");
                System.out.println("Which shape would you like to calculate the area?");
                input = sc.next();
            }
            else if (input.equals("5")){
                break;
            }
            else {
                System.out.println("That was not an option. Please try again!");
                input = sc.next();
            }
        }
    }

    public static double area_circle( int radius ) {
        double result = Math.PI*(Math.pow(radius, 2));
        return result;
    }             // returns the area of a circle

    public static int area_rectangle( int length, int width ){
        int result = length*width;
        return result;
    }   // returns the area of a rectangle

    public static int area_square( int side ){
        int result = side*side;
        return result;
    }                   // returns the area of a square

    public static double area_triangle( int base, int height ){
        double result = 0.5 * base * height;
        return result;
    } // returns the area of a triangle
}
