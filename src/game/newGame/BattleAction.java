package game.newGame;

import java.util.List;

public class BattleAction {


    public static boolean[] singleAttackInFightOneOnOne(Monster monster1, Monster monster2) {
        int initiative = getIniative(monster1.getBasicSpeed(),monster2.getBasicSpeed());
        int demage1;
        int demage2;


        if(initiative==1){
            demage1=monster1.attack(monster2);
            monster2.setHealth(monster2.getHealth()-demage1);
            if(monster2.isAlive()){
                demage2=monster2.attack(monster1);
                monster1.setHealth(monster1.getHealth()-demage2);
            }
        }
        else if(initiative==2){
            demage2=monster2.attack(monster1);
            monster1.setHealth(monster1.getHealth()-demage2);
            if(monster1.isAlive()){
                demage1=monster1.attack(monster2);
                monster2.setHealth(monster2.getHealth()-demage1);
            }
        }
        else{
            demage1=monster1.attack(monster2);
            demage2=monster2.attack(monster1);
            monster1.setHealth(monster1.getHealth()-demage2);
            monster2.setHealth(monster2.getHealth()-demage1);
        }
        boolean[] whoDied = {monster1.isAlive(),monster2.isAlive()};
        return whoDied;
    }

    public static boolean[] singleAttackInTeamOnOne(Monster monster1, Monster monster2,int bonus) {
        int demage1;
        int demage2;
        int bonusTemp=1+bonus*10;

        demage1=monster1.attack(monster2)+bonusTemp;
        monster2.setHealth(monster2.getHealth()-demage1);
        if(monster2.isAlive()){
            demage2=monster2.attack(monster1)/(2*bonus);
            monster1.setHealth(monster1.getHealth()-demage2);
        }
        boolean[] whoDied = {monster1.isAlive(),monster2.isAlive()};
        return whoDied;
    }

    public static int getIniative(int speed1, int speed2) {
        if(speed1>speed2){
            return 1;
        }
        else if(speed1<speed2){
            return 2;
        }
        else{
            return 0;
        }
    }

    public static void fightOneOnOne(Monster monster1, Monster monster2){
        boolean[] result;
        do{
            result = singleAttackInFightOneOnOne(monster1,monster2);
            System.out.println(result[0]+" : "+result[1]);
        }while(result[0]&&result[1]);
    }

    public static void fightTeamVsTeam(List<Monster> teamOne, List<Monster> teamTwo){ //TODO cos nie dziala
        int sizeOfTeamOne = teamOne.size();
        int sizeOfTeamTwo = teamTwo.size();
        int numberOfOneOnOne = Math.max(sizeOfTeamOne,sizeOfTeamTwo);
        boolean teamEqual = sizeOfTeamOne == sizeOfTeamTwo ? true : false ;
        boolean whichTeamIsBigger = sizeOfTeamOne>sizeOfTeamTwo ? true : false;
        boolean whoDied[];
        boolean isSomeoneDead=false;

        do {
            for (int i = 0; i < numberOfOneOnOne - 1; i++) {
                whoDied = singleAttackInFightOneOnOne(teamOne.get(i), teamTwo.get(i));
                if(!(whoDied[0]&&whoDied[1])){
                    isSomeoneDead=true;
                    if(whoDied[0]) removeFromTeam(teamOne,i);
                    if(whoDied[1]) removeFromTeam(teamTwo,i);
                }
            }
            if(!teamEqual) {
                if (whichTeamIsBigger) {
                    for (int i = 0; i < sizeOfTeamOne - numberOfOneOnOne; i++) {
                        whoDied = singleAttackInTeamOnOne(teamOne.get(i + numberOfOneOnOne), teamTwo.get(i), i);
                        if (!(whoDied[0] && whoDied[1])) {
                            isSomeoneDead = true;
                            if(whoDied[0]) removeFromTeam(teamOne,i);
                            if(whoDied[1]) removeFromTeam(teamTwo,i);
                        }
                    }
                } else {
                    for (int i = 0; i < sizeOfTeamTwo - numberOfOneOnOne; i++) {
                        whoDied = singleAttackInTeamOnOne(teamTwo.get(i + numberOfOneOnOne), teamOne.get(i), i);
                        if (!(whoDied[0] && whoDied[1])) {
                            isSomeoneDead = true;
                            if(whoDied[0]) removeFromTeam(teamOne,i);
                            if(whoDied[1]) removeFromTeam(teamTwo,i);
                        }
                    }
                }
            }
        }while(!isSomeoneDead);

        fightTeamVsTeam(teamOne,teamTwo);
    }

    private static void removeFromTeam(List<Monster> team, int index) {
        team.remove(index);
    }
}
