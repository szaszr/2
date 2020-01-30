import java.util.*;

/*
http://www.programmingbydoing.com/a/gender-game.html
 */

public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender (M or F)");
        String gender = input.next();
        System.out.println("First name: ");
        String first = input.next();
        System.out.println("Last name: ");
        String last = input.next();
        System.out.println("Age: ");
        int age = input.nextInt();
        if (gender.equals("F") && age>20){
            System.out.println("Are you married, "+first+" (y or n)?");
            String married = input.next();
            if (married.equals("y")){
                System.out.println("Then I shall call you Mrs. "+last+".");
            }
            else {
                System.out.println("Then I shall call you Ms. "+last+".");
            }
        }
        else if (gender.equals("F")){
            System.out.println("Then I shall call you "+first+" "+last+".");
        }
        else if (gender.equals("M") && age>20){
            System.out.println("Then I shall call you Mr. "+last);
        }
        else if (gender.equals("M") && age<20){
            System.out.println("Then I shall call you "+first+" "+last+".");
        }
    }
}
