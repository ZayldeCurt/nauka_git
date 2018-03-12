package opp.bookstore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookStoreApplication {
    public static void main(String[] args) {
        Book book2 = new Book("w pustyni i w puszczy",new Author("Henryk","Sienkiewicz","Polski"));

        Set<Book> dictionary = new HashSet<Book>();
        dictionary=initDictionary(dictionary);

        BookStoreUI bookStoreUI = new BookStoreUI(dictionary);

        System.out.println(book2.toString());
    }

    public static Set<Book> initDictionary(Set<Book> dictionary) {
        dictionary.add(new Book("w pustyni i w puszczy",new Author("Henryk","Sienkiewicz","Polski")));
        dictionary.add(new Book("Wiedźmin",new Author("Andrzej","Sapkowski","Polski")));
        dictionary.add(new Book("Oko jelenia", new Author("Andrzej","Pilipiuk","Polski")));
        return dictionary;
    }

}
