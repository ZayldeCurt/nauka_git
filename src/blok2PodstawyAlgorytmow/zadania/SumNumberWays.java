package blok2PodstawyAlgorytmow.zadania;

import org.assertj.core.api.Assertions;

public class SumNumberWays {
    /*
        https://en.wikipedia.org/wiki/Partition_(number_theory)#
        In number theory and combinatorics, a partition of a positive integer n, also called an integer partition,
        is a way of writing n as a sum of positive integers. Two sums that differ only in the order of their summands
        are considered the same partition. If order matters, the sum becomes a composition. For example, 4 can be partitioned
        in five distinct ways:
        4
        3 + 1
        2 + 2
        2 + 1 + 1
        1 + 1 + 1 + 1
     */
    public static void main(String[] args) {
//        Assertions.assertThat(sumWays(1)).isEqualTo(1); // 1
//        Assertions.assertThat(sumWays(2)).isEqualTo(2); // 2  -> 1+1 , 2
        Assertions.assertThat(sumWays(3)).isEqualTo(3); // 3 -> 1+1+1, 1+2, 3
//        Assertions.assertThat(sumWays(4)).isEqualTo(5); // 5 -> 1+1+1+1, 1+1+2, 1+3, 2+2, 4
        Assertions.assertThat(sumWays(5)).isEqualTo(7); // 7 -> 1+1+1+1+1, 1+1+1+2, 1+1+3, 1+4, 1+2+2, 2+3, 5
        Assertions.assertThat(sumWays(10)).isEqualTo(42);
        Assertions.assertThat(sumWays(50)).isEqualTo(204226);
        Assertions.assertThat(sumWays(80)).isEqualTo(15796476);
        Assertions.assertThat(sumWays(100)).isEqualTo(190569292);
        Assertions.assertThat(sumWays(-1)).isEqualTo(0); // 0
    }


    public static int sumWays(int number) {
       return  sumWays(number, number);
    }
    public static int sumWays(int number, int count,String st) {
        int sum=0;
        if (number == 0) {
//            System.out.println(st);
            return 1;
        }
        if(count>number){
            for (int i = number; i >= 1; i--) {
                sum += sumWays(number-i, i,st + " " + i);
            }
        }
        else{
            for (int i = count; i >= 1; i--) {
                sum += sumWays(number-i, i,st + " " + i);
            }
        }
        return sum;
    }
    public static int sumWays(int number, int count) {
        int sum=0;
        if (number == 0) {
            return 1;
        }
        if(count>number){
            for (int i = number; i >= 1; i--) {
                sum += sumWays(number-i, i);
            }
        }
        else{
            for (int i = count; i >= 1; i--) {
                sum += sumWays(number-i, i);
            }
        }
        return sum;
    }
}
