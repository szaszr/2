import java.util.*;

/*
http://www.programmingbydoing.com/a/age-in-five-years.html
 */

public class AgeInFiveYears {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hi, "+name+"! How old are you?");
        int age = input.nextInt();
        System.out.println("Did you know that in five years you will be "+(age+5)+" years old?");
        System.out.println("And five years ago you were "+(age-5)+"! Imagine that!");
    }
}
