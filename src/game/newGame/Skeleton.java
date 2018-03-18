package game.newGame;

public class Skeleton extends Monster  {

    private int extraHealth;

    public Skeleton(int basicSpeed, int basicDefensce, int basicAttack, int basicHealth, int extraHealth) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
        this.extraHealth = extraHealth;
    }

    @Override
    public boolean isAlive() {
        if(getBasicHealth()>(0-extraHealth)){
            return true;
        }
        else{
            return false;
        }
    }

    public int getExtraHealth() {
        return extraHealth;
    }

    public void setExtraHealth(int extraHealth) {
        this.extraHealth = extraHealth;
    }
}