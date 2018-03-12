package collections;

import opp.User;
import opp.bookstore.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTestApp {
    public static void main(String[] args) {
        arrayList();
        LinkedList();
        //różnice między arrayList i LinkedList
        //arraylist ma na początku w środku tablica o rozmiarze 10, jeśli przepełnimy to tworzona jest 2 razy większa i tak znowu dwa razy większa
        //usuwanie, tworzy nawą tablicę bez usuniętego elementu

        //linkedlist nie ma w środku tablicy, działa na zasadzie listy dwukierunkowej
        // element wie gdzie jest następny element i poprzedni

        //Queue nie tłumaczył za bardzo, tylko popierznie o koleljkach FIFO i LIFO
        //używa się
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
