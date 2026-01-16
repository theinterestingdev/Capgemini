package BookLibrarySystem;

class Book1 {

    public String ISBN;
    protected String title;
    private String author;


    public Book1(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book1 {

    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}


public class Main {
    public static void main(String[] args) {

        Book1 book = new Book1("978-12345", "Java Basics", "James Gosling");


        System.out.println("Author: " + book.getAuthor());


        book.setAuthor("Oracle Corp");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println();

        EBook ebook = new EBook("978-54321", "Advanced Java", "Herbert Schildt", 5.6);
        ebook.displayEBookDetails();
    }
}
