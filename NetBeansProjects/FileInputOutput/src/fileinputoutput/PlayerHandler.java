package fileinputoutput;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class PlayerHandler {

    public static void main(String[] args) {
        try {
//            ObjectOutputStream ofout = new ObjectOutputStream(
//                    new FileOutputStream("players.obj"));
              Player[] players = new Player[10];
//            for (int i = 0; i < players.length; i++) {
//                players[i] = new Player(i + "", (int) (Math.random() * 10000000));
//                System.out.println(players[i]);
//            }
//            
//            ofout.writeObject(players);
//            ofout.close();
            
            ObjectInputStream ofin = new ObjectInputStream(
                    new FileInputStream("players.obj"));
            players = (Player[])(ofin.readObject());
            for (Player player : players) {
                System.out.println(player);
            }
        } catch (Exception ex) {
            Logger.getLogger(PlayerHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
