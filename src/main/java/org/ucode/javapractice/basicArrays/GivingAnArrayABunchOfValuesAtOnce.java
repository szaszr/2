package org.ucode.javapractice.basicArrays;

/*
http://www.programmingbydoing.com/a/giving-an-array-a-bunch-of-values-at-once.html
 */

public class GivingAnArrayABunchOfValuesAtOnce {
    public static void main(String[] args) {
        String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };

        System.out.print("The first array is filled with the following values:\n\t");
        for ( int i=0; i<arr1.length; i++ )
            System.out.print( arr1[i] + " " );
        System.out.println();

        int [] arr2 = { 2, 4, 6, 456, 31};

        System.out.print("The first array is filled with the following values:\n\t");
        for ( int i=0; i<arr2.length; i++ )
            System.out.print( arr2[i] + " " );
        System.out.println();
    }
}
