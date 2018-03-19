package game.newGame;

public class BattleAction {
    public static boolean[] Attack(Monster monster1, Monster monster2)
    {
        int[] initiative = iniative(monster1.getBasicSpeed(),monster2.getBasicSpeed());
        double demage1=0;
        double demage2=0;

        for (int i = 0; i < initiative[0]; i++) {
            demage1 += monster1.attack()-(monster2.defense()*0.1);
        }
        for (int i = 0; i < initiative[1]; i++) {
            demage2 += monster2.attack()-(monster1.defense()*0.1);
        }
        if(demage1<0) demage1=0;
        if(demage2<0) demage2=0;
        monster2.setHealth(monster2.getHealth()-demage1);
        monster1.setHealth(monster1.getHealth()-demage2);

        boolean[] whoDied = {monster1.isAlive(),monster2.isAlive()};
        return whoDied;
    }

    public static int[] iniative(int speed1, int speed2)
    {
        int[] initiative = {1,1};

        double ratioOf = speed1/(speed2*1.0);
        if(ratioOf>2){
            initiative[0] = 3;
        }
        else if(ratioOf<0.5){
            initiative[1]=3;
        }
        else if(ratioOf>1){
            initiative[0] = 2;
        }
        else if(ratioOf<1){
            initiative[1] = 2;
        }


        return initiative;
    }
}
