package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/keychains3.html
 */

import java.util.Scanner;

public class KeychainsForSale3 {

    public static void main(String[] args) {

        int k=0;
        double p=10;
        double tax = 8.25/100;
        int shipping = 5;
        int per_shipping = 1;

        boolean checkout = false;

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("One random keychain shop");
        neat();
        input = sc.next();

        while (!checkout){
            if (input.equals("1")){
                k = add_keychain(k);
                neat();
                input = sc.next();
            }
            else if (input.equals("2")){
                k = remove_keychain(k);
                neat();
                input = sc.next();
            }
            else if (input.equals("3")){
                view_order(k,p,tax,shipping, per_shipping);
                neat();
                input = sc.next();
            }
            else if (input.equals("4")){
                checkout(k,p,tax,shipping, per_shipping);
                checkout=true;
            }
            else {
                System.out.println("That is not an option. Please try again:");
                input = sc.next();
            }
        }

    }

    public static void neat(){
        System.out.println();
        System.out.println("1. Add Keychains to the order");
        System.out.println("2. Remove Keychains from the order");
        System.out.println("3. View current order");
        System.out.println("4. Checkout");
        System.out.println();
        System.out.print("Please enter your choice: ");
        System.out.println();
    }

    public static int add_keychain (int k){
        System.out.print("Please enter how many keychains you would like to buy:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        while (temp<=0){
            System.out.println("Please choose a number bigger than 0");
            temp = sc.nextInt();
        }
        k = k + temp;
        return k;
    }

    public static int remove_keychain (int k){
        System.out.print("You have "+ k +". How many to remove? ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        while (temp>k){
            System.out.println("I am sorry but you do not have that many to remove");
            System.out.println("Please choose a number lower or equal to "+k);
            temp = sc.nextInt();
        }
        k = k-temp;
        System.out.println("You now have "+k+" keychains.");
        return k;
    }

    public static void view_order (int k, double p, double tax, int shipping, int add_shipping){
        System.out.println("You have "+k+" keychains");
        System.out.println("Keychains cost $"+p+" each.");
        double ship;
        if (k==1){
            ship = shipping;
        }
        else {
            ship = shipping+(add_shipping*k-1);
        }
        System.out.println("Shipping charges applied "+ship);
        double total_no_tax = k*p;
        System.out.println("The total of the order not including tax is "+total_no_tax);
        double total = k*p+((k*p)*tax)+ship;
        System.out.println("Total cost is $"+total);
    }

    public static void checkout (int k, double p, double tax, int shipping, int add_shipping){
        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        view_order(k,p,tax,shipping,add_shipping);
        System.out.println("Thanks for your order, "+name+"!");

    }
}
