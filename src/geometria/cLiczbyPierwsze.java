package geometria;

import java.util.Scanner;

public class cLiczbyPierwsze {

    public static void main(String[] args) {

        int PrimaryNumberCandidate=13;
//        System.out.println("ile bokow chcesz wpisac?");
//        Scanner odczyt = new Scanner(System.in);
//        odczyt = new Scanner(System.in);
//        while(!odczyt.hasNextInt())
//        {
//            System.out.println("zle, jeszcze raz:");
//            odczyt = new Scanner(System.in);
//        }
//        PrimaryNumberCandidate=odczyt.nextInt();

        boolean flaga=true;


//            for(int i=2;i<=PrimaryNumberCandidate/2+1;i++)
//            {
        int i=2;
        while(flaga)
        {
            if(PrimaryNumberCandidate%i==0 || i>=PrimaryNumberCandidate/2)
            {
                System.out.println("liczba nie jest pierwszą");
                flaga=false;
            }
            else
            {
                System.out.println("test");
            }
            i++;
        }
        if(flaga)
        {
            System.out.println("liczba jest piewsza");
        }



    }

}
