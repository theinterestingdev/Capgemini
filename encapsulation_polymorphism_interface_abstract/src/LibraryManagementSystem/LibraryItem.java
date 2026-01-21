package LibraryManagementSystem;

abstract class LibraryItem {
    private final String itemId;
    private String title;
    private String author;
    private String borrower;

    protected LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        setTitle(title);
        setAuthor(author);
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        }
    }

    public void setBorrower(String borrower) {
        if (borrower != null && !borrower.isBlank()) {
            this.borrower = borrower;
        }
    }

    public String getBorrower() {
        return borrower;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemId + " - " + title + " by " + author);
    }

    public abstract int getLoanDuration();
}
