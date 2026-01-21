package RideHailingApplication;

public class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9;
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
