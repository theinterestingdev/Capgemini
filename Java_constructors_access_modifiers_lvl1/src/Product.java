public class Product {

    String productName;
    double price;

    static int totalProducts;

    public Product(String productName,double price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails(){

        System.out.println("Product Name : "+productName);
        System.out.println("Product Price : "+price);
        System.out.println("=================================================");
    }

    public void displayTotalProducts()
    {
        System.out.println("Total Products : "+totalProducts);
        System.out.println("=================================================");
    }

    public static void main(String[] args) {

        Product product = new Product("Chair",5000);
        Product product1 = new Product("Crocs",4000);
        Product product2 = new Product("Lamp",3000);

        product.displayProductDetails();
        product1.displayProductDetails();
        product2.displayProductDetails();

        product.displayTotalProducts();


    }


}
