package RideHailingApplication;

abstract class Vehicle {
    private final String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    protected Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
        updateLocation(location);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        if (driverName != null && !driverName.isBlank()) {
            this.driverName = driverName;
        }
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm >= 0) {
            this.ratePerKm = ratePerKm;
        }
    }

    public String getLocation() {
        return location;
    }

    public void updateLocation(String location) {
        if (location != null && !location.isBlank()) {
            this.location = location;
        }
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId + " driven by " + driverName + " @ " + ratePerKm + " from " + location);
    }
}
