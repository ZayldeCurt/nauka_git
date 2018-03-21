package game.newGame;

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
//            System.out.println(result[0]+" : "+result[1]);
        }while(result[0]&&result[1]);
    }

    public static void fightTeamVsTeam(Monster[] teamOne, Monster[] teamTwo){ //TODO przerobic to na liste, bo jest problem przy usuwaniu potwora gdy zginie
        int sizeOfTeamOne = teamOne.length;
        int sizeOfTeamTwo = teamTwo.length;
        int numberOfOneOnOne = Math.max(sizeOfTeamOne,sizeOfTeamTwo);
        boolean teamEqual = sizeOfTeamOne == sizeOfTeamTwo ? true : false ;
        boolean whichTeamIsBigger = sizeOfTeamOne>sizeOfTeamTwo ? true : false;
        boolean whoDied[];
        boolean isSomeoneDead=false;

        do {
            for (int i = 0; i < numberOfOneOnOne - 1; i++) {
                whoDied = singleAttackInFightOneOnOne(teamOne[i], teamTwo[i]);
                if(!(whoDied[0]&&whoDied[1])){
                    isSomeoneDead=true;
                    if(whoDied[0]) removeFromTeam(teamOne);
                    if(whoDied[1]) removeFromTeam(teamTwo);
                }
            }
            if(!teamEqual) {
                if (whichTeamIsBigger) {
                    for (int i = 0; i < sizeOfTeamOne - numberOfOneOnOne; i++) {
                        whoDied = singleAttackInTeamOnOne(teamOne[i + numberOfOneOnOne], teamTwo[i], i);
                        if (!(whoDied[0] && whoDied[1])) {
                            isSomeoneDead = true;
                            if(whoDied[0]) removeFromTeam(teamOne);
                            if(whoDied[1]) removeFromTeam(teamTwo);
                        }
                    }
                } else {
                    for (int i = 0; i < sizeOfTeamTwo - numberOfOneOnOne; i++) {
                        whoDied = singleAttackInTeamOnOne(teamTwo[i + numberOfOneOnOne], teamOne[i], i);
                        if (!(whoDied[0] && whoDied[1])) {
                            isSomeoneDead = true;
                            if(whoDied[0]) removeFromTeam(teamOne);
                            if(whoDied[1]) removeFromTeam(teamTwo);
                        }
                    }
                }
            }
        }while(!isSomeoneDead);

        fightTeamVsTeam(teamOne,teamTwo);//TODO trzeba dodac usuwanie z druzyny
    }

    private static void removeFromTeam(Monster[] teamOne) {

    }
}
