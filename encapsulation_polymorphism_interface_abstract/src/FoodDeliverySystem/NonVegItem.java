package FoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {
    private double discountApplied;
    private double nonVegCharge;

    public NonVegItem(String itemName, double price, int quantity, double nonVegCharge) {
        super(itemName, price, quantity);
        setNonVegCharge(nonVegCharge);
    }

    public void setNonVegCharge(double nonVegCharge) {
        if (nonVegCharge >= 0) {
            this.nonVegCharge = nonVegCharge;
        }
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + nonVegCharge - discountApplied;
    }

    @Override
    public double applyDiscount(double percent) {
        discountApplied = getPrice() * getQuantity() * (percent / 100);
        return discountApplied;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountApplied + ", Extra: " + nonVegCharge;
    }
}
