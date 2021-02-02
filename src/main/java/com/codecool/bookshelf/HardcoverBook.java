package com.codecool.bookshelf;

public class HardcoverBook extends Book {
    private final int COVER_WEIGHT = 100;
    private final int PAGE_WEIGHT = 10;
    
    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages);
    }
    
    @Override
    public int weightInGram() {
        return COVER_WEIGHT + PAGE_WEIGHT * getNumberOfPages();
    }
}
