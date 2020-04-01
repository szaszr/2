package org.ucode.javapractice.graphics;

import java.awt.*;
import javax.swing.JFrame;

/*
http://www.programmingbydoing.com/a/gfx-clock-face.html
 */

public class AClockFace extends Canvas {
    public void paint (Graphics g){
        g.setColor(Color.black);
        g.drawArc(200, 200, 200, 200, 0, 360);

        g.drawLine(300, 300, 325, 275);
        g.drawLine(300, 300, 250, 250);

        g.drawString("12", 290, 225);
        g.drawString("3", 375, 310);
        g.drawString("6", 290, 375);
        g.drawString("9", 225, 310);

    }

    public static void main( String[] args ) {
        JFrame win = new JFrame("A Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AClockFace canvas = new AClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
}
