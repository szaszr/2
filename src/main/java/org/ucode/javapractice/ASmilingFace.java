import java.awt.*;
import javax.swing.JFrame;

/*
http://www.programmingbydoing.com/a/gfx-smiling-face.html
 */

public class ASmilingFace extends Canvas{
    public void paint (Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 100, 100);

        g.setColor(Color.blue);
        g.fillOval(125,125,20,20);

        g.setColor(Color.blue);
        g.fillOval(155,125,20,20);

        g.setColor(Color.red);
        g.drawArc(125, 125, 60, 60, 225, 90);


        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

    }

    public static void main( String[] args ) {
        JFrame win = new JFrame("A Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ASmilingFace canvas = new ASmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}
