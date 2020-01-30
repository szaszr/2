import java.util.*;

public class AskingQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int feet;
        int inches;
        double weight;
        int age;
        int height;

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("How many feet tall are you?");
        feet = input.nextInt();

        System.out.println("And how many inches?");
        inches = input.nextInt();

        System.out.println("How much do you weigh?");
        weight = input.nextDouble();

        System.out.println("So you are "+age+" old, "+feet+"'"+inches+"\" tall and "+weight+" heavy");
    }
}
