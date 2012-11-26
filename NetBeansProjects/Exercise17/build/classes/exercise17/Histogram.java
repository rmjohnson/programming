package exercise17;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class Histogram extends JPanel {

    private int[] count;

    public void showHistogram(int[] count) {
        this.count = count;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (count == null) {
            return;
        }
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int interval = (width - 40) / count.length;
        int individualWidth = (int) (((width - 40) / 24) * 0.60);

        int maxCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
            }
        }

        int x = 30;
        Color[] colors = {Color.BLACK, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.WHITE};
        int colorIndex = 0;
        g.drawLine(10, height - 30, width - 10, height - 30);
        for (int i = 0; i < count.length; i++) {
            int barHeight = (int) (((double) count[i] / (double) maxCount) * (height - 55));
            
            g.setColor(Color.black);
            g.drawString((char) (65 + i) + "", x + 3, height - 35 - barHeight); 
            
            g.setColor(colors[colorIndex]);
            if(colorIndex < colors.length-1)
                colorIndex++;
            else
                colorIndex = 0;
            g.fillRect(x, height - 30 - barHeight, individualWidth, barHeight);
            x += interval;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 300);
    }
}
