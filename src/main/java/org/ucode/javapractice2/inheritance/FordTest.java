package org.ucode.javapractice2.inheritance;

public class FordTest {
    public static void main(String[] args) {
       Ford ford1 = new Ford(100, 100, 100, 0, 0, 4, 4, 5, true, 0, 100);

       ford1.steer(30);
       ford1.accelerate(30);
       ford1.accelerate(20);
       ford1.accelerate(-40);
    }
}
