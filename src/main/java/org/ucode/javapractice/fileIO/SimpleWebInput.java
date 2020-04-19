package org.ucode.javapractice.fileIO;

/*
http://www.programmingbydoing.com/a/simple-web-input.html
 */

import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput {
    public static void main(String[] args) throws Exception {
        URL mcool = new URL("http://www.programmingbydoing.com/a/simple-web-input.html");
        Scanner webIn = new Scanner(mcool.openStream());


        while (webIn.hasNextLine()) {
            System.out.println(webIn.nextLine());
        }


        webIn.close();
    }
}
