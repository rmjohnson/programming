package artproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 *Class: Computer Science II
 * Assignment: Exercise 11.6
 * @author Ryan Johnson
 * Date of Last Modification: 2/26/2012
 * Description: A pretty smile face.
 */
public class ArtProject extends JFrame {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArtProject frame = new ArtProject();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyCanvas canvas = new MyCanvas();        
        frame.add(canvas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class MyCanvas extends JPanel {
    public MyCanvas() {
        setPreferredSize(new Dimension(640,480));
        setBackground(Color.DARK_GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(220, 140, 200, 200);
        g.setColor(Color.black);
        g.fillOval(270, 180, 40, 40);
        g.fillOval(335, 180, 40, 40);
        //g.setColor(Color.orange);
        for (int i = 0; i < 10; i++) {
            g.drawArc(225, 200+i, 200, 100, 220, 100);
        }
        
        
        g.drawString("Ryan Johnson", 555, 475);
    }
    
    
}