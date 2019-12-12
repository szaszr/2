package org.ucode.fifthlesson;

import java.util.Date;
import java.text.*;


/*  Write a Java program to display the current date time in specific format.
Sample Output:
Now: 2017/06/16 08:52:03.066
*/

public class exercise19 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss.SSS");
        System.out.println("Now " + ft.format(date));
    }
}
