import java.util.*;

/*
http://www.programmingbydoing.com/a/alphabetical-order.html
 */


public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastName = input.next();

        if(lastName.compareTo("Carswell")<=0){
            System.out.println("You don\'t have to wait long, "+lastName);
        }
        else if(lastName.compareTo("Jones")<=0){
            System.out.println("That\'s not bad, "+lastName);
        }
        else if(lastName.compareTo("Smith")<=0){
            System.out.println("Looks like a bit of wait, "+lastName);
        }
        else if(lastName.compareTo("Young")<=0){
            System.out.println("It\'s gonna be a while, "+lastName);
        }
        else if(lastName.compareTo("Young")>=0){
            System.out.println("Not going anywhere for a while? "+lastName);
        }
    }
}
