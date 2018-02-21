import java.util.Scanner;
import java.util.Arrays;

public class triangle_ui {

    public static void main(String[] args) {

        triangle trojkat = new triangle();
        double[] boki = new double[2];


        trojkat.PobierzBok();

        trojkat.CheckDefault();


 /*       if(trojkat.Sprawdz_Czy_Prostokatny())
        {
            System.out.println("jest prostokatny");
        }
        else
        {
            System.out.println("nie jest prostokatny");
        }
*/
    }
}
