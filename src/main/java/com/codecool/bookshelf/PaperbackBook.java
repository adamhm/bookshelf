package com.codecool.bookshelf;

public class PaperbackBook extends Book {
    private final int COVER_WEIGHT = 20;
    private final int PAGE_WEIGHT = 10;
    
    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages);
    }
    
    @Override
    public int weightInGram() {
        return COVER_WEIGHT + PAGE_WEIGHT * getNumberOfPages();
    }
}
