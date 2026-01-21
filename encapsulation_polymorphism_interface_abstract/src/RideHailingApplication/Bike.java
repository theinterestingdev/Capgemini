package RideHailingApplication;

public class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        super.updateLocation(location);
    }
}
