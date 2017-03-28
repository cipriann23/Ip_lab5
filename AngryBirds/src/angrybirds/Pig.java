package angrybirds;

public class Pig extends PhysicsObject {

    public int health;
    
    public Pig( int xPos, int yPos,int h) {
        super(xPos, yPos);
        health = h;
    }

    public String die() {
        
        return ("Pig of health " + health + " died.");
    }

}
