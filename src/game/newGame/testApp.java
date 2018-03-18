package game.newGame;

public class testApp {


    public static void main(String[] args) {
        Monster skeleton = new Skeleton(10,10,10,10,10);
        Monster zombie = new Zombie(10,10,10,10,10,10);
        Monster soldier = new Soldier(10,10,10,10);
        Monster knight = new Knight(10,10,10,10,10,10,10);
        Monster[] blueTeam = {skeleton,zombie};
        Monster[] redTeam =  {soldier,knight};
        boolean[] result1;
        boolean[] result2;
        for (int i = 0; i <2; i++) {
            result1= BattleAction.Attack(knight,zombie);
            result2= BattleAction.Attack(skeleton,soldier);
            System.out.println("wynik1 "+result1[0]+" : "+result2[0]);
            System.out.println("wynik2 "+result1[1]+" : "+result2[1]);
        }



    }

}
