package com.codecool.bookshelf;

import java.time.LocalDate;

public abstract class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int numberOfPages;
    
    public Book(String title, String author, int releaseYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public abstract int weightInGram();
    
    public String getBookInfo() {
        return String.format("%s: %s (%s)", author, title, releaseYear);
    }
}
