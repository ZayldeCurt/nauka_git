package game.newGame;

public class testApp {


    public static void main(String[] args) {
        Monster skeleton = new Skeleton(10,10,10,10,10);
        Monster zombie = new Zombie(10,10,10,10,10,10);

        Monster[] blueTeam = {skeleton,zombie};
        boolean[] result;

        for (int i = 0; i <10; i++) {
            result= BattleAction.Attack(skeleton,zombie);
            System.out.println(result[0]+" : "+result[1]);
        }



    }

}
