package EcommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 1200, 24));
        products.add(new Clothing(201, "Jacket", 150));
        products.add(new Groceries(301, "Apples", 40, true));

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            if (product instanceof Taxable) {
                Taxable t = (Taxable) product;
                tax = t.calculateTax();
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println(product.getName() + " (" + product.getProductID() + ")");
            System.out.println("Price: " + product.getPrice());
            System.out.println("Tax: " + tax);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---");
        }
    }
}
