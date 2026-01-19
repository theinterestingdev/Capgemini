package VehicleManagement;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(getModel() + " is charging...");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Electric Vehicle ===");
        super.displayInfo();
    }
}
