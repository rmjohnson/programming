package blackjack;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Player {

    private boolean dealer;
    private Card[] hand;
    private int handValue;
    private PlayerPanel panel;
    private String name;
    private JOptionPane alert;
    private Boolean showAll;

    public Player(String name, boolean dealer) {
        this.name = name;
        this.dealer = dealer;
        this.hand = new Card[0];
        this.handValue = 0;
        this.panel = new PlayerPanel(this);
        this.showAll = false;
        this.alert = new JOptionPane();
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
        
        handValue = 0;
        for (int i = 0; i < hand.length; i++) {
            handValue += hand[i].getValue();
        }
        for (int i = 0; i < hand.length; i++) {
            if((hand[i].getValue() == 11) && (handValue > 21)) {
                handValue -= 10;
            }  
        }
        
        
        panel.getNamePanel().removeAll();
        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        JLabel handValueLabel;
        if (dealer && !showAll) {
            handValueLabel = new JLabel("- Current Hand Value: ?");
        } else {
            handValueLabel = new JLabel("- Current Hand Value: " + handValue);
        }
        handValueLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        panel.getNamePanel().add(nameLabel);
        panel.getNamePanel().add(handValueLabel);

        panel.getCardPanel().removeAll();

        ImageIcon[] handImageIcons = new ImageIcon[getHandStringArray().length];
        for (int i = 0; i < hand.length; i++) {
            if (dealer && i == 0 && !showAll) {
                JLabel tmpCard = new JLabel(new ImageIcon("cards/back.png"));
                tmpCard.setPreferredSize(new Dimension(37, 50));
                panel.getCardPanel().add(tmpCard);
            } else {
                handImageIcons[i] = hand[i].getImageIcon();
                JLabel tmpCard = new JLabel(handImageIcons[i]);
                tmpCard.setPreferredSize(new Dimension(37, 50));
                panel.getCardPanel().add(tmpCard);
            }
        }

        if (handValue > 21 && !dealer) {
            Object[] options = {"Exit Game", "Restart Game"};
            int userInput = alert.showOptionDialog(panel, "Unfortunately, you have busted. =(", "BUST!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
            if (userInput == JOptionPane.NO_OPTION) { //Restart game
                BlackJack.getFrame().setVisible(false);
                BlackJack.getFrame().dispose();
                BlackJack.newGame();
            } else { //Exit game
                System.exit(0);
            }
        }

    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public boolean isDealer() {
        return dealer;
    }

    public String[] getHandStringArray() {
        String[] stringArray = new String[hand.length];
        for (int i = 0; i < hand.length; i++) {
            stringArray[i] = hand[i].toString();
        }
        return stringArray;
    }

    public PlayerPanel getPanel() {
        return panel;
    }

    public String getName() {
        return name;
    }

    public JOptionPane getAlert() {
        return alert;
    }

    public void setShowAll(Boolean showAll) {
        this.showAll = showAll;
    }

    public Boolean getShowAll() {
        return showAll;
    }
}
