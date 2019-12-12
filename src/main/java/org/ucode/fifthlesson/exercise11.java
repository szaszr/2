package org.ucode.fifthlesson;

/*
 Write a Java program to compute the distance between two points on the surface of earth.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output
The distance between those points is: 1480.0848451069087 km

 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("e://ex11.txt"));
            double radius = 1480.0848451069087;

            String input1 = s.next();
            String input2 = s.next();
            String input3 = s.next();
            String input4 = s.next();

            System.out.println(input1+","+input2+","+input3+","+input4);

            double x1 = Double.parseDouble(input1);
            double y1 = Double.parseDouble(input2);
            double x2 = Double.parseDouble(input3);
            double y2 = Double.parseDouble(input4);
            System.out.println(x1+","+y1+","+x2+","+y2);
            /*
            d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)
             */
            double d = radius* Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(x2-y2));
            System.out.println("Distance between the two points is: "+d+" km");


            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
