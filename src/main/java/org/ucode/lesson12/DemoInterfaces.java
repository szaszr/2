package org.ucode.lesson12;

public class DemoInterfaces {

    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
//        iphoneX.makeASound();
//        iphoneX.call();
//
//        MobilePhone.answer();

        Iphone11 blackIphone11 = new Iphone11("black");

        System.out.println(blackIphone11.color);

        Iphone11 greenIphone11 = new Iphone11("green");
        System.out.println(greenIphone11.color);
        System.out.println(blackIphone11.color);

        Iphone11.printUTCTime();


    }

    public void notStatic(){

    }
}
