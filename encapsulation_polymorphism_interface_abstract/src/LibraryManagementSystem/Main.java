package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B-100", "Clean Code", "Robert Martin"));
        items.add(new Magazine("M-200", "Tech Today", "Editorial"));
        items.add(new DVD("D-300", "Inception", "Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan days: " + item.getLoanDuration());
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                System.out.println("Reserve: " + r.reserveItem("User1"));
                System.out.println("Available after: " + r.checkAvailability());
            }
            System.out.println("---");
        }
    }
}
