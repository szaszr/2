import java.util.*;

/*
http://www.programmingbydoing.com/a/right-triangle-checker.html
 */

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        int side1 = input.nextInt();
        System.out.print("Side 2: ");
        int side2 = input.nextInt();
        while (side1>side2){
            System.out.println(side2+" is smaller than "+side1+". Try again!");
            System.out.print("Side 2: ");
            side2 = input.nextInt();
        }
        System.out.print("Side 3: ");
        int side3 = input.nextInt();
        while (side2>side3) {
            System.out.println(side3+" is smaller than "+side2+". Try again!");
            System.out.print("Side 3: ");
            side3 = input.nextInt();
        }
        System.out.println("Your sides are "+side1+" "+side2+" "+side3);

        int n=0;
        while (side1==side2 || side1==side3 || side2==side3 && n<1){
            System.out.println("NO!  These sides do not make a right triangle!");
            n++;
        }
        while (n==0) {
            System.out.println("These sides *do* make a right triangle. Yippy-skippy!");
            n++;
        }
    }
}
