package blok2PodstawyAlgorytmow;

public class zad2NWD {

    public static void main(String[] args) {
        int a=32;
        int b=64;
        System.out.println(nwd(a,b));

    }


    public static int nwd(int number1, int number2){
        while(number1 !=number2){
            if(number1>number2){
                number1-=number2;
            }
            else{
                number2-=number1;
            }
        }
        return number1;
    }
}
