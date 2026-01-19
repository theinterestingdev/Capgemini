package VehicleManagement;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is being refueled with petrol");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Petrol Vehicle ===");
        super.displayInfo();
    }
}
