package com.sales;

public class ProductSales 
{
    private String productId;
    private double totalRevenue;
    
    public ProductSales(String productId, double totalRevenue) 
    {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }
    
    public String getProductId() 
    {
        return productId;
    }
    
    public double getTotalRevenue() 
    {
        return totalRevenue;
    }
    
    @Override
    public String toString() 
    {
        return "ProductSales{productId='" + productId + "', totalRevenue=" + String.format("%.2f", totalRevenue) + "}";
    }
}
