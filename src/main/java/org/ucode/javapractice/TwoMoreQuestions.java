import java.util.*;

/*
http://www.programmingbydoing.com/a/two-more-questions.html
 */

public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.println("Question 1) Does it stay inside or outside or both?");
        String inp1 = input.next();
        System.out.println("Question 2: Is it alive?");
        String inp2 = input.next();
        if (inp1.equals("inside") && inp2.equals("yes") ){
            System.out.println("Then what else could you be thinking of besides a houseplant?!?");
        }
        if (inp1.equals("inside") && inp2.equals("no")) {
            System.out.println("It can only be a freaking shower curtain!");
        }
        if (inp1.equals("outside") && inp2.equals("yes")){
            System.out.println("I am sure you were thinking of a bison");
        }
        if (inp1.equals("outside") && inp2.equals("no")) {
            System.out.println("The only thing that fits this is a billboard!");
        }
        if (inp1.equals("both") && inp2.equals("yes")) {
            System.out.println("The cutest thing alive, a dog!");
        }
        if (inp1.equals("both") && inp2.equals("no")) {
            System.out.println("What else is there beside a cell phone?!");
        }
    }
}
