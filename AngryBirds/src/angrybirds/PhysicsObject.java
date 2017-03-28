package angrybirds;

public class PhysicsObject {

  public float posX;

    public PhysicsObject(float posX, float posY) {
        this.posX = posX;
        this.posY = posY;
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

}