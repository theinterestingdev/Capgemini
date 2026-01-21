package RideHailingApplication;

public class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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
