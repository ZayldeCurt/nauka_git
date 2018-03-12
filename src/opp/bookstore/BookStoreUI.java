package opp.bookstore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookStoreUI extends baseUI{

//    private JFrame frame;
//    private JPanel mainPanel;
    private JLabel bookResult;
    private JLabel authorkResult;
    private JButton addButtonBook;
    private JButton addButtonAuthor;
    private JButton showButton;
    Set<Book> dictionary= new HashSet<>();;

    Book book1 = new Book("w pustyni i w puszczy",new Author("Henryk","Sienkiewicz","Polski"));
    Book booktemp = new Book("Oko jelenia", new Author("Andrzej","Pilipiuk","Polski"));
    public BookStoreUI( Set<Book> dictionary)
    {
        this();
        this.dictionary.addAll(dictionary);
        String something = "something";
        //TODO znajdowanie książek w kolekcji???
    }

    public BookStoreUI() {
        super();
        bookResult = new JLabel("book",SwingConstants.CENTER);
        bookResult.setMinimumSize(new Dimension(20, 20));
        bookResult.setPreferredSize(new Dimension(100,60));
        bookResult.setMinimumSize(new Dimension(100,60));

        authorkResult = new JLabel("author",SwingConstants.CENTER);
        authorkResult.setMinimumSize(new Dimension(20, 20));
        authorkResult.setPreferredSize(new Dimension(100,60));
        authorkResult.setMinimumSize(new Dimension(100,60));

        addButtonAuthor = new JButton("add authora");
        addButtonAuthor.setMinimumSize(new Dimension(20, 20));
        addButtonAuthor.setPreferredSize(new Dimension(120, 60));
        addButtonAuthor.setMinimumSize(new Dimension(120,60));

        addButtonBook = new JButton("add book");
        addButtonBook.setMinimumSize(new Dimension(20, 20));
        addButtonBook.setPreferredSize(new Dimension(120, 60));
        addButtonBook.setMinimumSize(new Dimension(120,60));

        showButton = new JButton("show last book");
        showButton.setMinimumSize(new Dimension(20, 20));
        showButton.setPreferredSize(new Dimension(120, 60));
        showButton.setMinimumSize(new Dimension(120,60));

        northPanel.add(addButtonAuthor);
        northPanel.add(addButtonBook);
        northPanel.add(showButton);
        centralPanel.setLayout(new FlowLayout());
        centralPanel.add(bookResult);
        centralPanel.add(authorkResult);


        init();


        showButton.addActionListener(this::showLastBook);

    }
    public void showLastBook(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            bookResult.setText(book1.getTitle());
            authorkResult.setText(book1.getAuthor().getLastName());

//            bookResult.setText(dictionary[1].getTitle());
//            authorkResult.setText(dictionary[1].getAuthor().getLastName());
        }
    }
}
