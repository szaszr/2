import java.util.*;

/*
http://www.programmingbydoing.com/a/a-little-quiz.html
 */

public class LittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your name so we can start the quiz!");
        String name = input.next();
        System.out.println("Q1) What is the capital of Alaska?" +
                "\n\t1) Melbourne" +
                "\n\t2) Anchorage" +
                "\n\t3) Juneau");
        int answer1 = input.nextInt();
        int score = 0;
        if (answer1==3){
            System.out.println("That is right!");
            score++;
        }
        else  {
            System.out.println("That is not correct");
        }
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?" +
                "\n\t1) yes" +
                "\n\t2) no");
        int answer2 = input.nextInt();
        if (answer2==2){
            System.out.println("You are correct");
            score++;
        }
        else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println("Q3) What is the result of 9+6/3?" +
                "\n\t1) 5" +
                "\n\t2) 11" +
                "\n\t3) 15/3");
        int answer3 = input.nextInt();
        if (answer3==2){
            System.out.println("That is correct!");
            score++;
        }
        else {
            System.out.println("That is not correct");
        }
        System.out.println("Dear "+name+" overall, you got "+score+" out of 3 correct");
        System.out.println("Thank you for playing!");
    }
}
