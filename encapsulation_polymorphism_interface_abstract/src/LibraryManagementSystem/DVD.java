package LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
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
