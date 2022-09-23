package hw1;

public class Bike extends Vehicle implements RideAble {

    public Bike(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle bike) {
        System.out.println(totalBeforeTax(bike) + calcTax());
    }

    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }
}
