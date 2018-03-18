package game.oldGame_ble;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random gen = new Random();

        Creature[] BlueTeam = {new Heroes(gen.nextInt(50),gen.nextInt(50),gen.nextInt(50),true,gen.nextInt(5)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2))
        };
        Creature[] RedTeam = {new Heroes(gen.nextInt(50),gen.nextInt(50),gen.nextInt(50),true,gen.nextInt(5)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2)),
                new Monster(gen.nextInt(10),gen.nextInt(10),gen.nextInt(10),true,gen.nextInt(2))
        };

        System.out.println("BlueTeam");
        for (int i = 0; i < 5; i++) {
            System.out.println("Attack: " + BlueTeam[i].attack() + " Defence: " + BlueTeam[i].defense() + " Live: " + BlueTeam[i].getHealth());
        }
        System.out.println("RedTeam");
        for (int i = 0; i < 5; i++) {
            System.out.println("Attack: " + RedTeam[i].attack() + " Defence: " + RedTeam[i].defense() + " Live: " + RedTeam[i].getHealth());
        }
    }




}
