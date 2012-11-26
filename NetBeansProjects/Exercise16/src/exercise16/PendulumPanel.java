/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise16;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Ryan
 */
public class PendulumPanel extends JPanel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        x = (int) (getWidth() / 2 + 50 * Math.sin(xd * (2 * Math.PI / 60)));
        y = (int) (50 - 50 * Math.cos(yd * (2 * Math.PI / 60)));
        if(y <= 60) {
            y = 60;
            speed*=-1;
        }
        yd += speed;
        xd += speed;
        repaint();
    }
    int x, y, yd, xd, radius, speed, resumeSpeed;
    Timer timer = new Timer(50, this);

    public PendulumPanel() {
        setPreferredSize(new Dimension(300, 300));
        setSize(300, 300);
        setBackground(Color.blue);
        x = (int) (getWidth() / 2 + 50 * Math.sin(xd * (2 * Math.PI / 60)));
        y = (int) (50 - 50 * Math.cos(yd * (2 * Math.PI / 60)));
        yd = 80;
        xd = 80;
        speed = 1;
        resumeSpeed = 1;
        radius = 10;
        timer.start();
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if(speed < 8 && speed > -8) {
                        if(speed < 0)
                            speed--;
                        else
                            speed++;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if(speed <= 8 && speed >= -8) {
                        if(speed < 0) {
                            if(speed != -1) {
                                speed++;
                            }
                        } else {
                            if(speed != 1) {
                                speed--;
                            }
                        }
                    }
                } else if(e.getKeyChar() == 's') {
                    resumeSpeed = speed;
                    speed = 0;
                } else if(e.getKeyChar() == 'r') {
                    speed = resumeSpeed;
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(getWidth() / 2 + 3, 50 + 3, x + radius, y + radius);
        g.fillOval(x, y, radius * 2, radius * 2);
        g.fillOval(getWidth() / 2, 50, 6, 6);
    }
}
