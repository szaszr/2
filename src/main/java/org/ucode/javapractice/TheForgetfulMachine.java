import java.util.*;

public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a word!");
        input.next();
        System.out.println("Give me a second word!");
        input.next();
        System.out.println("Great, now your favourite number?");
        input.nextInt();
        System.out.println("And your second favourite number?");
        input.nextInt();
        System.out.println("Whew!  Wasn't that fun?");

    }
}
