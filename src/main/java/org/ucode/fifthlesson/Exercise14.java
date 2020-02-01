package org.ucode.fifthlesson;

/*14. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
        Expected Output
        123
        124
        ...

        431
        432
*/

public class Exercise14 {
    public static void main(String[] args) {
        int total = 0;
        for (int a=1; a<=4; a++){
            for (int b=1; b<=4; b++){
                for (int c=1; c<=4; c++){
                    if (c!=a && c!=b && a!=b){
                        total++;
                        System.out.println(a+"-"+b+"-"+c);
                    }
                }
            }
        }
        System.out.println("Total amount of possible permutations is "+total);
    }
}
