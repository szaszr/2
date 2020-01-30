import java.awt.*;
import javax.swing.JFrame;

/*
http://www.programmingbydoing.com/a/gfx-circle.html
 */

public class ACircle extends Canvas{
    public void paint (Graphics g){
        g.setColor(Color.green);
        g.fillOval(200, 200, 200, 200);

    }
    public static void main( String[] args )
    {
        JFrame win = new JFrame("A Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ACircle canvas = new ACircle();
        win.add( canvas );
        win.setVisible(true);
    }
}
