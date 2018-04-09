package blok2PodstawyAlgorytmow.poker_hand;

import java.util.Arrays;

public class PokerHand {
    private Card first;
    private Card second;
    private Card third;
    private Card fourth;
    private Card fifth;


    public PokerHand(String hand) {

        String[] cards = hand.split(" ");

        this.first = new Card(cards[0]);
        this.second = new Card(cards[1]);
        this.third = new Card(cards[2]);
        this.fourth = new Card(cards[3]);
        this.fifth = new Card(cards[4]);
    }

    public Card getFirst() {
        return first;
    }
    public Card getSecond() {
        return second;
    }
    public Card getThird() {
        return third;
    }
    public Card getFourth() {
        return fourth;
    }
    public Card getFifth() {
        return fifth;
    }


    public int compare(PokerHand secondHand) {
        boolean isEqualColorFirst = isColorEqual(this);
        boolean isEqualColorSecond = isColorEqual(secondHand);
        boolean isStraightFirst  =isStraight(this);
        boolean isStraightSecond  =isStraight(secondHand);
        int highestCardFirst = highestCard(this);
        int highestCardSecond = highestCard(secondHand);


        if(isEqualColorFirst && isEqualColorSecond){
            if(isStraightFirst && isEqualColorSecond)
                return Integer.compare(highestCardFirst, highestCardSecond);
            else if(isStraightFirst)
                return 1;
            else if(isStraightSecond)
                return -1;
            else
                return compareOhter(secondHand);

        }

        return 0;
    }

    private int compareOhter(PokerHand secondHand) {

        return 0;
    }

    private int highestCard(PokerHand hand) {
        int[] cardNominal = {hand.first.getValue(),hand.second.getValue(),
                hand.third.getValue(),hand.fourth.getValue(),hand.fifth.getValue()};
        Arrays.sort(cardNominal);
        return cardNominal[0];
    }

    private boolean isStraight(PokerHand hand) {

        int[] cardNominal = {hand.first.getValue(),hand.second.getValue(),
                hand.third.getValue(),hand.fourth.getValue(),hand.fifth.getValue()};
        Arrays.sort(cardNominal);


        return cardNominal[0]==cardNominal[1]- 1
                && cardNominal[1]==cardNominal[2]- 1
                && cardNominal[2]==cardNominal[3]- 1
                && cardNominal[3]==cardNominal[4]- 1;

    }

    private boolean isColorEqual(PokerHand secondHand) {
        if(secondHand.first.getColor().equals(secondHand.second.getColor())
                && secondHand.first.getColor().equals(secondHand.third.getColor())
                && secondHand.first.getColor().equals(secondHand.third.getColor())
                && secondHand.first.getColor().equals(secondHand.fifth.getColor())){
            return true;
        }
        else
            return false;
    }
}
