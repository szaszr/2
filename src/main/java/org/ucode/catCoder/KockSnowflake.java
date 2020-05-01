package org.ucode.catCoder;

public class KockSnowflake {
    public static void main(String[] args) {

        System.out.println(kockPerimeter(3, 243));
        System.out.println(kockPerimeter(7, 19683));
        System.out.println(kockPerimeter(7, 531441));
        System.out.println(kockPerimeter(9, 531441));


        System.out.println(kockPerimeterSquare(3, 243));
        System.out.println(kockPerimeterSquare(7, 19683));
        System.out.println(kockPerimeterSquare(7, 531441));
        System.out.println(kockPerimeterSquare(9, 531441));
    }


    public static double kockPerimeter (int iteration, int sideLength){

        return (3 * sideLength * (Math.pow(4,iteration)/Math.pow(3, iteration)));
    }

    public static double kockPerimeterSquare (int iteration, int sideLength){

        return (4 * sideLength * (Math.pow(5,iteration)/Math.pow(3, iteration)));
    }
}
