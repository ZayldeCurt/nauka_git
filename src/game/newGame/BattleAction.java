package game.newGame;

public class BattleAction {
    public static boolean[] Attack(Monster monster1, Monster monster2)
    {


        boolean[] whoDied = {monster1.isAlive(),monster2.isAlive()};
        return whoDied;
    }
}
