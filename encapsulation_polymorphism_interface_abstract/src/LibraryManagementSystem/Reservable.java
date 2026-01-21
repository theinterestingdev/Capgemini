package LibraryManagementSystem;

public interface Reservable {
    boolean reserveItem(String borrower);
    boolean checkAvailability();
}
