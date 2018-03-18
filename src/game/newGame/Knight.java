package game.newGame;

public class Knight extends Monster{

    private int extraSpeed;
    private int extraDefensce;
    private int extraAtack;

    public Knight(int basicSpeed, int basicDefensce, int basicAttack, double Health, int extraSpeed, int extraDefensce, int extraAtack) {
        super(basicSpeed, basicDefensce, basicAttack, Health);
        this.extraSpeed = extraSpeed;
        this.extraDefensce = extraDefensce;
        this.extraAtack = extraAtack;
    }

    //    public Knight(int basicSpeed, int basicDefensce, int basicAttack, double basicHealth) {
//        super(basicSpeed, basicDefensce, basicAttack, basicHealth);
//    }
    public int attack(){
        return getBasicAttack()*extraAtack;
    }
    public int defense(){
        return getBasicDefensce()*extraDefensce;
    }
    public int run(){
        return getBasicSpeed()*extraSpeed;
    }

}
