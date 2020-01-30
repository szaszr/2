import java.util.*;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        String name = input.next();
        System.out.println("Ok, "+name+", how old are you?");
        int age = input.nextInt();

        if (age <16){
            System.out.println("You can not drive");
        }
        if (age <18){
            System.out.println("You can not vote");
        }
        if (age <25){
            System.out.println("You can not rent a car");
        }
        if (age >25){
            System.out.println("You can do anything that's legal.");
        }
    }
}
