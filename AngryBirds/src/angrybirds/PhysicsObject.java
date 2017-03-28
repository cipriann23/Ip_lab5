package angrybirds;

public class PhysicsObject {

    public float posX;

    public PhysicsObject(float posX, float posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public PhysicsObject(float posX, float posY, int weight, int width, int height) {
        this.posX = posX;
        this.posY = posY;
        this.weight = weight;
        this.width = width;
        this.height = height;
    }

    public PhysicsObject(int weight, int width) {
        this.weight = weight;
        this.width = width;
    }

    public float posY;

    public int weight;

    public int width;

    public int height;

    public float vX;

    public float vY;

    private float angle;

    public void computeNextState() {
        this.posX += this.vX;
        this.posY += this.vY;

    }

    /**
     * @return the angle
     */
    public float getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getDensity() {
        return this.weight / (this.width * this.height);
    }

}
