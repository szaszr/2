package org.ucode.catCoder;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;

public class Distance {
    public static void main(String[] args) {
        String input = "15 64 1 1 11 48 1 2 19 43 1 3 21 51 1 4 20 35 1 5 17 61 1 6 39 48 1 7 29 42 1 8 23 51 1 9 51 20 1 10 36 65 1 11 62 40 2 1 107 40 2 2 63 59 2 3 29 63 2 4 16 64 2 5 67 29 2 6 52 24 2 7 19 36 2 8 64 50 2 9 63 40 2 10 24 50 2 11 52 33";

        String[] numbersAsString = input.split(" ");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        double [][] distances = new double[22][5];

        int increment =4;

        for (int i = 0; i < distances.length; i++) {

            //double ac = Math.abs(numbers[i*increment+5-i]-numbers[1]);
            //double cb = Math.abs(numbers[i*increment+increment]-numbers[0]);
            //distances[i][0]=Math.hypot(ac, cb);

            //distances[i][0]=Math.sqrt(Math.pow((numbers[i*increment+increment]-numbers[0]),2)+Math.pow((numbers[i*increment+5-i]-numbers[1]),2));

            distances[i][0] = Point2D.distance(numbers[0],numbers[1],numbers[i*increment+increment],numbers[i*increment+5]);

            distances[i][1]=numbers[i*increment+2];
            distances[i][2]=numbers[i*increment+3];
            distances[i][3]=numbers[i*increment+4];
            distances[i][4]=numbers[i*increment+5];
        }

       Arrays.sort(distances, new Comparator<double[]>() {
           @Override
           public int compare(double[] a, double[] b) {
               return Double.compare(a[0],b[0]);
           }
       });
        
        System.out.println("Sorted in ascending order: ");

        for (int i = 0; i < distances.length; i++) {
            //System.out.println("Distance "+i+" is "+ Arrays.toString(distances[i]));
            System.out.print((int)distances[i][1]+" "+(int)distances[i][2]+" ");
        }
    }
}
