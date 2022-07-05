package oca.aufgabe01d;

import utils.InputHelper;
import java.time.LocalDate;

public class Book {
    private String title;
    private final Isbn isbn;
    private LocalDate datum;
    private String author;
    private int anzahlSeiten;

    public Book(String titel, String isbn, String author, int anzahlSeiten) {
        this.title = titel;
        this.isbn = new Isbn(isbn);
//        this.datum = datum;
        this.author = author;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitle() { return title; }

    public static Book getBookFromUserInput() {

        String titel = InputHelper.readString("Input titel");
        String isbn = InputHelper.readString("Input isbn");
//        LocalDate date = InputHelper.readDate("Input date yyyyMMdd where y -year, M -month, d -day zB 20201121");
        String author = InputHelper.readString("Input author");
        int numberOfPages = InputHelper.readInt("Input number of pages");

        return new Book(titel, isbn, author, numberOfPages);
    }



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

    public void updateField(String readString) {
        while (true){
            switch (InputHelper.readString(readString)){
                case "1":
                    this.title = InputHelper.readString("Input title");
                    break;
                case "2":
                    this.isbn.isbn = InputHelper.readString("Input ISDN");
                    break;
                case "3":
                    this.datum = InputHelper.readDate("Input Date in yyyyMMdd -format");
                    break;
                case "4":
                    this.author = InputHelper.readString("Input author");
                    break;
                case "5":
                    this.anzahlSeiten = InputHelper.readInt("Input number of seites");
                    break;
                case "0":
                    return;
            }
        }
    }

    private class Isbn {
        private String isbn;

        public Isbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return isbn;
        }
    }
}
