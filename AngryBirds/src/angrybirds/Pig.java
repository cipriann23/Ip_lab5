package angrybirds;

public class Pig extends PhysicsObject {

    public int health;

    public Pig(int h) {
        health = h;
    }

    public void die() {
        System.out.println("Pig of health " + health + " died.");
    }

}
