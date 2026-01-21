package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR-101", 80, 15));
        vehicles.add(new Bike("BIKE-202", 40, 5));
        vehicles.add(new Truck("TRK-303", 150, 25));

        int days = 5;
        for (Vehicle vehicle : vehicles) {
            vehicle.showDetails();
            double rentalCost = vehicle.calculateRentalCost(days);
            double insurance = 0;
            if (vehicle instanceof Insurable) {
                Insurable cover = (Insurable) vehicle;
                insurance = cover.calculateInsurance();
                System.out.println(cover.getInsuranceDetails());
            }
            System.out.println("Rental for " + days + " days: " + rentalCost);
            System.out.println("Total with insurance: " + (rentalCost + insurance));
            System.out.println("---");
        }
    }
}
