package game.newGame;

public class Skeleton extends Monster  {

    private double extraHealth;

    public Skeleton(int basicSpeed, int basicDefensce, int basicAttack, double basicHealth, double extraHealth) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
        this.extraHealth = extraHealth;
    }

    @Override
    public boolean isAlive() {
        if(getHealth()>(0-extraHealth)){
            return true;
        }
        else{
            return false;
        }
    }

    public double getExtraHealth() {
        return extraHealth;
    }

    public void setExtraHealth(double extraHealth) {
        this.extraHealth = extraHealth;
    }
}