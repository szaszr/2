package org.ucode.javapractice.ifStatements;

import java.util.*;

/*
http://www.programmingbydoing.com/a/bmi-categories.html
 */

import static java.lang.Math.pow;

public class BmiCategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your height in m: ");
        double height = input.nextDouble();
        System.out.println("Your weight in kg: ");
        int weight = input.nextInt();
        double bmi = weight/pow(height,2);

        System.out.println("Your BMI is "+bmi);
        if (bmi<15){
            System.out.println("BMI Category: very severely underweight");
        }
        if (bmi>15 && bmi<16){
            System.out.println("BMI Category: severely underweight");
        }
        if (bmi>16.1 && bmi<18.4){
            System.out.println("BMI Category: underweight");
        }
        if (bmi>18.5 && bmi<24.9) {
            System.out.println("BMI Category: normal weight");
        }
        if (bmi>25 && bmi<29.9) {
            System.out.println("BMI Category: overweight");
        }
        if (bmi>30 && bmi<34.9) {
            System.out.println("BMI Category: moderately obese");
        }
        if (bmi>35 && bmi<39.9) {
            System.out.println("BMI Category: severely obese");
        }
        if (bmi>40) {
            System.out.println("BMI Category: morbidly obese");
        }
    }
}
