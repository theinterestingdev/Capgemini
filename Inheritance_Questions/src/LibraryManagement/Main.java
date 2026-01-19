package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(
            "The Great Novel",
            2023,
            "John Smith",
            "Award-winning author with 20 years of experience"
        );
        author.displayInfo();
    }
}
