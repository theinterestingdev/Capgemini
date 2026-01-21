package FoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {
    private double discountApplied;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discountApplied;
    }

    @Override
    public double applyDiscount(double percent) {
        discountApplied = getPrice() * getQuantity() * (percent / 100);
        return discountApplied;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountApplied;
    }
}
