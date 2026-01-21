package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {
    private double insuranceRate;

    public Bike(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Bike", rentalRate);
        setInsuranceRate(insuranceRate);
    }

    public void setInsuranceRate(double insuranceRate) {
        if (insuranceRate >= 0) {
            this.insuranceRate = insuranceRate;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
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
