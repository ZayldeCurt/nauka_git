package geometria;

import java.util.Scanner;

public class cFibonacci {

    public static void main(String[] args) {

        double fibonacii=1;
        double temp=0;
        double temp2=1;
        System.out.println("podaj liczbe");
        Scanner odczyt = new Scanner(System.in);

        while(!odczyt.hasNextInt())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        int ilosc = odczyt.nextInt();

        System.out.println(fibonacii);
        for(int i=0;i<=ilosc;i++)
        {
            temp=temp2;
            temp2=fibonacii;
            fibonacii=temp+temp2;

            System.out.println(fibonacii);
        }
    }
}
