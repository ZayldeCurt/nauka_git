package game.newGame;

public class Skeleton extends Monster  {
    private double extraHealth;

    public Skeleton(int basicSpeed, int basicDefensce, int basicAttack, double basicHealth, double extraHealth) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
        this.extraHealth = extraHealth;
    }

    @Override
    public int attack(Monster monster){
        int demage;
        int currentAttack;

        currentAttack = this.getBasicAttack();
        demage = currentAttack-monster.defense();
        return demage<0 ? 0 : demage;
    }

    @Override
    protected int run() {
        return 0;
    }

    @Override
    protected int defense() {
        return getBasicDefensce();
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