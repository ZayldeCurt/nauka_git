package collections;

import opp.User;
import opp.bookstore.Book;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsTestApp {
    public static void main(String[] args) {
        //List
//        arrayList();
//        LinkedList();
        //różnice między arrayList i LinkedList
        //arraylist ma na początku w środku tablica o rozmiarze 10, jeśli przepełnimy to tworzona jest 2 razy większa i tak znowu dwa razy większa
        //usuwanie, tworzy nawą tablicę bez usuniętego elementu

        //linkedlist nie ma w środku tablicy, działa na zasadzie listy dwukierunkowej
        // element wie gdzie jest następny element i poprzedni

        //Queue nie tłumaczył za bardzo, tylko popierznie o koleljkach FIFO i LIFO
        //???????


        //Set
//        HashSet();

        //Map
        //klucze musza byc unikalne, jelsi zostanie dodany drugi o tym samym kluczu to nadpisze
        Map<String, User> map = new HashMap<>();
        map.put("123456789", new User("szymon","nowak"));
        map.put("123456710", new User("jakub","wolny"));
        map.put("1236",new User("jan","kowalski"));
        User userR = map.remove("1236");
        User user1 = map.get("1236");

        Set<Map.Entry<String, User>> entries = map.entrySet();
        for(Map.Entry<String, User> entry : entries)
        {
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }



    }

    private static void HashSet() {
        Set<String> test= new HashSet<>();
        Random generator = new Random();
        Set<Integer> uniqeNumbers= new HashSet<>();
        while(uniqeNumbers.size()<10)
        {
            uniqeNumbers.add(generator.nextInt(10));
            System.out.println(uniqeNumbers);
        }
    }

    private static void showLongestElement(List<String> lista)
    {
        List<String> text = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 50; i++) {
            if(i%2==0)
            {
                text.add("krowka "+i+generator.nextInt(50));
            }
            else
            {
                text.add("łabądek "+i);
            }
        }

        String temp="";
        for(String value:lista)
        {
            if(value.length()>temp.length())
            {
                temp=value;
                System.out.println(temp);

            }
        }
        System.out.println(temp);

    }

    private static void LinkedList() {
        List<String> names = new LinkedList<>();
        names.add("Jan");
        names.add("Mateusz");
        names.add("Weronika");

        System.out.println(names);
        names.add(1,"Marta");
        System.out.println(names);

        for(String value:names) {
            System.out.println(value);
        }
    }

    private static void arrayList() {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Mateusz");
        names.add("Weronika");

        System.out.println(names);
        names.add(1,"Marta");
        System.out.println(names);

        for(String value:names) {
            System.out.println(value);
        }
        //names.for //skrót intelliJ
    }


    private static <T> void showArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
