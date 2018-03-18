package blok2PodstawyAlgorytmow.lekcja1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] tab = inputString.split(" ");
        int[] tabInt = new int[tab.length];
        for (int i = 0; i < tab.length - 1; i++) {
            tabInt[i]=Integer.valueOf(tab[i]);
        }
        showSecondElement(tabInt);
    }


    public static void showSecondElement(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if(i%2==0){
                System.out.println(tab[i]);
            }
        }
    }
    public static void showSecondElement(String[] tab){
        for (int i = 0; i < tab.length; i++) {
            if(i%2==0){
                System.out.println(tab[i]);
            }
        }
    }
}
