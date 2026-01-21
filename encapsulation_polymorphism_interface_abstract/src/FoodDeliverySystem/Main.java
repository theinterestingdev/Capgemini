package FoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Wrap", 120, 2));
        order.add(new NonVegItem("Chicken Burger", 180, 1, 30));

        for (FoodItem item : order) {
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
            }
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("---");
        }
    }
}
