package opp.shapes;

public class Rectangle implements Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int field() {
        return a*a;
    }
    public int circuit(){
        return 4*a;
    }
    public double diagonal(){
        return Math.sqrt(a^2+b^2);
    }

}
