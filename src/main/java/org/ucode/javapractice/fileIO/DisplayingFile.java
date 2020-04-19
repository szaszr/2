package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/displaying-a-file.html
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayingFile {
    public static void main(String[] args) {
        System.out.print("Open which file: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        read(input);

    }

    public static void read (String fileName){
        try {
            File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\" + fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
