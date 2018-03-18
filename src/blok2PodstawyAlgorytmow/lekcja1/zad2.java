package blok2PodstawyAlgorytmow.lekcja1;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        int[] tabInt = {12,3,54,14};

//        System.out.println(findMinimum(tabInt));
//        System.out.println(findMaximum(tabInt));
        System.out.println(findExtremum(tabInt,false));
        System.out.println(findExtremum(tabInt,true));
    }
    public static int findExtremum(int[] tab, boolean min)
    {
        int tempEx=tab[0];
        if(min)
        {
            for (int i = 1; i < tab.length; i++) {
                if(tempEx>tab[i]){
                    tempEx=tab[i];
                }
            }
        }
        else
        {
            int tempMax=tab[0];
            for (int i = 1; i < tab.length; i++) {
                if(tempEx<tab[i]){
                    tempEx=tab[i];
                }
            }
        }
        return tempEx;
    }


    public static int findMinimum(int[] tab) {
        int tempMin=tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tempMin>tab[i]){
                tempMin=tab[i];
            }
        }
        return tempMin;
    }
    public static int findMaximum(int[] tab) {
        int tempMax=tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tempMax<tab[i]){
                tempMax=tab[i];
            }
        }
        return tempMax;
    }

}
