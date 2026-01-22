package groceryStore;

public class Main {

    public static void main(String[] args) {

        Customer kartik = new Customer("Kartik");
        kartik.addProduct(new Product("earbuds",2,2400));

        kartik.checkout();

    }

}
