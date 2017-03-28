package angrybirds;

import java.util.Vector;

public class Bird extends PhysicsObject {

    public Bird(int xPos, int yPos, int damage) {
        super(xPos, yPos);
        this.damage = damage;
    }
    public String color;
    public String power;
    public int damage;

}
