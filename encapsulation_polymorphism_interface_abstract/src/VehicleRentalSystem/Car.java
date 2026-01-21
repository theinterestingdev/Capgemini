package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    private double insuranceRate;

    public Car(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        setInsuranceRate(insuranceRate);
    }

    public void setInsuranceRate(double insuranceRate) {
        if (insuranceRate >= 0) {
            this.insuranceRate = insuranceRate;
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
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
