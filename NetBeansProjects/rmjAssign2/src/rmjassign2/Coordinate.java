package rmjassign2;

/**
 *
 * @author Ryan
 * A coordinate class to store (x,y) coordinates into an object. Fairly
 * self-explanatory.
 */
public class Coordinate {
    int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
