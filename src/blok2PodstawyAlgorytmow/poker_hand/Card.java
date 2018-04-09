package blok2PodstawyAlgorytmow.poker_hand;

public class Card {
    private String nominal;
    private String color;
    private int value;

    public int getValue() {
        return value;
    }

    public Card(String card) {
        this.nominal = Character.toString(card.charAt(0));
        this.color = Character.toString(card.charAt(1));
        if(this.nominal.matches("[TJQKA]")){
            switch (nominal){
                case "A" :
                    this.value= 14;
                    break;
                case "K" :
                    this.value= 13;
                    break;
                case "Q" :
                    this.value= 12;
                    break;
                case "J" :
                    this.value= 11;
                    break;
                case "T" :
                    this.value= 10;
                    break;
            }
        }
        else
            this.value = Integer.parseInt(nominal);

    }

    public String getNominal() {
        return nominal;
    }

    public String getColor() {
        return color;
    }

}
