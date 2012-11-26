package blackjack;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class CardPanel extends JPanel {

    private JLabel[] hand;
    
    public CardPanel() {
        setPreferredSize(new Dimension(125, 100));
        setLayout(new GridLayout());
    }
    
}
