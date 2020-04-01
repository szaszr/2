package org.ucode.javapractice.forLoops;

import java.util.*;

/*
http://www.programmingbydoing.com/a/baby-blackjack.html
 */

public class BabyBlackjack {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Baby Blackjack!");
        System.out.println();

        int playerCard1 = (1+ r.nextInt(10));
        int playerCard2 = (1+ r.nextInt(10));
        int totalPlayer = playerCard1+playerCard2;

        System.out.println("You drew "+playerCard1+" and "+playerCard2);
        System.out.println("Your total is "+totalPlayer);
        System.out.println();

        int dealerCard1 = (1+ r.nextInt(10));
        int dealerCard2 = (1+ r.nextInt(10));
        int totalDealer = dealerCard1+dealerCard2;

        System.out.println("The dealer has "+dealerCard1+" and "+dealerCard2);
        System.out.println("Dealer has a total of "+totalDealer);
        System.out.println();

        if (totalPlayer>totalDealer){
            System.out.println("You win!");
        }
        else {
            System.out.println("The dealer wins!");
        }
    }
}
