package com.sales;

import java.util.*;
import java.util.stream.Collectors;

public class SalesAnalyzer 
{
    public List<ProductSales> analyzeSales(List<Sale> sales) 
    {
        Map<String, Double> revenueMap = sales.stream()
            .filter(sale -> sale.getQuantity() > 10)
            .collect(Collectors.groupingBy(
                Sale::getProductId,
                Collectors.summingDouble(sale -> sale.getQuantity() * sale.getPrice())
            ));
        
        return revenueMap.entrySet().stream()
            .map(entry -> new ProductSales(entry.getKey(), entry.getValue()))
            .sorted(Comparator.comparing(ProductSales::getTotalRevenue).reversed())
            .limit(5)
            .collect(Collectors.toList());
    }
}
