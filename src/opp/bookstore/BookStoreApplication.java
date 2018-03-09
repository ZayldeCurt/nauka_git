package opp.bookstore;

public class BookStoreApplication {
    public static void main(String[] args) {
        Book book1 = new Book("w pustyni i w puszczy",new Author("Henryk","Sienkiewicz","Polski"));

        BookStoreUI bookStoreUI = new BookStoreUI();

        System.out.println(book1.toString());

    }

}
