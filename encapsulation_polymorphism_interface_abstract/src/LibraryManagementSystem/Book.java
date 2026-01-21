package LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public boolean reserveItem(String borrower) {
        if (!reserved) {
            setBorrower(borrower);
            reserved = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
