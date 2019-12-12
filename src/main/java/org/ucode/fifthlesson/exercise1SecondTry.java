package org.ucode.fifthlesson;

import java.io.*;
import java.util.Arrays;

public class exercise1SecondTry { public static void main(String [] args) {

    // The name of the file to open.
    String fileName = "e://ex1.txt";

    // This will reference one line at a time
    String line = null;

    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader =
                new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // Always close files.
        bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
        System.out.println(
                "Unable to open file '" +
                        fileName + "'");
    }
    catch(IOException ex) {
        System.out.println(
                "Error reading file '"
                        + fileName + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    }
}
}
