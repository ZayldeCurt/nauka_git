package blok2PodstawyAlgorytmow.zadania;

import org.assertj.core.api.Assertions;

import java.util.Arrays;


public class NextBiggerNumberSameDigits {
    public static void main(String[] args) {
        Assertions.assertThat(nextBiggerNumber(12)).isEqualTo(21);
        Assertions.assertThat(nextBiggerNumber(513)).isEqualTo(531);
        Assertions.assertThat(nextBiggerNumber(2017)).isEqualTo(7210);
        Assertions.assertThat(nextBiggerNumber(9)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(111)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(531)).isEqualTo(-1);
    }

    private static int nextBiggerNumber(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        Arrays.sort(chars);
        char[] temp = Arrays.copyOf(chars,chars.length);

        for (int i = 0; i < chars.length; i++) {
            chars[i]=temp[chars.length-1-i];
        }
        int sortetInts = Integer.parseInt(String.valueOf(chars));

        return sortetInts==number ? -1 : sortetInts;
    }

}
