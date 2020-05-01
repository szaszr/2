package org.ucode.catCoder;

import java.util.Arrays;

public class Bakery {
    public static void main(String[] args) {


        String input = "F 1 209 F 2 254 F 3 895 F 4 439 B 1 104 B 2 127 B 3 74 B 3 447 B 4 127 B 4 219 B 5 448 B 6 220";

        String [] inputAll = input.split(" ");

        int inputSize = inputAll.length;

        //System.out.println(Arrays.toString(inputAll));

        String [] salesArray = new String[(inputSize+1)/2];
        String [] depositArray = new String[inputSize-salesArray.length];

        for (int i = 0; i < inputSize; i++)
        {
            if (i < salesArray.length)
                salesArray[i] = inputAll[i];
            else
                depositArray[i - salesArray.length] = inputAll[i];
        }

        System.out.println(Arrays.toString(salesArray));
        System.out.println(Arrays.toString(depositArray));

        for (int index =0; index < salesArray.length; index++){
            salesArray[index] = salesArray[index].replace("F", "B");
        }

        int pointer = 0;
        for (int i = 0; i < depositArray.length; i++) {
            pointer++;
            if (!salesArray[i].equals(depositArray[i])){
                System.out.println(depositArray[i-1]);
            }
        }
    }
}
