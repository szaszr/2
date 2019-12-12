package org.ucode.fifthlesson;

/*
Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex5.txt"));
            String input = s.next();
            int num = Integer.parseInt(input);
            System.out.println("the side of the hexagon is:" +input);
            System.out.println("The area of the hexagon is:"+ (6*Math.pow(num,2))/(4*Math.tan(Math.PI/6)));
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
