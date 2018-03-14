package collections;

import opp.User;
import opp.bookstore.Author;
import opp.bookstore.Book;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
//        zad1();
//        zad2();
//        zad3();





//        Set<Integer> mySet = new HashSet<>();
//        Iterator<Integer> iterator = mySet.iterator();

zad4();


    }

    private  static void zad4(){
        //mapowanie do autorów listy książek
        Map<Author, List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("Adam","Mickiewicz"), Arrays.asList(new Book("Dziady 1",1802), new Book("Dziady 2",1800)));
//        bookstore.put(new Author("Adam","Mickiewicz"), Collections.emptyList());//to nadpisze poprzedniej linii bo w klasie Author
        //nie ma equals i hashcode (alt+insert)

        Set<Map.Entry<Author, List<Book>>> bookStoreSet = bookstore.entrySet();
        for (Map.Entry<Author,List<Book>> authorListEntry : bookStoreSet)
        {
            List<Book> books = authorListEntry.getValue();
            for(Book book: books)
            {
                if(book.getReleaseYear()>1801)
                {
                    System.out.println(book.toString());//cos nie dziala

                }

            }
        }


    }
    private static void zad3() {
        Map<Integer, User> map = new HashMap<>();
        map.put(123456, new User("szymon","nowak"));
        map.put(456789, new User("jakub","wolny"));
        map.put(258369,new User("jan","kowalski"));

        Set<Map.Entry<Integer, User>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer,User> next = iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }

//        for(Map.Entry<Integer, User> entry : entries)
//        {
//            System.out.println(entry.getKey() + ": "+entry.getValue());
//        }
    }

    private static void zad2() {
        Scanner odczyt = new Scanner(System.in);
        odczyt = new Scanner(System.in);
        System.out.println("ile chcesz wprowadzić liczb");
        int iloscliczb=odczyt.nextInt();
        int liczba;

        Set<Integer> mySet = new HashSet<>();
        System.out.println("podaj nastepna liczbe liczbe");
        for (int i = 0; i < iloscliczb; i++) {

            while(!odczyt.hasNextInt())
            {
                System.out.println("zle, jeszcze raz:");
                odczyt = new Scanner(System.in);
            }
            liczba=odczyt.nextInt();
            mySet.add(liczba);
        }
        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
//        System.out.println(mySet); // też działa ale wyżej jest zrobione wykorzystując Iterator
    }

    private static void zad1() {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(2);
        myList.add(5);
        myList.add(12);
        myList.add(6);
        myList.add(9);
        randomUnique(myList);

    }

    public static void randomUnique(List<Integer> number){
        List<Integer> tempList = new ArrayList<>(number);
        Random generator = new Random();

        for (int i = 0; i < number.size();i++) {
            int randomNumber =generator.nextInt(tempList.size());
            System.out.println(tempList.remove(randomNumber));
        }
    }
}
