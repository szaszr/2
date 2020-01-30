package org.ucode.fifthlesson;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Write a Java program to print the result of the following operations.
        Input data:
        -5 + 8 * 6
        (55+9) % 9
        20 + -3*5 / 8
        5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13

 */

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("e://ex1.txt");
            Scanner myReader = new Scanner(myObj);
            DoubleEvaluator evaluator = new DoubleEvaluator();
            while (myReader.hasNextLine()) {
                String expression = myReader.nextLine();
                System.out.println("Equation: "+expression);
                Double result = evaluator.evaluate(expression);
                System.out.println("The result of the equation above is: "+result);

            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
