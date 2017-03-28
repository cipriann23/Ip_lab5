package angrybirds;

public class Pig extends PhysicsObject {

    public int health;
    
    public Pig(int h, int xPos, int yPos) {
        super(xPos, yPos);
        health = h;
    }

    public void die() {
        System.out.println("Pig of health " + health + " died.");
    }

}
