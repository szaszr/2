package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/keychains2.html
 */

import java.util.Scanner;

public class KeychainsForSale2 {

    public static void main(String[] args) {

        int k=0;
        int p=10;

        boolean checkout = false;

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

        while (!checkout){
            if (input.equals("1")){
                k = add_keychain(k);
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
                k = remove_keychain(k);
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
                view_order(k,p);
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
                checkout(k,p);
                checkout=true;
            }
            else {
                System.out.println("That is not an option. Please try again:");
                input = sc.next();
            }
        }

    }

    public static int add_keychain (int k){
        System.out.print("Please enter how many keychains you would like to buy:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        k = k + temp;
        return k;
    }

    public static int remove_keychain (int k){
        System.out.print("You have "+ k +". How many to remove? ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        k = k-temp;
        System.out.println("You now have "+k+" keychains.");
        return k;

    }

    public static void view_order (int k, int p){
        System.out.println("You have "+k+" keychains");
        System.out.println("Keychains cost $"+p+" each.");
        System.out.println("Total cost is $"+k*p);
    }

    public static void checkout (int k, int p){
        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        view_order(k, p);
        System.out.println("Thanks for your order, "+name+"!");

    }

}
