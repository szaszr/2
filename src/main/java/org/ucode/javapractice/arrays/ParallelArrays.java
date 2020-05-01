package org.ucode.javapractice.arrays;

/*

 */

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        String[] lastName = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
        double [] gradeAverage = { 99.5, 78.5, 95.6, 96.8, 82.7};
        int [] idNumber = {123456, 456789, 988746, 654987, 132789};

        System.out.println("Values:");
        for (int i = 0; i < lastName.length; i++) {
            System.out.println("\t\t"+lastName[i]+" "+gradeAverage[i]+" "+idNumber[i]);
        }
        System.out.println();

        System.out.println();
        System.out.print("ID number to find: ");
        Scanner sc = new Scanner(System.in);
        int find = sc.nextInt();

        for (int i = 0; i < idNumber.length; i++) {
            if (find==idNumber[i]){
                System.out.println("Found in slot "+i);
                System.out.println("\t\tName: "+lastName[i]);
                System.out.println("\t\tGrade: "+gradeAverage[i]);
                System.out.println("\t\tID: "+idNumber[i]);
            }
        }
    }
}
