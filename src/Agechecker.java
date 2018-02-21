import java.util.Scanner;

public class Agechecker {
    public static void main(String[] args) {

        int Age;
        while(true)
        {
            System.out.println("podaj wiek:");
            Scanner odczyt = new Scanner(System.in);
            while(!odczyt.hasNextInt())
            {
                System.out.println("to nie jest wiek, jeszcze raz:");
                odczyt = new Scanner(System.in);
            }
            Age= odczyt.nextInt();

            if(Age<6)
            {
                System.out.println("przedszkole");
            }
            else if (Age < 12)
            {
                System.out.println("podstawowka");
            }
            else if (Age < 16)
            {
                System.out.println("gimnazjum");
            }
            else if (Age < 20)
            {
                System.out.println("srednia");
            }
            else
            {
                System.out.println("starosc");
            }
        }


    }


}
