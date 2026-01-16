class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 1200;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }


    double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("===============================================");
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Kartik", "Hyundai Creta", 5);
        rental1.displayDetails();
    }
}
