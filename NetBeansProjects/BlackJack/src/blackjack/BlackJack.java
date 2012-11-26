package blackjack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Ryan
 */
public class BlackJack extends JFrame implements ActionListener{
    
    private static Deck deck;
    private Timer timer;
    private static Player player1, dealer;
    private static BlackJack frame;

    public BlackJack() throws HeadlessException {
        setTitle("BlackJack");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        setLayout(new BorderLayout());
        timer = new Timer(200, this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        this.revalidate();    
    }
    
    public static void main(String[] args) {
        newGame();
    }

    public static Deck getDeck() {
        return deck;
    }
    
    public static void newGame() {
        frame = new BlackJack();
        
        frame.timer.restart();
        
        deck = new Deck();
        deck.shuffle();
        
        player1 = new Player("Player", false);
        dealer = new Player("Dealer", true);
        deck.deal(player1);
        deck.deal(dealer);
        
        frame.add(player1.getPanel());
        frame.add(dealer.getPanel(), BorderLayout.NORTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static BlackJack getFrame() {
        return frame;
    }

    public static Player getDealer() {
        return dealer;
    }
    
    
}
