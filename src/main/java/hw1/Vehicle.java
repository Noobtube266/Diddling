package hw1;

public abstract class Vehicle extends Product{

    private int qty;
    private double price;
    private float speed;

    public Engine engine;
    public Vehicle(String name, int qty, double price, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }
    public Vehicle(String name, int qty, double price, float speed, Engine engine) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.engine = engine;

    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public float getSpeed() {
        return speed;
    }

    public double getTax() {
        return tax;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private final double tax = 0.15;

    public double totalBeforeTax(Vehicle vehicle){
    return qty * price;
    }

    public double calcTax(){
    return price * qty * tax;
    }

    public abstract void totalAfterTax(Vehicle vehicle);
}
