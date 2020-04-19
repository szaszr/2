package org.ucode.javapractice.sorting;

/*
http://www.programmingbydoing.com/a/sorting-values.html
 */

public class SortingAnArray {
    public static void main(String[] args) {
        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Swap the values around to put them ascending order.


        int [] tempArray = new int[1];

        for (int i = 0; i<arr.length ; i++) {
			for (int j=0; j<arr.length ; j++) {
				if (arr[i]<arr[j]) {
					// swap the values in two slots
                    tempArray[0] = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempArray[0];
				}
			}
		}

        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
