package EcommercePlatform;

public class Electronics extends Product implements Taxable {
    private int warrantyMonths;

    public Electronics(int productID, String name, double price, int warrantyMonths) {
        super(productID, name, price);
        setWarrantyMonths(warrantyMonths);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths >= 0) {
            this.warrantyMonths = warrantyMonths;
        }
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: " + calculateTax());
    }
}
