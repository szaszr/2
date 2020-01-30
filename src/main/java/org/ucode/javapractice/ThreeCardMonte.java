import java.util.*;

/*
http://www.programmingbydoing.com/a/three-card-monte.html
 */

public class ThreeCardMonte {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int secret = (1+r.nextInt(3));
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println( "##  ##  ##" +"\n"+
                            "##  ##  ## "+"\n"+
                            "1   2   3");
        int guess = input.nextInt();
        if (guess!=secret) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number "+secret);
            if (secret==1){
                System.out.println( "AA  ##  ##" +"\n"+
                                    "AA  ##  ## "+"\n"+
                                    "1   2   3");
            }
            else if (secret==2){
                System.out.println( "##  AA  ##" +"\n"+
                                    "##  AA  ## "+"\n"+
                                    "1   2   3");
            }
            else if (secret==3) {
                System.out.println( "##  ##  AA" +"\n"+
                                    "##  ##  AA "+"\n"+
                                    "1   2   3");
            }
        }
        else if (guess==secret) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            if (secret==1){
                System.out.println( "AA  ##  ##" +"\n"+
                                    "AA  ##  ## "+"\n"+
                                    "1   2   3");
            }
            else if (secret==2){
                System.out.println( "##  AA  ##" +"\n"+
                                    "##  AA  ## "+"\n"+
                                    "1   2   3");
            }
            else if (secret==3) {
                System.out.println( "##  ##  AA" +"\n"+
                                    "##  ##  AA "+"\n"+
                                    "1   2   3");
            }
        }
    }
}
