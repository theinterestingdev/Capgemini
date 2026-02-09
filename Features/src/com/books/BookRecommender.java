package com.books;

import java.util.*;
import java.util.stream.Collectors;

public class BookRecommender 
{
    public List<BookRecommendation> getRecommendations(List<Book> books, int page) 
    {
        int booksPerPage = 5;
        int startIndex = (page - 1) * booksPerPage;
        
        List<BookRecommendation> allRecommendations = books.stream()
            .filter(book -> "Science Fiction".equals(book.getGenre()) && book.getRating() > 4.0)
            .map(book -> new BookRecommendation(book.getTitle(), book.getRating()))
            .sorted(Comparator.comparing(BookRecommendation::getRating).reversed())
            .limit(10)
            .collect(Collectors.toList());
        
        return allRecommendations.stream()
            .skip(startIndex)
            .limit(booksPerPage)
            .collect(Collectors.toList());
    }
}
