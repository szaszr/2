import java.util.*;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.next();
        System.out.println("Hi, "+name+"! How old are you?");
        int age = input.nextInt();
        System.out.println("So you are "+age+", eh? That is not old at all!");
        System.out.println("How much do you make, "+name+"?");
        double salary = input.nextDouble();
        System.out.println(salary+"! I hope that's per hour and not per year! LOL!");
    }
}
