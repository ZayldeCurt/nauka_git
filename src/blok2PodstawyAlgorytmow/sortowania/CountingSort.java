package blok2PodstawyAlgorytmow.sortowania;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        Integer[] tab =  {1,2,3,4,5,6,5,4,3,3,5,1,2,2,3,4,8,9,9,8,7,5,6,9};
        countingSort(tab);
        System.out.println(Arrays.asList(tab));
    }

    private static void countingSort(Integer[] tab) {
        int maxValue = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
            }

        }
        int[] tabValue = new int[maxValue + 1];
        for (int i = 0; i < tab.length; i++) {
            tabValue[tab[i]]++;

        }

        for (int i = 1; i < tabValue.length; i++) {
            tabValue[i] += tabValue[i - 1];

        }
        int[] result = new int[tab.length];
        for (int i = tab.length - 1; i >= 0; i--) {
            int index = tabValue[tab[i]];
            result[index - 1] = tab[i];
            tabValue[tab[i]]--;

        }
        System.out.println(Arrays.toString(result));
    }
}
