package angrybirds;

import java.util.ArrayList;
import java.util.Vector;

public class GameState {

    private static GameState instance = null;

   
    protected GameState(int maxFrameHeight, int maxFrameWidth) {
        this.maxFrameHeight = maxFrameHeight;
        this.maxFrameWidth = maxFrameWidth;
    }

    public static GameState getInstance(int maxHeight, int maxWidth) {
        if (instance == null) {
            System.out.println("Created first GameState");
            instance = new GameState(maxHeight,maxWidth);
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
    public int frameCtr=0;

    public int maxFrameHeight;
    public int maxFrameWidth;


    public void nextFrame() {
        frameCtr=frameCtr+1;
        for(Bird b: birds) b.computeNextState();
        for(Pig p :pigs) p.computeNextState();
        for(Block bl : blocks) bl.computeNextState();
        for (Bird b : birds) {
            for (Pig p : pigs) {
                if (b.posX == p.posX && b.posY == p.posY) {
                    p.health -= b.damage;
                    if (p.health < 0) {
                        p.die();
                        pigs.remove(p);
                    }
                }
            }
        }

    }
    
    
}
