/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minecraft_world;

/**
 *
 * @author Ryan
 */
public class Minecraft_World {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Block[][][] map = new Block[40][30][10];
        Block.Mineral[] minerals = Block.Mineral.values();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                for (int k = 0; k < map[i][j].length; k++) {
                    map[i][j][k] = new Block(minerals[(int)(Math.random()*minerals.length)]);
                    System.out.print(map[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

class Block {
    public enum Mineral {SAND, DIRT, GRAVEL, COBBLE, IRON, REDSTONE, GOLD}
    public final Mineral mineral;

    public Block(Mineral mineral) {
        this.mineral = mineral;
    }

    @Override
    public String toString() {
        return mineral+" ";
    }
    
    
}