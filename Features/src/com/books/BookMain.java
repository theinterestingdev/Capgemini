package com.books;

import java.util.Arrays;
import java.util.List;

public class BookMain 
{
    public static void main(String[] args) 
    {
        List<Book> books = Arrays.asList(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.5),
            new Book("Neuromancer", "William Gibson", "Science Fiction", 4.2),
            new Book("1984", "George Orwell", "Science Fiction", 4.7),
            new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.3),
            new Book("The Martian", "Andy Weir", "Science Fiction", 4.6),
            new Book("Ready Player One", "Ernest Cline", "Science Fiction", 4.1),
            new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 4.4),
            new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.0),
            new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.8),
            new Book("Harry Potter", "J.K. Rowling", "Fantasy", 4.6),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 3.9),
            new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 4.7)
        );
        
        BookRecommender recommender = new BookRecommender();
        
        System.out.println("Page 1 recommendations:");
        List<BookRecommendation> page1 = recommender.getRecommendations(books, 1);
        page1.forEach(book -> System.out.println(book));
        
        System.out.println("\nPage 2 recommendations:");
        List<BookRecommendation> page2 = recommender.getRecommendations(books, 2);
        page2.forEach(book -> System.out.println(book));
    }
}
