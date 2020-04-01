package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/keychains1.html
 */

import java.util.Scanner;

public class KeychainsForSale1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("One random keychain shop");
        System.out.println();
        System.out.println("1. Add Keychains to the order");
        System.out.println("2. Remove Keychains from the order");
        System.out.println("3. View current order");
        System.out.println("4. Checkout");
        System.out.println();
        System.out.print("Please enter your choice: ");
        System.out.println();
        input = sc.next();

        while (!input.equals("4")){
            if (input.equals("1")){
                add_keychain();
                System.out.println();
                System.out.println("1. Add Keychains to the order");
                System.out.println("2. Remove Keychains from the order");
                System.out.println("3. View current order");
                System.out.println("4. Checkout");
                System.out.println();
                System.out.print("Please enter your choice: ");
                System.out.println();
                input = sc.next();
            }
            else if (input.equals("2")){
                remove_keychain();
                System.out.println();
                System.out.println("1. Add Keychains to the order");
                System.out.println("2. Remove Keychains from the order");
                System.out.println("3. View current order");
                System.out.println("4. Checkout");
                System.out.println();
                System.out.print("Please enter your choice: ");
                System.out.println();
                input = sc.next();
            }
            else if (input.equals("3")){
                view_order();
                System.out.println();
                System.out.println("1. Add Keychains to the order");
                System.out.println("2. Remove Keychains from the order");
                System.out.println("3. View current order");
                System.out.println("4. Checkout");
                System.out.println();
                System.out.print("Please enter your choice: ");
                System.out.println();
                input = sc.next();
            }
            else if (input.equals("4")){
                checkout();
                System.out.println();
                System.out.println("1. Add Keychains to the order");
                System.out.println("2. Remove Keychains from the order");
                System.out.println("3. View current order");
                System.out.println("4. Checkout");
                System.out.println();
                System.out.print("Please enter your choice: ");
                System.out.println();
                input = sc.next();
            }
            else {
                System.out.println("That is not an option. Please try again:");
                input = sc.next();
            }
        }

    }

    public static void add_keychain (){
        System.out.println("ADDED KEYCHAIN");
    }

    public static void remove_keychain (){
        System.out.println("REMOVED KEYCHAIN");
    }

    public static void view_order (){
        System.out.println("VIEW ORDER");
    }

    public static void checkout (){
        System.out.println("CHECKOUT");
    }


}
