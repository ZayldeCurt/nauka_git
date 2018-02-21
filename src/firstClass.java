import java.util.Scanner;


public class firstClass
{

    public static void main(String[] args)
    {
        int wynik;
        while(true)
        {
            System.out.println("MENU");
            System.out.println("1-dodawanie 2-odejmowanie 3-mnozenie 4-dzieleni");
            Scanner odczyt = new Scanner(System.in);

            String wynikS = odczyt.nextLine();
            wynik = Integer.parseInt(wynikS);

            System.out.println(wynik);

            switch (wynik)
            {
                case 1:
                {
                    System.out.println("dowanie");
                    dodawanie();
                    break;
                }
                case 2:
                {
                    System.out.println("odejmowanie");
                    odejmowanie();
                    break;
                }
                case 3:
                {
                    System.out.println("mnożenie");
                    mnozenie();
                    break;
                }
                case 4:
                {
                    System.out.println("dzielenie");
                    dzielenie();
                    break;
                }
                default:
                {
                    System.out.println("you have one job");
                }

            }
        }

    }


    static int[] pobierzWartosci2()
    {
        int[] wynik = new int[2];

        System.out.println("podaj liczbe");
        Scanner odczyt = new Scanner(System.in);

        while(!odczyt.hasNextInt())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        wynik[0] = odczyt.nextInt();

        System.out.println("podaj liczbe");

        odczyt = new Scanner(System.in);
        while(!odczyt.hasNextInt())
        {
            System.out.println("zle, jeszcze raz:");
            odczyt = new Scanner(System.in);
        }
        wynik[1] = odczyt.nextInt();

        return wynik;
    }


    static void dodawanie()
    {
        int[] wynikA = pobierzWartosci2();
        System.out.println(String.format("Wynik to %d",wynikA[0]+wynikA[1]));
    }

    static void odejmowanie()
    {
        int[] wynikA = pobierzWartosci2();
        System.out.println(String.format("Wynik to %d",wynikA[0]-wynikA[1]));
    }

    static void mnozenie()
    {
        int[] wynikA = pobierzWartosci2();
        System.out.println(String.format("Wynik to %f",wynikA[0]*(double)wynikA[1]));
    }

    static void dzielenie()
    {
        int[] wynikA = pobierzWartosci2();

        while(wynikA[1]==0)
        {
            System.out.println("Nie można dzielić prze 0, podaj dzielnik jeszcze raz:");
            Scanner odczyt = new Scanner(System.in);
            wynikA[1] = odczyt.nextInt();
        }
        System.out.println(String.format("Wynik to %f",wynikA[0]/(double)wynikA[1]));
    }

}
