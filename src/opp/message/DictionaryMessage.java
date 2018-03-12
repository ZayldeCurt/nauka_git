package opp.message;

import java.util.Random;

public class DictionaryMessage implements Message {
    private String[] dictionary;
    private Random generator;

    public DictionaryMessage() {
        //wywołanie innego konstruktora
        this(new String[]{"Adam","Leopold","Jan","Ewa","Kunegunda","Monika","Sebastian","Grażyna","Weronika","Klemens"});
    }
    public DictionaryMessage(String[] dictionary) {
        this.dictionary = dictionary;
        this.generator = new Random();
    }

    @Override
    public String getMessage() {
        return getRandomMessage();
    }

    private String getRandomMessage() {
        return dictionary[generator.nextInt(dictionary.length)];
    }
}

