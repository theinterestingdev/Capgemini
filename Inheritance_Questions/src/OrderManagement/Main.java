package OrderManagement;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ORD001", "2024-01-15");
        ShippedOrder order2 = new ShippedOrder("ORD002", "2024-01-16", "TRK123456");
        DeliveredOrder order3 = new DeliveredOrder("ORD003", "2024-01-17", "TRK789012", "2024-01-20");

        System.out.println("Order 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
        System.out.println("Order 3 Status: " + order3.getOrderStatus());
    }
}
