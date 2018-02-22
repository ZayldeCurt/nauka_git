package geometria;

public class cProsta extends cPunkt2D
{
    public cProsta() {
    }

    public cProsta(int polozenieX2, int polozenieY2) {
        this.polozenieX2 = polozenieX2;
        this.polozenieY2 = polozenieY2;
    }

    public cProsta(int polozenieX, int polozenieY, int polozenieX2, int polozenieY2) {
        super(polozenieX, polozenieY);
        this.polozenieX2 = polozenieX2;
        this.polozenieY2 = polozenieY2;
    }


    private int polozenieX2;
    private int polozenieY2;

    public int getPolozenieX2() {
        return polozenieX2;
    }
    public int getPolozenieY2() {
        return polozenieY2;
    }

    public void setPolozenieX2(int polozenieX2) {
        this.polozenieX2 = polozenieX2;
    }
    public void setPolozenieY2(int polozenieY2) {
        this.polozenieY2 = polozenieY2;
    }
}
