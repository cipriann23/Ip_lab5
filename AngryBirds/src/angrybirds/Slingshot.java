package angrybirds;

public class Slingshot {

    public float posX;
    public float posY;

    public boolean launch(int x, int y, Bird bird) {

        float dist = (float)((x - this.posX) * (x - this.posX) + (y - this.posY) * (y - this.posY));
        if (dist > 10) {
            return false;
        } else {
            bird.vX = (float) (x - posX);
            bird.vY = (float) (y - posY);
        }
        return true;
    }

}
