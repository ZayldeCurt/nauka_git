package blok2PodstawyAlgorytmow.mazeSolver;

public class MazeGenerate {

//    public static int[][] mazeGenerate(int width, int higth){
//
//
//
//
//        return {{1,1,1,1}{1,1,1,1}};
//    }
    public static String mamsd(double n){
        return String.format("%.2f",n);
    }
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double temp=0;
        for(int i=0;i<n;i++){
            temp+=(1.0/(1.0+i*3.0));
        }

        return String.format("%.2f", temp);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
