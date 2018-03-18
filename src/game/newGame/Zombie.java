package game.newGame;

public class Zombie extends Monster{

    private int extraSlow;
    private int extraDefense;

    public Zombie(int basicSpeed, int basicDefensce, int basicAttack, int basicHealth, int extraSlow, int extraDefense) {
        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
        this.extraSlow = extraSlow;
        this.extraDefense = extraDefense;
    }

    public int defense() {
        return super.defense()*extraDefense;
    }
    public int run(){
        return super.run()*extraSlow;
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
