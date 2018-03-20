package blok2PodstawyAlgorytmow.lekcja2;

public class zad4 {

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(fibonacci(40));
//        fibonacci(N-1)+fibonacci(N-2);
        long startTime = System.currentTimeMillis();


        for (int i = 0; i < 1000000; i++) {
            fibonacci(20);
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
//        fibonacci(10);
    }
    public static int factorial(int N){
        if(!(N==1)) {
            return factorial(N-1)*N;
        }
        else{
            return 1;
        }
    }
    public static int fibonacci(int N){
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        int temp=fibonacci(N-1)+fibonacci(N-2);
//        System.out.println(temp);
        return temp;
    }
}

