package hw1;

public class Horse extends Vehicle implements RideAble {

    public Horse(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }

    @Override
    public int milesPerHour() {
        return 0;
    }
}
