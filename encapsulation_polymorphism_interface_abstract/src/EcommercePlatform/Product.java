package EcommercePlatform;

abstract public class Product {

    private final int productID;
    private String name;
    private double price;

    public Product(int productID,String name,double price) {
        this.productID = productID;
        setName(name);
        setPrice(price);
    }


    public double getPrice()
    {
        return price;
    }

    public int getProductID() {
        return productID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setPrice(double price)
    {
        if(price>0)
        {
            this.price = price;
        }
    }

    public abstract double calculateDiscount();




}
