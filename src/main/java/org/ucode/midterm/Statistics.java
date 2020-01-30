package org.ucode.midterm;

import java.io.*;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        try {
            File myObj = new File("e://students.txt");
            Scanner myReader = new Scanner(myObj);
            Student [] studentsArray = new Student[10];
            int i= 0;
            FileWriter fileWriter = new FileWriter("e://statistics.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (myReader.hasNextLine()) {
                String input = myReader.nextLine();
                String[] split = input.split(", ");
                studentsArray[i]=new Student(split[0],split[1],Integer.parseInt(split[2]),split[3],Double.parseDouble(split[4]));
                i++;
            }
            printWriter.println("Students which have grades above 6.5.");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].generalGrade > 6.5) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }

            printWriter.println();
            printWriter.println("Students which are older than 22");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].age > 22) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }

            printWriter.println();
            printWriter.println("Students which have a grade higher than 5 and are in the Informatica department.");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].generalGrade > 5 && studentsArray[n].department.equals("Informatica")) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }

            printWriter.println();
            printWriter.println("Students which failed the exam. (grade below 4)");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].generalGrade < 4) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }

            printWriter.println();
            printWriter.println("Students which have last name longer than 5 characters");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].lastName.length()>5) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }

            printWriter.println();
            printWriter.println("Students which are in the Matematica department and are older than 22 and have grades higher than 6.");
            for (int n=0;n<studentsArray.length;n++) {
                if (studentsArray[n].department.equals("Matematica") && studentsArray[n].age > 22 && studentsArray[n].generalGrade > 6) {
                    printWriter.println(studentsArray[n].firstName + " " + studentsArray[n].lastName);
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
