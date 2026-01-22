package groceryStore;
import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void checkout() {
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(this);
    }
}
