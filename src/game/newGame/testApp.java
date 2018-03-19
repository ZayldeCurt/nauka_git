package game.newGame;

public class testApp {


    public static void main(String[] args) {
        Monster skeleton = new Skeleton(10,10,10,10,10);
        Monster zombie = new Zombie(10,10,15,10,10,10);
        Monster soldier = new Soldier(10,10,10,10);
        Monster knight = new Knight(10,10,15,10,10,10,10);
        Monster[] blueTeam = {skeleton,zombie};
        Monster[] redTeam =  {soldier,knight};
        boolean[] result1;
        boolean[] result2;


        result1=BattleAction.fightOneOnOne(zombie,knight);
        System.out.println(result1[0]+" : "+result1[1]);
        BattleAction.fightOneOnOne(zombie,knight);
        System.out.println(result1[0]+" : "+result1[1]);
        result1=BattleAction.fightOneOnOne(zombie,knight);
        System.out.println(result1[0]+" : "+result1[1]);
        BattleAction.fightOneOnOne(zombie,knight);
        System.out.println(result1[0]+" : "+result1[1]);


    }

}
