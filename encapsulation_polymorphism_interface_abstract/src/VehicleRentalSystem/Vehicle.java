package VehicleRentalSystem;

abstract class Vehicle {
    private final String vehicleNumber;
    private String type;
    private double rentalRate;

    protected Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        setType(type);
        setRentalRate(rentalRate);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isBlank()) {
            this.type = type;
        }
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        }
    }

    public abstract double calculateRentalCost(int days);

    public void showDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate per day: " + rentalRate);
    }
}
