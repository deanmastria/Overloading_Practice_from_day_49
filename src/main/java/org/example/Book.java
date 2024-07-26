package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor with all parameters
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Overloaded constructor with only the title
    public Book(String title) {
        this.title = title;
        this.numberOfPages = 0; // Default value
        this.publicationYear = 0; // Default value
    }

    // Overloaded constructor with no parameters
    public Book() {
        this.title = "Unknown"; // Default value
        this.numberOfPages = 0; // Default value
        this.publicationYear = 0; // Default value
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + numberOfPages + ", Year: " + publicationYear;
    }
}

