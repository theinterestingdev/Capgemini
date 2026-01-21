package RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("CAR-500", "Nina", 12, "Downtown"));
        rides.add(new Bike("BIK-600", "Raj", 8, "Uptown"));
        rides.add(new Auto("AUT-700", "Leo", 10, "Station"));

        double distance = 15;
        for (Vehicle vehicle : rides) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Location: " + gps.getCurrentLocation());
                gps.updateLocation("City Center");
                System.out.println("Updated: " + gps.getCurrentLocation());
            }
            System.out.println("---");
        }
    }
}
