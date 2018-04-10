package artificial_neural_network;

public class Perceptron {

    private int x1;
    private int x2;
    private int w;
    private int vx1;
    private int vx2;

    public int getVx1() {
        return vx1;
    }

    public void setVx1(int vx1) {
        this.vx1 = vx1;
    }

    public int getVx2() {
        return vx2;
    }

    public void setVx2(int vx2) {
        this.vx2 = vx2;
    }

    public Perceptron() {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getW() {

        w= vx1 * x1 + vx2 * x2;
        return w>0 ? 1:0;
    }

}
