package opp.bookstore;

import javax.swing.*;
import java.awt.*;

public class baseUI {

    protected JFrame frame;
    protected JPanel mainPanel;
    protected JPanel northPanel;
    protected JPanel centralPanel;



    public baseUI() {

        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());


        frame = new JFrame("Bookstore");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void init()
    {
        mainPanel.add(northPanel,BorderLayout.NORTH);
        mainPanel.add(centralPanel,BorderLayout.CENTER);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
