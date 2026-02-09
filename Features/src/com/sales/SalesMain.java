package com.sales;

import java.util.Arrays;
import java.util.List;

public class SalesMain 
{
    public static void main(String[] args) 
    {
        List<Sale> sales = Arrays.asList(
            new Sale("P001", 15, 29.99),
            new Sale("P002", 8, 49.99),
            new Sale("P003", 25, 19.99),
            new Sale("P004", 12, 39.99),
            new Sale("P005", 30, 9.99),
            new Sale("P006", 5, 99.99),
            new Sale("P007", 20, 24.99),
            new Sale("P008", 18, 34.99)
        );
        
        SalesAnalyzer analyzer = new SalesAnalyzer();
        List<ProductSales> topProducts = analyzer.analyzeSales(sales);
        
        System.out.println("Top 5 products by revenue:");
        topProducts.forEach(product -> System.out.println(product));
    }
}
