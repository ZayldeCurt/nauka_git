package blok2PodstawyAlgorytmow.sortowania;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
//        Integer[] tab = {8,5,4,9,2,6};
        Integer[] tab = {7,3,8,5,2};

        System.out.println(Arrays.asList(tab));
        insertSortSecond(tab);
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
    public static void insertSortString(String[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                char[] chars = array[j].toLowerCase().toCharArray();
                char[] chars2 = array[j - 1].toLowerCase().toCharArray();
                int k = 0;
                do {
                    if (chars[k] < chars2[k]) {
                        String temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        break;
                    } else if (chars[k] == chars2[k]) {
                        if (k == Math.min(chars.length, chars2.length) -1 && chars.length<chars2.length) {
                            String temp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = temp;
                            break;
                        }
                        k++;
                    } else {
                        break;
                    }
                }
                while (k < Math.min(chars.length, chars2.length));
            }
        }
    }

    public static void insertSortSecond(Integer[] tab){
        int size = tab.length;
        int temp ;
        for (int i = size-2; i >=0; i--) {
            temp=tab[i];
            int j=i;
            while(j<size-1&&temp>tab[j+1]){
                tab[j]=tab[j+1];
                tab[j+1]=temp;
                j++;
            }
        }


    }

}
