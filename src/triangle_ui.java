import java.util.Scanner;
import java.util.Arrays;

public class triangle_ui {

    public static void main(String[] args) {

        triangle trojkat = new triangle(3,4,2);
        double[] boki = new double[2];

//        boki =pobierzWartosci2();
//        trojkat.bokA=boki[0];
//        trojkat.bokB=boki[1];

 //       trojkat.oblicz_przeciwprostokatna();
 //       trojkat.oblicz_obwod();

        if(trojkat.Sprawdz_Czy_Prostokatny())
        {
            System.out.println("jest prostokatny");
        }
        else
        {
            System.out.println("nie jest");
        }

    }

    static double[] pobierzWartosci2()
    {
        double[] wynik = new double[2];

        System.out.println("podaj pierwszy bok trójkąta");
        Scanner odczyt = new Scanner(System.in);

        while(!odczyt.hasNextDouble())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        wynik[0] = odczyt.nextDouble();

        System.out.println("podaj drugi bok trójkąta");

        odczyt = new Scanner(System.in);
        while(!odczyt.hasNextDouble())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        wynik[1] = odczyt.nextDouble();

        return wynik;
    }
}
