package hw1;

public class VehicleApp {

    public static void printVehiclesNameAndPrices(Vehicle [] vehicles) {
        for (int i = 0; i < vehicles.length; i++)
            System.out.println(vehicles[i].getName() + " " + vehicles[i].getPrice());
    }
        public static void getSpeedOfRideableObjects(RideAble[] rideAbles) {
            for(int i = 0; i < rideAbles.length; i++ )
                System.out.println(rideAbles[i].milesPerHour());
        }

}
