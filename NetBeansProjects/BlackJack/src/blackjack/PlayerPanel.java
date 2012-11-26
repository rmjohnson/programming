package blackjack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class PlayerPanel extends JPanel {

    private Player player;
    private JPanel buttonPanel;
    private CardPanel cardPanel;
    private JLabel nameLabel;
    private JPanel namePanel;

    public PlayerPanel(final Player player) {
        if (!player.isDealer()) {
            setPreferredSize(new Dimension(200, 400));
            setLayout(new BorderLayout());
        } else {
            setPreferredSize(new Dimension(200, 200));
            setLayout(new BorderLayout());
        }

        this.player = player;

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JButton hitButton = new JButton("Hit");
        JButton stayButton = new JButton("Stay");
        buttonPanel.add(hitButton);
        buttonPanel.add(stayButton);

        namePanel = new JPanel(new FlowLayout());
        namePanel.setPreferredSize(new Dimension(200, 50));
        
        cardPanel = new CardPanel();


        hitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BlackJack.getDeck().hit(player);
            }
        });
        stayButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                while (BlackJack.getDealer().getHandValue() < 17) {
                    BlackJack.getDeck().hit(BlackJack.getDealer());
                }
                BlackJack.getDealer().setShowAll(true);
                BlackJack.getDealer().setHand(BlackJack.getDealer().getHand());
                if (player.getHandValue() > BlackJack.getDealer().getHandValue() || BlackJack.getDealer().getHandValue() > 21) {
                    Object[] options = {"Exit Game", "Restart Game"};
                    int userInput = player.getAlert().showOptionDialog(player.getPanel(), "You win! =D", "WINNER!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
                    if (userInput == JOptionPane.YES_OPTION) { //Exit game
                        System.exit(0);
                    } else { //Restart game
                        BlackJack.getFrame().setVisible(false);
                        BlackJack.getFrame().dispose();
                        BlackJack.newGame();
                    }
                } else {
                    Object[] options = {"Exit Game", "Restart Game"};
                    int userInput = player.getAlert().showOptionDialog(player.getPanel(), "You lose! =(", "LOSER!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
                    if (userInput == JOptionPane.YES_OPTION) { //Exit game
                        System.exit(0);
                    } else { //Restart game
                        BlackJack.getFrame().setVisible(false);
                        BlackJack.getFrame().dispose();
                        BlackJack.newGame();
                    }
                }
            }
        });
        add(namePanel, BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);
        if (!player.isDealer()) {
            add(buttonPanel, BorderLayout.SOUTH);
        }
    }

    public CardPanel getCardPanel() {
        return cardPanel;
    }

    public void setCardPanel(CardPanel cardPanel) {
        this.cardPanel = cardPanel;
    }

    public JPanel getNamePanel() {
        return namePanel;
    }
}
