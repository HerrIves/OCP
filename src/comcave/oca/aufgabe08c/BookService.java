package oca.aufgabe08c;

import oca.aufgabe08c.db.ConnectionManager;
import oca.aufgabe08c.db.DBType;
import oca.aufgabe08c.db.tables.Book;
import oca.aufgabe08c.db.tables.BookManager;

import java.sql.Connection;

public class BookService {


    public static Book read() {

        ConnectionManager.getInstance().setDbType(DBType.H2);
        Connection conn = ConnectionManager.getInstance().getConnection();
        //        BookManager.displayAllRows();
        Book book = BookManager.getRow();
        System.out.println(book);

        ConnectionManager.getInstance().close();
        return book;
    }
}
