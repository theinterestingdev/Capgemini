public class Vehicle {

    String ownerName;
    String vehicleType;
    private static double registrationFee = 3000;

    public Vehicle(String ownerName,String vehicleType)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;

    }

    private void displayVehicleDetails()
    {
        System.out.println("Owner name : "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Registration Fee : "+registrationFee);
        System.out.println("================================================");
    }

    private void updateRegistrationFees(double registrationFee)
    {
        Vehicle.registrationFee = registrationFee;
        System.out.println("================================================");
        System.out.println("Updated Registration Fees Successfully");
        System.out.println("================================================");
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Kartik","Sedan");
        Vehicle vehicle1 = new Vehicle("Kartik","SUV");

        vehicle.displayVehicleDetails();
        vehicle.updateRegistrationFees(5000);
        vehicle1.displayVehicleDetails();


    }




}
