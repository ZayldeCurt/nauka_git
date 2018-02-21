import java.util.Scanner;

public class triangle {

    public triangle(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        defaultBokA=false;
        defaultBokB=false;
        defaultBokC=false;
    }
    public triangle() {
        this.bokA = 1;
        this.bokB = 1;
        this.bokC = 1;
        defaultBokA=true;
        defaultBokB=true;
        defaultBokC=true;
    }

    public boolean defaultBokA;
    public boolean defaultBokB;
    public boolean defaultBokC;
    public boolean defaultBok;


    public double bokA;
    public double bokB;
    public double bokC;
    public double Obwod;


    private void CheckDefault()
    {
        if(!defaultBokA&&!defaultBokB && !defaultBokC)
        {
            defaultBok=false;
            System.out.println("nie domyslne");
        }
        else
        {
            System.out.println("domyslne");
        }
    }

    public void PobierzBok()
    {
        int ilosc;
        System.out.println("ile bokow chcesz wpisac?");
        Scanner odczyt = new Scanner(System.in);
        odczyt = new Scanner(System.in);
        while(!odczyt.hasNextInt())
        {
            System.out.println("zle, jeszcze raz:");

        }
        ilosc=odczyt.nextInt();
        if (ilosc>3)
        {
            System.out.println("trojkat moze miec tylko trzy boki");
            ilosc=3;
        }


        System.out.println("podaj bok trójkąta");


        while(!odczyt.hasNextDouble())
        {
            System.out.println("zle, jeszcze raz:");
            //odczyt = new Scanner(System.in);
        }
        this.bokA = odczyt.nextDouble();
        this.defaultBokA=false;
        if(ilosc>=2)
        {
            System.out.println("podaj drugi bok trójkąta");


            while(!odczyt.hasNextDouble())
            {
                System.out.println("zle, jeszcze raz:");

            }
            this.bokB = odczyt.nextDouble();
            this.defaultBokB=false;
            if(ilosc==3)
            {
                System.out.println("podaj trzeci bok trójkąta");


                while(!odczyt.hasNextDouble())
                {
                    System.out.println("zle, jeszcze raz:");

                }
                this.bokC = odczyt.nextDouble();
                this.defaultBokC=false;
            }
        }

    }

    void oblicz_przeciwprostokatna()
    {
        if(defaultBokA||defaultBokB)
        {
            System.out.println("UWAGA! boki są domyslne");
        }
        this.bokC = Math.sqrt(Math.pow(bokA,2)+Math.pow(bokB,2));
        defaultBokC=false;
        System.out.println(bokC);
    }
    void oblicz_obwod()
    {
        if(defaultBokC)
        {

            oblicz_przeciwprostokatna();
        }
        this.Obwod=bokA+bokB+bokC;

    }
    public boolean Sprawdz_Czy_Prostokatny()
    {
        if(bokC == Math.sqrt(Math.pow(bokA,2)+Math.pow(bokB,2)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
