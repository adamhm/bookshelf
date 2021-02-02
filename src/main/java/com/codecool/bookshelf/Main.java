package com.codecool.bookshelf;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new HardcoverBook(
            "Harry Potter and the Philosopher's Stone",
            "J. K. Rowling",
            1997,
            352);
        
        Book theGreenMile = new PaperbackBook(
            "The Green Mile",
            "Stephen King",
            1996,
            400);
        
        Book theBigFour = new PaperbackBook(
          "The Big Four",
          "Agatha Christie",
          2016,
          240
        );
    
        
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(harryPotter);
        bookshelf.addBook(theGreenMile);
        bookshelf.addBook(theBigFour);
        System.out.println("Lightest Author: " + bookshelf.getLightestAuthor());
        System.out.println("Author of most written pages: "  + bookshelf.getAuthorOfMostWrittenPages());
        bookshelf.printBooks();
    }
}
