package geometria;

public class cDziedziczenieUI {

    public static void main(String[] args)
    {
        cPunkt2D pozycja = new cPunkt2D(2,3);
        cPunkt2D pozycja2 = new cPunkt2D();

        pozycja.setPolozenieX(10);
        pozycja.setPolozenieY(20);

        cProsta prosta = new cProsta(10,10,20,20);

        System.out.println(prosta.getPolozenieX() + " " + prosta.getPolozenieX2() + " " + prosta.getPolozenieY() + " "+ prosta.getPolozenieY2() + " ");

        cKwadrat kwadrat = new cKwadrat(1,2,1,4,10,20);
        System.out.println(kwadrat.toString());

    }
}
