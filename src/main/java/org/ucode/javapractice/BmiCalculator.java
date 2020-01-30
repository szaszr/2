import java.util.*;

import static java.lang.Math.*;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your height in m: ");
        double height = input.nextDouble();
        System.out.println("Your weight in kg: ");
        int weight = input.nextInt();
        double bmi = weight/pow(height,2);

        System.out.println("Your BMI is "+bmi);

        System.out.println("Your height in inches: ");
        double heightInches = input.nextDouble();
        System.out.println("Your weight in pounds: ");
        double weightInches = input.nextDouble();
        double bmiInches = (weightInches/2.205)/pow(heightInches/39.37,2);

        System.out.println("Your BMI is "+bmiInches);

        System.out.println("Your height (feet only):");
        int feet = input.nextInt();
        System.out.println("Your height (inches):");
        int inches = input.nextInt();
        System.out.println("Your weight in pounds: ");
        int weightInches2 = input.nextInt();
        double heightTransformed = (feet/3.281)+(inches/39.37);
        double bmiInches2 = (weightInches2/2.205)/pow(heightTransformed,2);

        System.out.println("Your BMI is "+bmiInches2);
    }
}
