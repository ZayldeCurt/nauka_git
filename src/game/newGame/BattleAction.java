package game.newGame;

public class BattleAction {
    public static boolean[] Attack(Monster monster1, Monster monster2)
    {
        double demage1 = monster1.attack()/(monster2.defense()*0.1);
        double demage2 = monster2.attack()/(monster1.defense()*0.1);

        monster2.setHealth(monster2.getHealth()-demage1);
        monster1.setHealth(monster1.getHealth()-demage2);

        boolean[] whoDied = {monster1.isAlive(),monster2.isAlive()};
        return whoDied;
    }
}
