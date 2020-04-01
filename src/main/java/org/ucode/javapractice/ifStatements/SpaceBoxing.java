package org.ucode.javapractice.ifStatements;

import java.util.*;

/*
http://www.programmingbydoing.com/a/space-boxing.html
 */

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your current earth weight:");
        int weight = input.nextInt();
        double venus = 0.78;
        double mars = 0.39;
        double jupiter = 2.65;
        double saturn = 1.17;
        double uranus = 1.05;
        double neptune = 1.23;
        System.out.println("I have information for the following planets:" +
                "\n1. Venus    2. Mars    3. Jupiter" +
                "\n4. Saturn   5. Uranus  6. Neptune");
        System.out.println("Which planet are you visiting?");
        int visit = input.nextInt();

        if (visit == 1){
            System.out.println("Your weight would be "+weight*venus +" pounds on that planet.");
        }
        else if (visit ==2){
            System.out.println("Your weight would be "+weight*mars +" pounds on that planet.");
        }
        else if (visit ==3){
            System.out.println("Your weight would be "+weight*jupiter +" pounds on that planet.");
        }
        else if (visit ==4){
            System.out.println("Your weight would be "+weight*saturn +" pounds on that planet.");
        }
        else if (visit ==5){
            System.out.println("Your weight would be "+weight*uranus +" pounds on that planet.");
        }
        else if (visit ==6){
            System.out.println("Your weight would be "+weight*neptune +" pounds on that planet.");
        }
    }
}
