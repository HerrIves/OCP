package biblio.db.tables;

import java.time.LocalDate;

public class Book {
    private String title;
    private String isbn;
    private LocalDate datum;
    private String author;
    private int anzahlSeiten;

    public Book(String titel, String isbn, String author, int anzahlSeiten) {
        this.title = titel;
        this.isbn = isbn;
//        this.datum = datum;
        this.author = author;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitle() { return title; }


    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + title + '\'' +
                ", isbn=" + isbn +
                ", datum=" + datum +
                ", author='" + author + '\'' +
                ", anzahlSeiten=" + anzahlSeiten +
                '}';
    }
}
