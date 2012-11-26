/*
 * Playing the "Let's Make a Deal!" game.
 */
package makeadeal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class MakeADeal {
    
    static JPanel doorPanel = new JPanel();
    static JPanel labelPanel = new JPanel();
    static JPanel messagePanel = new JPanel();

    static JButton door1 = new JButton("Door #1");
    static JButton door2 = new JButton("Door #2");
    static JButton door3 = new JButton("Door #3");

    static JLabel label1 = new JLabel("Closed");
    static JLabel label2 = new JLabel("Closed");
    static JLabel label3 = new JLabel("Closed");

    static JLabel instruction = new JLabel("Select a door.");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Make a Deal!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        doorPanel.setPreferredSize(new Dimension(300,50));
        labelPanel.setPreferredSize(new Dimension(300,50));
        messagePanel.setPreferredSize(new Dimension(300,50));
        
        // fill in the panels
        doorPanel.add(door1, FlowLayout.LEFT);
        doorPanel.add(door2, FlowLayout.CENTER);
        doorPanel.add(door3, FlowLayout.RIGHT);
        
        labelPanel.add(label1, FlowLayout.LEFT);
        labelPanel.add(label2, FlowLayout.CENTER);
        labelPanel.add(label3, FlowLayout.RIGHT);
        
        messagePanel.add(instruction, BorderLayout.CENTER);
        
        // Add button listeners
        
        door1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                label1.setText("Selected");
                instruction.setText("Door #1 selected.");
            }
        });
        
        frame.add(doorPanel, BorderLayout.NORTH);
        frame.add(labelPanel, BorderLayout.CENTER);
        frame.add(messagePanel, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
