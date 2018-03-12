package opp.game;

public class Monster implements Creature {

    private int basicAttack;
    private int basicDefensce;
    private int Health;
    private boolean live;
    private int fear;

    public Monster(int basicAttack, int basicDefensce, int health, boolean live, int fear) {
        this.basicAttack = basicAttack;
        this.basicDefensce = basicDefensce;
        Health = health;
        this.live = live;
        this.fear = fear;
    }

    public int terror(){
        return fear;
    }

    @Override
    public int attack() {
        return basicAttack*fear;
    }

    @Override
    public int defense() {
        return basicDefensce*fear;
    }

    @Override
    public int getHealth() {
        return Health;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
