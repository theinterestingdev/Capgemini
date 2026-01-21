package FoodDeliverySystem;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    protected FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if (itemName != null && !itemName.isBlank()) {
            this.itemName = itemName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " @ " + price);
    }

    public abstract double calculateTotalPrice();
}
