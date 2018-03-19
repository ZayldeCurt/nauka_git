package blok2PodstawyAlgorytmow.lekcja2;

import java.util.Stack;

public class zad2 {
    public static void main(String[] args) {

        Stack<Integer> st= new Stack<>();

        Integer number = 256;
        int temp=0;
        while(number>0){
            temp=number%2;
            st.push(temp);
            number/=2;
        }
        while (!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }




}
