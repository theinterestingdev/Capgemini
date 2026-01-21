package EcommercePlatform;

public class Groceries extends Product implements Taxable {
    private boolean perishable;

    public Groceries(int productID, String name, double price, boolean perishable) {
        super(productID, name, price);
        this.perishable = perishable;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public double calculateDiscount() {
        return perishable ? getPrice() * 0.05 : getPrice() * 0.02;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: " + calculateTax());
    }
}
