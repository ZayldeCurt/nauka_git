package geometria;

import java.util.Scanner;

public class cKolejne_sumy {

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

        String tekst = "";
        String przerwa = " ";
        int j=ilosc;

        for (int i=0 ;i<=ilosc;i++)
        {


            String tempS ="";
            for(int k=0;k<=j;k++)
            {
                tempS +=przerwa;
            }
            j--;
            tekst = tekst + " " + String.valueOf("*");

            if((i % 2)==0)
            {
                System.out.println(tempS+tekst);
            }


        }


    }
}
