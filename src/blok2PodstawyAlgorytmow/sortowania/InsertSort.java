package blok2PodstawyAlgorytmow.sortowania;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        Integer[] tab = {8,5,4,9,2,6};
//        insertSortWhile(tab);
        System.out.println(Arrays.asList(tab));

    }

    public static void insertSort(Integer[] tab) {
        for(int i = 1; i < tab.length; i++) {
            for(int j = i; j > 0; j--) {
                if (tab[j] < tab[j - 1]) {
                    int temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }
//    private static void insertSortWhile(Integer[] tab) {
//        for(int i = 0; i < tab.length; i++) {
//            int j=i;
//            System.out.println(Arrays.asList(tab));
//            while(j>=0 &&  tab[j] < tab[j + 1] ) {
//
//                int temp = tab[j + 1];
//                tab[j + 1] = tab[j];
//                tab[j] = temp;
//                j--;
//                System.out.println(Arrays.asList(tab));
//            }
//
//        }
//    }

}
