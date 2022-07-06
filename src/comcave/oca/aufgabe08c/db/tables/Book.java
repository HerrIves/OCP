package oca.aufgabe08c.db.tables;

public class Book {
    private String title;
    private String isbn;
    private String author;

    public double getPrice() {
        return price;
    }

    private double price;

    public Book(String titel, String isbn, String author) {
        this.title = titel;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() { return title; }


    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + title + '\'' +
                ", isbn=" + isbn +
                ", author='" + author + '\'' +
                '}';
    }
}
