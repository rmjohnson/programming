/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Ryan
 */
class CirclePanel extends JPanel implements ActionListener {

    private int radius;
    private Color color;
    private int x, y, yd;
    Timer timer = new Timer(100, this);

    @Override
    public void actionPerformed(ActionEvent e) {
        if(y < (getHeight()) - radius) {
            yd++;
            y+=yd;
            repaint();
        }   
    }
    
    public CirclePanel() {
        setPreferredSize(new Dimension(640, 480));
        setSize(640, 480);
        setBackground(Color.blue);
        radius = 30;
        color = Color.black;
        yd = 0;
        x = getWidth() / 2;
        y = getHeight() / 2;
        //addMouseListener(new My_MouseListener());
        addMouseMotionListener(new CirclePanel.My_MouseMoveListener());
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()=='g')
                    color = Color.green;
                else if(e.getKeyChar()=='r')
                    color = Color.red;
                else if(e.getKeyChar()=='y')
                    color = Color.yellow;
                else if(e.getKeyChar()=='o')
                    color = Color.orange;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    class My_MouseMoveListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
           if (SwingUtilities.isLeftMouseButton(e)) {
                x = e.getX();
                y = e.getY();
                yd = 0;
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }

    /*class My_MouseListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            if (e.getButton() == MouseEvent.BUTTON1) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        }
    }*/
}
