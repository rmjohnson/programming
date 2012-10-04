package blackjack;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Deck {

    private Card[] deck;
    private int topIndex;

    public Deck() {
        deck = this.stockDeck();
        topIndex = 0;
    }

    public Card[] stockDeck() {
        Card[] stockDeck = new Card[52];
        for (int i = 1; i <= 4; i++) { //Loop through suits
            for (int j = 1; j <= 13; j++) {
                if (j <= 10) {
                    stockDeck[j + ((i - 1) * 13) - 1] = new Card(j, 0, i);
                } else {
                    stockDeck[j + ((i - 1) * 13) - 1] = new Card(10, j - 10, i);
                }
            }
        }
        return stockDeck;
    }

    public void shuffle() {
        for (int i = 0; i < 1000; i++) {
            int randomIndex1 = (int) (Math.random() * 52);
            int randomIndex2 = (int) (Math.random() * 52);
            Card tmpcard = this.deck[randomIndex1];
            this.deck[randomIndex1] = this.deck[randomIndex2];
            this.deck[randomIndex2] = tmpcard;
        }
        topIndex = 0;
    }

    public void deal(Player player) {
        Card[] hand = new Card[2];
        System.arraycopy(deck, topIndex, hand, 0, 2);
        player.setHand(hand);
        topIndex += 2;
    }

    public void hit(Player player) {
        Card[] oldHand = player.getHand();
        Card[] newHand = new Card[oldHand.length + 1];
        System.arraycopy(oldHand, 0, newHand, 0, oldHand.length);
        System.arraycopy(deck, topIndex, newHand, oldHand.length, 1);
        player.setHand(newHand);
        topIndex++;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < deck.length; i++) {
            output += deck[i].toString() + "\n";
        }
        return output;
    }
}
