package org.ucode.javapractice.keyboardInput;

import java.util.*;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        String first, last, login;
        int grade, studId;
        double gpa;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println("First name: ");
        first = input.next();
        System.out.println("Lase name: ");
        last = input.next();
        System.out.println("Grade (9-12): ");
        grade = input.nextInt();
        System.out.println("Student ID: ");
        studId = input.nextInt();
        System.out.println("Login: ");
        login = input.next();
        System.out.println("GPA (0.0-4.0): ");
        gpa = input.nextDouble();

        System.out.println("Your information:" +"\n"+
                "\t"+"Login: "+login+"\n"+
                "\t"+"ID: "+studId+"\n"+
                "\t"+"Name: "+last+", "+first+"\n"+
                "\t"+"GPA: "+gpa+"\n"+
                "\t"+"Grade: "+grade);
    }
}
