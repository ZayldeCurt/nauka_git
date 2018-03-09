package opp.bookstore;

import javax.swing.*;
import java.awt.*;

public class BookStoreUI extends baseUI{

//    private JFrame frame;
//    private JPanel mainPanel;
    private JLabel bookResult;
    private JLabel authorkResult;
    private JButton addButtonBook;
    private JButton addButtonAuthor;

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

        addButtonAuthor = new JButton("dodaj authora");
        addButtonAuthor.setMinimumSize(new Dimension(20, 20));
        addButtonAuthor.setPreferredSize(new Dimension(120, 60));
        addButtonAuthor.setMinimumSize(new Dimension(120,60));

        addButtonBook = new JButton("dodaj ksiazke");
        addButtonBook.setMinimumSize(new Dimension(20, 20));
        addButtonBook.setPreferredSize(new Dimension(120, 60));
        addButtonBook.setMinimumSize(new Dimension(120,60));


        northPanel.add(addButtonAuthor);
        northPanel.add(addButtonBook);
        centralPanel.setLayout(new FlowLayout());
        centralPanel.add(bookResult);
        centralPanel.add(authorkResult);


        init();

    }
}
