package geometria;

public class cKwadrat extends cProsta
{
    public cKwadrat() {
    }

    public cKwadrat(int szerokosc, int dlugosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }


    public cKwadrat(int polozenieX, int polozenieY, int polozenieX2, int polozenieY2, int szerokosc, int dlugosc) {
        super(polozenieX, polozenieY, polozenieX2, polozenieY2);
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }

    private int szerokosc;
    private int dlugosc;

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "cKwadrat{" +
                "szerokosc=" + szerokosc +
                ", dlugosc=" + dlugosc +
                '}';
    }
}
