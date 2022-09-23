package hw1;

public class RollerCoaster implements RideAble {
    private double price;
    private float speed;

    public RollerCoaster(double price, float speed) {
        this.price = price;
        this.speed = speed;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    private final double tax = 0.20;

    @Override
    public int milesPerHour() {
        return (int) this.speed;
    }
}
