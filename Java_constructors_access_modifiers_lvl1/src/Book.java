public class Book {

    String title;
    String author;
    double price;

    public Book()
    {
        title = "none";
        author = "none";
        price = 0;

    }

    public Book(String title,String author,double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails()
    {
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book Price : "+price);
        System.out.println("=======================================");
    }

    public static void main(String[] args) {

        Book book = new Book();
        Book book1 = new Book("XYZ","zyx",2000);

        book.displayDetails();
        book1.displayDetails();

    }






}
