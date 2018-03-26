package blok2PodstawyAlgorytmow.sortowania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] tab = {7,4,3,5,8,2,3};
        List<Integer> list = new ArrayList<>(Arrays.asList(7,4,3,5,8,2,3));
        for (int i = 0; i < 20; i++) {
          list.add(ThreadLocalRandom.current().nextInt(100));
        }
//        System.out.println(Arrays.toString(tab));
//        quickSort(tab,0,tab.length-1);
//        System.out.println(Arrays.toString(tab));

        System.out.println(list);
        quickSort(list,0,list.size()-1);
        System.out.println(list);

    }
    public static void quickSort( Integer[] tab,int left, int right){

        int pivotIndex = (left+right)/2;
        int pivot = tab[pivotIndex];
        tab[pivotIndex]=tab[right];
        tab[right]=pivot;

        int j=left;
        for (int i = left; i < right; i++) {
            if(tab[i]<pivot){
                int temp = tab[i];
                tab[i]=tab[j];
                tab[j]=temp;
                j++;
            }
        }
        tab[right]=tab[j];
        tab[j]=pivot;

        if(left<j-1){
            quickSort(tab,left,j-1);
        }
        if(j+1<right){
            quickSort(tab,j+1,right);
        }
    }

    public static void quickSort( List<Integer> tab,int left, int right){

        int pivotIndex = (left+right)/2;
        int pivot= tab.get(pivotIndex);
        tab.set(pivotIndex,tab.get(right));
        tab.set(right,pivot);


        int j=left;
        for (int i = left; i < right; i++) {
            if(tab.get(i)<pivot){
                int temp = tab.get(i);
                tab.set(i,tab.get(j));
                tab.set(j,temp);
                j++;
            }
        }
        tab.set(right,tab.get(j));
        tab.set(j,pivot);

        if(left<j-1){
            quickSort(tab,left,j-1);
        }
        if(j+1<right){
            quickSort(tab,j+1,right);
        }

    }
}
