package blok2PodstawyAlgorytmow.sortowania;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {

        Integer[] tab = {1,10,3,4,9,8,7,6,5};
//        bubbleSort(tab,false);
        bubbleSortSecond(tab);
        System.out.println(Arrays.asList(tab));
    }

    public static void bubbleSort(Integer tab[],boolean param){
        boolean isSorted = true;
        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j < tab.length-1; j++) {
                isSorted = false;
                if(param){
                    if(tab[j]>tab[j+1]) {
                        int temp=tab[j+1];
                        tab[j+1]=tab[j];
                        tab[j]=temp;
                    }
                }
                else{
                    if(tab[j]<tab[j+1]) {
                        int temp=tab[j+1];
                        tab[j+1]=tab[j];
                        tab[j]=temp;
                    }
                }
                if(isSorted){
                    break;
                }
                isSorted = true;

            }
        }



    }

    public static void bubbleSortSecond(Integer tab[]){
        for (int i = 0; i <tab.length-1; i++) {
            for (int j = 0; j < tab.length-1; j++) {
                int temp = tab[j];
                if (temp < tab[j + 1]) {
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

}
