import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

        int[][] tablica2d = new int[2][10];


        for(int i=0;i<=tablica2d[1].length-1;i++)
        {
            for(int j=0;j<=tablica2d.length-1;j++)
            {
                tablica2d[j][i]=(i+1)*(j+1);
            }
        }

        System.out.println(Arrays.deepToString(tablica2d));




    }
}
