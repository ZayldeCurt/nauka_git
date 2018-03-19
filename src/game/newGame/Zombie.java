package game.newGame;

public class Zombie extends Monster{

    private int extraSlow;
    private int extraDefense;

    public Zombie(int basicSpeed, int basicDefensce, int basicAttack, int basicHealth, int extraSlow, int extraDefense) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
        this.extraSlow = extraSlow;
        this.extraDefense = extraDefense;
    }
    @Override
    public int defense() {
        return this.getBasicDefensce()+extraDefense;
    }

    @Override
    public int attack(Monster monster){
        int demage;
        int currentAttack;

        currentAttack = this.getBasicAttack()   ;
        demage = currentAttack-monster.defense();
        return demage<0 ? 0 : demage;
    }
    @Override
    public int run(){
        return this.getBasicSpeed()-extraSlow;
    }

    public int getExtraSlow() {
        return extraSlow;
    }
    public void setExtraSlow(int extraSlow) {
        this.extraSlow = extraSlow;
    }
    public int getExtraDefense() {
        return extraDefense;
    }
    public void setExtraDefense(int extraDefense) {
        this.extraDefense = extraDefense;
    }


}
