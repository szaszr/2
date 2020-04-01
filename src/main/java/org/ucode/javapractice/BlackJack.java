package org.ucode.javapractice;

import java.util.*;

/*
http://www.programmingbydoing.com/a/project-blackjack.html
 */

public class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        boolean bustPlayer = false;
        boolean bustDealer = false;

        System.out.println("Welcome to Robert's blackjack program!");
        System.out.println();

        int playerCard1 = (1+r.nextInt(11));
        int playerCard2 = (1+r.nextInt(11));
        int totalPlayer = playerCard1+playerCard2;
        System.out.println("You get a "+playerCard1+" and a "+playerCard2);
        System.out.println("Your total is "+totalPlayer);
        System.out.println();

        int dealerCard1 = (1+r.nextInt(11));
        int dealerCard2 = (1+r.nextInt(11));
        int totalDealer = dealerCard1+dealerCard2;
        System.out.println("The dealer has a "+dealerCard1+" showing, and a hidden card.");
        System.out.println("His total is hiden, too.");
        System.out.println();

        System.out.println("Would you like to \"hit\" or \"stay\"?");
        String choice = input.next();

        while (choice.equals("hit") && totalPlayer<=21){
            if (choice.equals("hit")){
                int randomCardPlayer = (1+r.nextInt(11));
                System.out.println("You drew a "+randomCardPlayer);
                totalPlayer=totalPlayer+randomCardPlayer;
                System.out.println("Your total is "+totalPlayer);
                System.out.println();
                if (totalPlayer>21){
                    System.out.println("You bust!");
                    bustPlayer = true;
                    break;
                }
                System.out.println("Would you like to \"hit\" or \"stay\"?");
                choice = input.next();
            }
            else if (choice.equals("stay")){
                System.out.println("Your total right now is "+totalPlayer);
                System.out.println("It is the dealers turn.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("His hidden card was a " + dealerCard2);
        System.out.println("His total was " + totalDealer);
        System.out.println();

        while (totalDealer<16 || totalDealer>21){
            if(totalPlayer>21){
                break;
            }
            System.out.println("Dealer chooses to hit.");
            int randomCardDealer = (1+r.nextInt(11));
            System.out.println("He draws a "+randomCardDealer);
            totalDealer=totalDealer+randomCardDealer;
            System.out.println();
            System.out.println("His total right now is "+totalDealer);
            System.out.println();
            if (totalDealer>16){
                System.out.println();
                System.out.println("Dealer stays.");
                System.out.println();
            }
            else if (totalDealer>21){
                System.out.println();
                System.out.println("That is a bust for the dealer!");
                System.out.println("You win!");
                bustDealer=true;
                break;
            }

        }

        while (!bustPlayer && !bustDealer) {

            System.out.println("Dealer has a total of " + totalDealer);
            System.out.println("Your total is " + totalPlayer);
            System.out.println();

            if (totalDealer == 21 && totalDealer == totalPlayer) {
                System.out.println("Dealer wins!");
                break;
            } else if (totalDealer <= 21 && totalDealer > totalPlayer) {
                System.out.println("Dealer wins");
                break;
            } else if (totalPlayer <= 21 && totalPlayer > totalDealer) {
                System.out.println("You win!");
                break;
            }
        }

    }
}
