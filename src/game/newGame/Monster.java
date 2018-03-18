package game.newGame;

public abstract class Monster {

    private int basicSpeed;
    private int basicDefensce;
    private int basicAttack;
    private double Health;

    protected Monster(int basicSpeed, int basicDefensce, int basicAttack, double Health) {
        this.basicSpeed = basicSpeed;
        this.basicDefensce = basicDefensce;
        this.basicAttack = basicAttack;
        this.Health = Health;
    }


    protected int attack(){
        return basicAttack;
    }
    protected int run(){
        return basicSpeed;
    }
    protected int defense() {
        return basicDefensce;
    }
    protected boolean isAlive() {
        if(Health >0){
            return true;
        }
        else{
            return false;
        }
    }



    protected int getBasicSpeed() {
        return basicSpeed;
    }
    protected void setBasicSpeed(int basicSpeed) {
        this.basicSpeed = basicSpeed;
    }
    protected int getBasicDefensce() {
        return basicDefensce;
    }
    protected void setBasicDefensce(int basicDefensce) {
        this.basicDefensce = basicDefensce;
    }
    protected int getBasicAttack() {
        return basicAttack;
    }
    protected void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }
    protected double getHealth() {
        return Health;
    }
    protected void setHealth(double health) {
        this.Health = health;
    }



}
