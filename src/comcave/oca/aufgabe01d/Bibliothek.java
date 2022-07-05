package oca.aufgabe01d;

import utils.InputHelper;

import java.util.ArrayList;


public class Bibliothek {
    ArrayList<Book> bookList;

    public Bibliothek() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void startBibliothek() {
        while (true) {
            String choose =
                    "\nChoose option:\n"
                            + "1 display a list of books\n"
                            + "2 Add Book\n"
                            + "3 Find Book\n"
                            + "4 Delete Book\n"
                            + "5 Update Book\n"
                            + "0 exit\n";

            switch (InputHelper.readString(choose)) {
                case "1":
                    printBookList(bookList);
                    break;
                case "2":
                    addBook(Book.getBookFromUserInput(), bookList);
                    break;
                case "3":
                    findBookByTitle(InputHelper.readString("Input Title"));
                    break;
                case "4":
                    deleteBook();
                    break;
                case "5":
                    updateBook();
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }

    public void printBookList(ArrayList<Book> books) {
        System.out.println(books.size() == 0 ? "No Books yet" :
                books.size() + "\n" + "N° ====================================================================================");

        for (Book book : books) {
            System.out.println((books.indexOf(book) + 1) + " " + book);
        }
    }

    public void addBook(Book book, ArrayList<Book> books) {

        int emptySpace = findEmptySpace(books);
        if (emptySpace == -1) {
            books.add(book);
            return;
            //    books = Arrays.copyOf(books, books.size() + 1);
        }
        books.add(emptySpace, book);
    }

    public Bibliothek findBookByTitle(String request) {
        Bibliothek foundBooks = new Bibliothek();

        for (Book book : bookList) {
            if (book.getTitle().equals(request))
                foundBooks.addBook(book, foundBooks.bookList);
        }
        printBookList(foundBooks.bookList);

        return foundBooks;
    }

    public void deleteBook() {
        printBookList(bookList);
        int index = InputHelper.readInt("choose book number for delete");
        bookList.remove(index - 1);
        System.out.println("Book successfully deleted");
    }

    private void updateBook() {
        //printBookList(bookList);

        Book book = findBookByTitle(InputHelper.readString("Input title"))
        .bookList.get(InputHelper.readInt("Input number of Book")-1);


        book.updateField("Which Field do you want to update? \n"
                                                +"1 - name, 2 - isbn, 3 - date, 4 - author, 5 - number of pages");


    }


    int findEmptySpace(ArrayList<Book> books) {
        int emptySpace;

        for (emptySpace = 0; emptySpace < books.size(); emptySpace++) {
            if (books.get(emptySpace) == null)
                return emptySpace;
        }
        return -1;
    }
}

