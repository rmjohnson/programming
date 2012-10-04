package exercise18;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class NumPanel extends JPanel {
    
    private String message;

    public NumPanel(String message) {
        this.message = message;
        setBackground(Color.white);
        setPreferredSize(new Dimension(50,30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Default", 0, 24));
        g.drawString(message, 12, getHeight()-5);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
