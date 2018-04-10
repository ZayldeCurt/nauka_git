package artificial_neural_network;

public class Main {


    public static void main(String[] args) {
        Perceptron perceptron1= new Perceptron();
        Perceptron perceptron2= new Perceptron();
        Perceptron perceptron3= new Perceptron();

        perceptron2.setVx1(1);
        perceptron2.setVx2(1);
        perceptron3.setVx1(1);
        perceptron3.setVx2(1);

        int[] wej= {1,-3,3,4};

        perceptron2.setX1(wej[0]);
        perceptron2.setX2(wej[1]);
        perceptron3.setX1(wej[2]);
        perceptron3.setX2(wej[3]);

        perceptron1.setVx1(1);
        perceptron1.setVx2(1);

        perceptron1.setX1(perceptron2.getW());
        perceptron1.setX2(perceptron3.getW());

        int wyj= perceptron1.getW();

    }
}
