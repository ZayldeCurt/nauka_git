package game.newGame;

public class Soldier extends Monster {

    public Soldier(int basicSpeed, int basicDefensce, int basicAttack, double basicHealth) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
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
        return getBasicSpeed();
    }

    @Override
    protected int defense() {
        return getBasicDefensce();
    }
}
