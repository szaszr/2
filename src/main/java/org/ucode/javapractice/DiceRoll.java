import java.util.*;

/*
http://www.programmingbydoing.com/a/dice.html
 */

public class DiceRoll {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("HERE COMES THE DICE!");
        System.out.println();

        int roll1 = (1+r.nextInt(6));
        int roll2 = (1+r.nextInt(6));
        int total = roll1+roll2;
        System.out.println("Roll #1: "+roll1);
        System.out.println("Roll #2: "+roll2);
        System.out.println("The total is "+total);
    }
}
