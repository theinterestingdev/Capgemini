package EcommercePlatform;

public class Clothing extends Product implements Taxable{

    public Clothing(int productID,String name,double price)
    {
        super(productID,name,price);
    }

    public double calculateDiscount(){
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax()
    {
        return 0.18*getPrice();
    }

    @Override
    public void getTaxDetails()
    {
        System.out.println("Tax: " + calculateTax());
    }




}
