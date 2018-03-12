package opp.message;

import java.util.Random;

public class RandomMessage implements Message {

    private Random generator;
    private int offset;
    private int bound;


    public RandomMessage(int offset, int bound) {
        this.bound=bound;
        this.offset=offset;
        this.generator = new Random();
    }

    @Override
    public String getMessage() {
        return String.valueOf(generator.nextInt(bound)+offset);
    }

    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getBound() {
        return bound;
    }
    public void setBound(int bound) {
        this.bound = bound;
    }



}
