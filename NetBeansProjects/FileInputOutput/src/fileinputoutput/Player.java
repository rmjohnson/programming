package fileinputoutput;

import java.io.Serializable;

/**
 *
 * @author Ryan
 */
public class Player implements Serializable{
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\tScore: "+score;
    }
 
}
