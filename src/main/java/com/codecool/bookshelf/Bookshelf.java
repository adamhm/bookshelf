package com.codecool.bookshelf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bookshelf {
    private List<Book> bookList = new ArrayList<>();
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    public List<Book> getBooks(int year) {
        return bookList.stream().filter(book -> book.getReleaseYear() == year).collect(Collectors.toList());
    }
    
    public String getLightestAuthor() {
        return bookList.stream()
            .min(Comparator.comparing(Book::weightInGram))
            .map(Book::getAuthor).orElse(null);
    }
    
    public String getAuthorOfMostWrittenPages() {
        // Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek a nevét,
        // aki a legtöbb oldalt írta.
        return bookList.stream()
            .max(Comparator.comparing(Book::getNumberOfPages))
            .map(Book::getAuthor).orElse(null);
    }
    
    // Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát.
    // Soronként kiírja a könyvek getBookInfo() visszatérési értékét
    public void printBooks() {
        bookList.stream().map(Book::getBookInfo).forEach(System.out::println);
    }
    
}
