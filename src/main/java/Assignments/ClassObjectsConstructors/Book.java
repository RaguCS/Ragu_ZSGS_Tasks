package Assignments.ClassObjectsConstructors;

import java.util.ArrayList;
import java.util.List;

public class Book {

    // Instance variables
    private String title;
    private String author;
    private String ISBN;
    private double price;

    // Static variable to track total books
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        totalBooks++;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    // Display details
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }

    // Function to add books and display
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Adding books using constructor
        books.add(new Book("Java Programming", "James Gosling", "123-456", 500));
        books.add(new Book("Clean Code", "Robert C. Martin", "789-012", 450));
        books.add(new Book("Effective Java", "Joshua Bloch", "345-678", 600));

        // Display all books
        System.out.println("All Books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Display total books
        System.out.println("Total Books: " + Book.getTotalBooks());
    }
}

