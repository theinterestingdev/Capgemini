public class LibraryBook {

    String title;
    String author;
    int price;
    static int availability;

    public LibraryBook(String title,String author,int price,int availability)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        LibraryBook.availability = availability;
    }

    public void borrowBook()
    {
        if(availability>0)
        {
            availability = availability-1;
            System.out.println("Book borrowed successfully");
        }
        else
        {
            System.out.println("No Books available");
        }
    }

    public void displayDetails()
    {
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book Price : "+price);
        System.out.println("Book Copies : "+availability);
        System.out.println("===================================================");
    }


    public static void main(String[] args) {

        LibraryBook libraryBook = new LibraryBook("ABC","XYZ",600,3);
        libraryBook.borrowBook();
        libraryBook.borrowBook();
        libraryBook.displayDetails();
        libraryBook.borrowBook();
        libraryBook.borrowBook();
        libraryBook.displayDetails();

    }


}

