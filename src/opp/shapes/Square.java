package opp.shapes;

public class Square implements Shape, FourAngle {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int field() {
        return a*a;
    }
    public int circuit(){
        return 4*a;
    }
    public double diagonal(){
        return Math.sqrt(a^2+a^2);
    }

    @Override
    public void printAllSides() {

    }
}
