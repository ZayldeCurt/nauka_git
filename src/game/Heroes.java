package game;

public class Heroes implements Creature{
    private int basicAttack;
    private int basicDefensce;
    private int Health;
    private boolean live;
    private int courage;

    public Heroes(int basicAttack, int basicDefensce, int health, boolean live, int courage) {
        this.basicAttack = basicAttack;
        this.basicDefensce = basicDefensce;
        Health = health;
        this.live = live;
        this.courage = courage;
    }

    public int courage(){
        return courage;
    }

    @Override
    public int attack() {
        return basicAttack*courage*Health;
    }

    @Override
    public int defense() {
        return basicDefensce*courage*Health;
    }

    @Override
    public int getHealth() {
        return Health;
    }

    @Override
    public boolean isAlive() {
        return live;
    }
}
