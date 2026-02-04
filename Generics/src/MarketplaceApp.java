import java.util.*;

abstract class Category {
    abstract String getCategoryName();
}

class BookCategory extends Category {
    String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory extends Category {
    String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory extends Category {
    String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * percentage / 100;
    }

    public void display() {
        System.out.println(name + " - " + category.getCategoryName() + " - " + price);
    }
}

public class MarketplaceApp {
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<GadgetCategory> gadget =
                new Product<>("Smart Watch", 2000, new GadgetCategory());

        applyDiscount(book, 10);
        applyDiscount(gadget, 20);

        book.display();
        gadget.display();
    }
}
