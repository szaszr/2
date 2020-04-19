package org.ucode.homework3;

/*Create Student class with characteristics height and name.
Create BasketSelection class.
In this class create 3 Student objects and put them in an array.
Iterate over that array and print the names of the students that have the height over 150.
 */

public class BasketSelection {

    public static void main(String[] args) {

        int minheight = 150;

        Student [] studentarray = new Student [5];

        studentarray[0] = new Student ("Tom",165);
        studentarray[1] = new Student ("Sammy",145);
        studentarray[2] = new Student ("Danny",175);
        studentarray[3] = new Student ("Casey",151);

        for (int index = 0; index < studentarray.length - 1; index++) {
            if (studentarray[index].height >minheight)
            System.out.println(studentarray[index].name + " is not a midget so he can play basketball");
        }
    }

}