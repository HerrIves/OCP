package oca.aufgabe08c;


import oca.aufgabe08c.db.tables.Book;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class MainController {
    static MainController mainController;

    public MainController() {
        this.bookList_lv = new ListView<Book>();
    }

    @FXML
private ListView<Book> bookList_lv;
    @FXML
    private TextField title_tf;
    @FXML
    private TextField verlag_tf;
    @FXML
    private TextField ISBN_tf;
    @FXML
    private TextField autor_tf;
    @FXML
    private TextField ersch_tf;
    @FXML
    void onCreateButton(){
        String title = title_tf.getText();
        String isbn = ISBN_tf.getText();;
        String author = autor_tf.getText();
        Book book = new Book(title, isbn, author);


    }

    @FXML
    void onReadButton(){

        Book book = BookService.read();
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList_lv.getItems().setAll(bookList);
    }

    @FXML
    void onUpdateButton(){
        System.out.println("onUpdateButton");
    }

    @FXML
    void onDeleteButton(){
        System.out.println("onDeleteButton");
    }

    static MainController getMainController(){
        if (mainController == null) mainController = new MainController();
        return mainController;
    }




}