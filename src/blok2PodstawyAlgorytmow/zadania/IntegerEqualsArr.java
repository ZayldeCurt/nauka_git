package blok2PodstawyAlgorytmow.zadania;

import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class IntegerEqualsArr {
    public static void main(String[] args) {
        // index where sum of left side equals right side
        // returns 3
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        Assertions.assertThat(arrayDivider(arr1)).isEqualTo(3);
        // returns 1
        int[] arr2 = {1, 100, 50, -51, 1, 1};
        Assertions.assertThat(arrayDivider(arr2)).isEqualTo(1);
        // returns 0
        int[] arr3 = {20, 10, -80, 10, 10, 15, 35};
        Assertions.assertThat(arrayDivider(arr3)).isEqualTo(0);
        // return -1
        int[] arr4 = {1, 2, 3, 4};
        Assertions.assertThat(arrayDivider(arr4)).isEqualTo(-1);
    }
    public static int arrayDivider(int[] array){
        int sumOfLeft=0;
        int sumOfRight= Arrays.stream(array).sum()-array[0];
        int count=0;

        while(count < array.length-1 && sumOfLeft!=sumOfRight){

            sumOfLeft += array[count];
            sumOfRight -= array[count+1];
            count++;

        }

        return sumOfLeft==sumOfRight ? count : -1;
    }
}
