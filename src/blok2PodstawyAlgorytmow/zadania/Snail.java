package blok2PodstawyAlgorytmow.zadania;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    /*
        array = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
        snail(array) #=> [1,2,3,6,9,8,7,4,5]

        array = [[1,2,3],
                 [8,9,4],
                 [7,6,5]]
        snail(array) #=> [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        int[][] arr3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[][] arr4 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
        };
        int[][] arr5 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        snail(arr4);
    }
    public static void snail(int[][] arr){
        int iteratorXen=arr[0].length-1;
        int iteratorXbg=0;
        int iteratorYen=arr.length-1;
        int iteratorYbg=0;
        List<Integer> result = new ArrayList<>();

        int correctX = 0;
        int correctY = 0;
        //correct jest dla nie symetrycznych tablic np: 3 na 5
        if(iteratorXen>iteratorYen){
            correctX=iteratorXen-iteratorYen;
        }
        else if(iteratorXen<iteratorYen) {
            correctY=iteratorYen-iteratorXen;
        }
        while(true) {
            for (int i = iteratorXbg; i <= iteratorXen; i++) {
                result.add(arr[iteratorYbg][i]);
            }
            if(iteratorYbg+correctY==iteratorYen&&iteratorXen==iteratorXbg+correctX) break;
            iteratorYbg++;

            for (int i = iteratorYbg; i <= iteratorYen; i++) {
                result.add(arr[i][iteratorXen]);
            }
            if(iteratorYbg+correctY==iteratorYen&&iteratorXen==iteratorXbg+correctX) break;
            iteratorXen--;

            for (int i = iteratorXen; i >= iteratorXbg; i--) {
                result.add(arr[iteratorYen][i]);
            }
            if(iteratorYbg+correctY==iteratorYen&&iteratorXen==iteratorXbg+correctX) break;
            iteratorYen--;

            for (int i = iteratorYen; i >= iteratorYbg; i--) {
                result.add(arr[i][iteratorXbg]);
            }
            if(iteratorYbg+correctY==iteratorYen&&iteratorXen==iteratorXbg+correctX) break;
            iteratorXbg++;

        }
        System.out.println(result.toString());
    }


}
