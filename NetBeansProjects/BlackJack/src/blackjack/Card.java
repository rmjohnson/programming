package blackjack;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ryan
 */
public class Card {
    private int value, face, suit;
    private ImageIcon imageIcon;
    private Image image;

    public Card(int value, int face, int suit) {
        if(value == 1) {
            this.value = 11;
        } else {
            this.value = value;
        }
        this.face = face;
        this.suit = suit;
        if(face != 0) {
            switch(face) {
                case 1:
                    this.imageIcon = new ImageIcon("cards/jack" + getSuitName(this.suit).toLowerCase() + ".png");
                    break;
                case 2:
                    this.imageIcon = new ImageIcon("cards/queen" + getSuitName(this.suit).toLowerCase() + ".png");
                    break;
                case 3:
                    this.imageIcon = new ImageIcon("cards/king" + getSuitName(this.suit).toLowerCase() + ".png");
                    break;
            }
        } else {
            this.imageIcon = new ImageIcon("cards/" + this.value + getSuitName(this.suit).toLowerCase() + ".png");
        }
        this.image = this.imageIcon.getImage();
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        String stringValue = "fail";
        String stringSuit = "fail";
        if(face != 0) {
            switch(face) {
                case 1:
                    stringValue = "Jack";break;
                case 2:
                    stringValue = "Queen";break;
                case 3:
                    stringValue = "King";break;
            }
        } else {
            switch(value) {
                case 1:
                    stringValue = "Ace";break;
                case 2:
                    stringValue = "Two";break;
                case 3:
                    stringValue = "Three";break;
                case 4:
                    stringValue = "Four";break;
                case 5:
                    stringValue = "Five";break;
                case 6:
                    stringValue = "Six";break;
                case 7:
                    stringValue = "Seven";break;
                case 8:
                    stringValue = "Eight";break;
                case 9:
                    stringValue = "Nine";break;
                case 10:
                    stringValue = "Ten";break;
            }
        }
        return stringValue + " of " + getSuitName(suit);
    }
    public String getSuitName(int suit) {
        String stringSuit = "";
        switch(suit) {
            case 1:
                stringSuit = "Hearts";break;
            case 2:
                stringSuit = "Diamonds";break;
            case 3:
                stringSuit = "Clubs";break;
            case 4:
                stringSuit = "Spades";break;
        }
        return stringSuit;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }
    
}
