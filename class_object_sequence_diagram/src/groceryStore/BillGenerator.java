package groceryStore;
public class BillGenerator {


    public void generateBill(Customer customer)
    {
        double total = 0;

        for(Product p : customer.products)
        {
            total += p.quantity * p.pricePerUnit;
        }

        System.out.println("Total Bill : "+total);

    }

}
