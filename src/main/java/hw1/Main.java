package hw1;

public class Main {
    public static <RollarCoaster> void main(String[] args) {

        Engine engine = new Engine(4);
        Car car = new Car("Hweels",4,200.0,80, engine);
        Truck truck = new Truck("Tank", 2, 300.0, 60, engine);
        Bike bike = new Bike("Zoomer", 1, 50.0, 20);
        Horse horse = new Horse("Dog", 1, 100.0,75);
        RideAble rollerCoaster = new RollerCoaster(210, 100);
        Vehicle[] vehicles = {car, truck, bike, horse };
        RideAble[] rideAbles = {bike, horse, rollerCoaster};

        VehicleApp.printVehiclesNameAndPrices(vehicles);
        VehicleApp.getSpeedOfRideableObjects(rideAbles);
        for(Vehicle i: vehicles){
            i.totalAfterTax(vehicles[3]);
        }

    }
}
