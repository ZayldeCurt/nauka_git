package geometria;

public class cPunkt2D
{
    public cPunkt2D() {
    }

    public cPunkt2D(int polozenieX, int polozenieY) {

        this.polozenieX = polozenieX;
        this.polozenieY = polozenieY;
    }

    private int polozenieX;
    private int polozenieY;

    public void setPolozenieX(int polozenieX) {
        this.polozenieX = polozenieX;
    }
    public void setPolozenieY(int polozenieY) {
        this.polozenieY = polozenieY;
    }

    public int getPolozenieX() {
        return polozenieX;
    }
    public int getPolozenieY() {
        return polozenieY;
    }

    @Override
    public String toString() {
        return "cPunkt2D{" +
                "polozenieX=" + polozenieX +
                ", polozenieY=" + polozenieY +
                '}';
    }
}
