public class CarToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 28500.50);
        String json = car.toJson();

        System.out.println("Car object converted to JSON:");
        System.out.println(json);
    }
}
