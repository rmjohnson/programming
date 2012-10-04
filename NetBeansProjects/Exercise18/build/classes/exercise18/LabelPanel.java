package exercise18;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class LabelPanel extends JPanel {

    public LabelPanel() {
        setPreferredSize(new Dimension(300, 20));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hour", 75, 12);
        g.drawString("Minute", 130, 12);
        g.drawString("Second", 180, 12);
    }
    
}
