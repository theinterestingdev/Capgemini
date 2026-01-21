package LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
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
