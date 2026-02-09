package com.sales;

public class Sale 
{
    private String productId;
    private int quantity;
    private double price;
    
    public Sale(String productId, int quantity, double price) 
    {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getProductId() 
    {
        return productId;
    }
    
    public int getQuantity() 
    {
        return quantity;
    }
    
    public double getPrice() 
    {
        return price;
    }
    
    @Override
    public String toString() 
    {
        return "Sale{productId='" + productId + "', quantity=" + quantity + ", price=" + price + "}";
    }
}
