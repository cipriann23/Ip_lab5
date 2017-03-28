package angrybirds;

import java.util.ArrayList;
import java.util.Vector;

public class GameState {

    private static GameState instance = null;

    protected GameState() {
    }

    public static GameState getInstance() {
        if (instance == null) {
            System.out.println("Created first GameState");
            instance = new GameState();
            return instance;
        }
        System.out.println("Getting existing GameState");
        return instance;
    }
    public int score;
    public ArrayList<Pig> pigs;
    public ArrayList<Bird> birds;
    public int level;
    public Slingshot slingshot;
    public ArrayList<Block> blocks;
    public int frameCtr;

    public int maxFrameHeight;
    public int maxFrameWidth;

    public Vector myPig;
    public Vector myBird;
    public Vector myBlock;
    public Vector mySlingshot;

    public void nextFrame() {
        for (Bird b : birds) {
            for (Pig p : pigs) {
                if (b.posX == p.posX && b.posY == p.posY) {
                    p.health -= b.damage;
                    if (p.health == 0) {
                        p.die();
                        pigs.remove(p);
                    }
                }
            }
        }

    }
}
