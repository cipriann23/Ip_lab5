package angrybirds;

public class Pig extends PhysicsObject {

    public int health;

    public Pig(int h) {
        health = h;
    }

    public void die() {
        if(this.health<=0){
        System.out.println("Pig of health " + health + " died.");
        }
    }
    
    public void damage(Bird b){
        if(this.health>0){
            this.health=this.health-b.dmg;
        }
        
    }
}
