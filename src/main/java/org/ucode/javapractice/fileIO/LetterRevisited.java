package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/letter-revisited.html
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LetterRevisited {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter("output.txt");
            out.print("+---------------------------------------------------------++\n"+
                    "|                                                    #### |\n"+
                    "|                                                    #### |\n"+
                    "|                                                    #### |\n"+
                    "|                                                         |\n"+
                    "|                                                         |\n"+
                    "|                              Robert Szasz               |\n"+
                    "|                              1 River Way                |\n"+
                    "|                              Something, NJ 400006       |\n"+
                    "|                                                         |\n"+
                    "+---------------------------------------------------------+\n");


            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
