package org.ucode.lesson12;

public interface Phone {

    void makeASound();

    String name = "interface name";

    default void call() {
        System.out.println("Making a very useful default call");
    }
}
