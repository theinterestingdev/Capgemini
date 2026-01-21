package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
    private double insuranceRate;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        setInsuranceRate(insuranceRate);
    }

    public void setInsuranceRate(double insuranceRate) {
        if (insuranceRate >= 0) {
            this.insuranceRate = insuranceRate;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: " + insuranceRate;
    }
}
