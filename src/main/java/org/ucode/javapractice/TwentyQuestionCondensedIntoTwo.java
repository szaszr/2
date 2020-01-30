import java.util.*;

public class TwentyQuestionCondensedIntoTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!\n" +
                "\nThink of an object, and I'll try to guess it.");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        String inp1 = input.next();

        if (inp1.equals("animal")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String inp11 = input.next();
            if (inp11.equals("no")){
                System.out.println("My guess is that you are thinking of a squirrel.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
            else if (inp11.equals("yes")){
                System.out.println("My guess is that you are thinking of a moose.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        }
        else if (inp1.equals("vegetable")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String inp12 = input.next();
            if (inp12.equals("no")){
                System.out.println("My guess is that you are thinking of a carrot.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
            else if (inp12.equals("yes")){
                System.out.println("My guess is that you are thinking of a watermelon.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        }
        else if (inp1.equals("mineral")){
            System.out.println("Question 2) Is it bigger than a breadbox?");
            String inp13 = input.next();
            if (inp13.equals("no")){
                System.out.println("My guess is that you are thinking of a paper clip.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
            else if (inp13.equals("yes")){
                System.out.println("My guess is that you are thinking of a Camaro.\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        }
    }
}
