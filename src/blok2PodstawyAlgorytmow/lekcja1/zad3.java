package blok2PodstawyAlgorytmow.lekcja1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zad3 {
    public static void main(String[] args) {
        Integer[] tabInt = {1,2,2,2,1,6,2,3,2,2,2};

            printLeader(tabInt);

    }
    public static void printLeader(Integer[] tab){
        Map<Integer, Integer> vector = new HashMap<>();
        for (int i = 0; i < tab.length; i++) {
            Integer key = tab[i];
            Integer value = vector.get(key);
            if(value!=null){
                value++;
                vector.put(key,value);
            }
            else{
                vector.put(key,1);
            }
        }
//        System.out.println("koniec");
        int temp=0;
        int tempIndex=0;
        for (Map.Entry<Integer, Integer> vectorEntry : vector.entrySet()) {
            if(temp<vectorEntry.getValue())
            {
                temp=vectorEntry.getValue();
                tempIndex= vectorEntry.getKey();
                if(temp>tab.length/2) {
                    System.out.println("Liczba "+tempIndex+ " wystapila "+temp+" razy i jest w więcej niż w połowie elementów");
                    break;
                }
            }
        }




    }
}
