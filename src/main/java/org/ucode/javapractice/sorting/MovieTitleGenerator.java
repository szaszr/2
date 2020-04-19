package org.ucode.javapractice.sorting;

/*
http://www.programmingbydoing.com/a/movie-title-gen.html
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MovieTitleGenerator {
    public static void main(String[] args) throws Exception {
        String[] adjectives = arrayFromFile("adjectives.txt");
        String[] nouns      = arrayFromFile("nouns.txt");

        System.out.println("Mitchell's Random Movie Title Generator\n");

        System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
        System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");



        String adjective = adjectives[(int) (Math.random() * adjectives.length)];
        String noun = nouns[(int) (Math.random() * nouns.length)];

        System.out.println( "Your movie title is: " + adjective + " " + noun );
}
    public static String[] arrayFromFile( String fileName ) throws Exception
    {
        File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\"+fileName);
        Scanner fin = new Scanner(file);
        int count =0;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\"+fileName));
        while (br.readLine() != null) {
            count++;
        }

        String[] wordsArray = new String[count];

        for ( int i=0; i<wordsArray.length; i++ )
        {
            wordsArray[i] = fin.next();
        }
        fin.close();

        return wordsArray;
    }
}
