public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    private static String escapeJson(String s) {
        if (s == null) {
            return "";
        }
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    public String toJson() {
        return "{" +
                "\"brand\":\"" + escapeJson(brand) + "\"," +
                "\"model\":\"" + escapeJson(model) + "\"," +
                "\"year\":" + year + "," +
                "\"price\":" + price +
                "}";
    }
}
