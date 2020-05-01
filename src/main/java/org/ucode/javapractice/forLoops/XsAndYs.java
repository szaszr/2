package org.ucode.javapractice.forLoops;/*
http://www.programmingbydoing.com/a/xs-and-ys.html
 */

public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("    "+"x"+"     "+"y");
        System.out.println("-----------------");
        for (double i = -10.0; i<=10.0; i+=0.5){
            double n = Math.pow(i, 2);
            System.out.println("    "+i+"   "+n);
        }
    }
}
