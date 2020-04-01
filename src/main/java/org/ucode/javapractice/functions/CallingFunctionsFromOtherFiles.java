package org.ucode.javapractice.functions;

/*
http://www.programmingbydoing.com/a/calling-functions-from-other-files.html
 */

import org.ucode.javapractice.ifStatements.WeekdayName;

import java.util.Scanner;

public class CallingFunctionsFromOtherFiles {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to my fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        // put a function call for weekday() here
        System.out.println("You were born on "+weekday(mm, dd, yyyy));
    }

    public static String weekday( int mm, int dd, int yyyy ) {

        int yy, total;
        String date = "";

        yy=yyyy-1900;

        if (WeekdayCalculator.is_leap(yyyy) && mm==1 || mm==2){
            total = yy/4 + yy + MonthOffset.month_offset(mm) + dd - 1;
        }
        else
            total = yy/4 + yy + MonthOffset.month_offset(mm) + dd;

        int result = total%7;

        // bunch of calculations go here
        WeekdayName.weekday_name(result);
        date = WeekdayName.weekday_name(result) +", " + MonthName.month_name(mm) + " " + dd + ", " + yyyy;

        return date;
    }
}
