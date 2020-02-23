package lesson12;

import java.util.Date;

public class Iphone11 {

    public String color;

    public Iphone11(String color) {
        this.color = color;
    }

    public static void printUTCTime(){
        System.out.println(new Date());
    }
}
