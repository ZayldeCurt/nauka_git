package blok2PodstawyAlgorytmow.zadania;

public class silnia {
    public static void main(String[] args) {
        try{
            System.out.println(silnia(-1));
        } catch (IllegalArgumentException ex){
            String message = ex.getMessage();
            System.out.println("Cannot calculate "+message);
        }

    }
    public static int silnia(int n){
        if(n<0) {
            throw new IllegalArgumentException("Argument cannot be less than zero");
        }
        return n==1 ? 1 : silnia(n-1)*n;
    }

}
