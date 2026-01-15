class CartItem {
    String itemName;
    double price;
    int quantity;


    public void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item added to cart");
    }


    public void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart");
    }


    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Total Cost: ₹" + totalCost);
    }


    public static void main(String[] args) {
        CartItem item = new CartItem();

        item.addItem("Mobile Phone", 15000, 2);
        item.addItem("Mobile", 25000, 1);
        item.displayTotalCost();

    }
}
