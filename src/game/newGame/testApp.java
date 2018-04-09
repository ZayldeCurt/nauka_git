package game.newGame;

import java.util.ArrayList;
import java.util.List;

public class testApp {


    public static void main(String[] args) {
        Monster skeleton = new Skeleton(10,10,10,10,10);
        Monster zombie = new Zombie(10,10,15,10,10,10);
        Monster soldier = new Soldier(10,10,10,10);
        Monster knight = new Knight(10,10,15,10,10,10,10);

        List<Monster> blueTeam = new ArrayList<>();
        List<Monster> redTeam = new ArrayList<>();

        blueTeam.add(skeleton);
        blueTeam.add(zombie);
        redTeam.add(soldier);
        redTeam.add(knight);

        while(true){
            BattleAction.fightOneOnOne(knight,zombie);
        }


//            BattleAction.fightTeamVsTeam(blueTeam,redTeam);
//        BattleAction.fightOneOnOne(zombie,knight);

    }

}
