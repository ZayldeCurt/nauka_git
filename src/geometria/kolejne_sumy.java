package geometria;

import java.util.Scanner;

public class kolejne_sumy {

    public static void main(String[] args)
    {
        System.out.println("podaj liczbe");
        Scanner odczyt = new Scanner(System.in);

        while(!odczyt.hasNextInt())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        int ilosc = odczyt.nextInt();
        int temp=0;
        String tekst = "";

        for (int i=0;i<=ilosc;i++)
        {
            temp+=i;


            tekst = tekst + " " + String.valueOf(temp);

            if(i % 2 == 0)
            {
                System.out.println(tekst);
            }

        }


    }
}
