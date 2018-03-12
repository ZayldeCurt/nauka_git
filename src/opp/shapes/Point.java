package opp.shapes;

public class Point {
    private int positionX;
    private int positionY;
    private String Colour;

    public Point() {
    }

    public Point(int positionX, int positionY, String colour) {
        this.positionX = positionX;
        this.positionY = positionY;
        Colour = colour;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }




}
