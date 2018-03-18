package game.newGame;

public abstract class Monster {

    private int basicSpeed;
    private int basicDefensce;
    private int basicAttack;
    private int basicHealth;

    protected Monster(int basicSpeed, int basicDefensce, int basicAttack, int basicHealth) {
        this.basicSpeed = basicSpeed;
        this.basicDefensce = basicDefensce;
        this.basicAttack = basicAttack;
        this.basicHealth = basicHealth;
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
        if(basicHealth>0){
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
    protected int getBasicHealth() {
        return basicHealth;
    }
    protected void setBasicHealth(int basicHealth) {
        this.basicHealth = basicHealth;
    }



}
