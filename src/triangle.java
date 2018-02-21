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

    public double bokA;
    public double bokB;
    public double bokC;
    public double Obwod;

    void oblicz_przeciwprostokatna()
    {
        this.bokC = Math.sqrt(Math.pow(bokA,2)+Math.pow(bokB,2));
    }
    void oblicz_obwod()
    {
        if(defaultBokC)
        {
            defaultBokC=false;
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
