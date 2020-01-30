import java.util.*;

/*
http://www.programmingbydoing.com/a/the-worst-number-guessing-game-ever.html
 */

public class TheWorstGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = 4;
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
        System.out.println();
        System.out.println("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
        int guess = input.nextInt();

        if (guess==secret){
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+secret);
        }
        else if (guess!=secret){
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+secret);
        }
    }
}
